package com.example.hostelman.controller;
import com.example.hostelman.entity.Room;
import com.example.hostelman.repository.RoomRepository;
import com.example.hostelman.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.w3c.dom.ls.LSInput;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms(){
        List<Room> rooms = roomService.findAllRooms();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Room> getRoomsById(@PathVariable long id){
        return roomService.findRoomById(id).map(room -> new ResponseEntity<>(room, HttpStatus.OK)).orElseGet(()->
                new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/status{status}")
    public ResponseEntity<List<Room>> roomsByStatus(@PathVariable String status){
        List<Room> rooms = roomService.findRoomsByStatus(status);
        return new ResponseEntity<>(rooms,HttpStatus.OK);
    }

}
