package com.example.hostelman.service;
import com.example.hostelman.entity.Room;
import com.example.hostelman.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    public Optional<Room> findRoomById(Long id){
        return roomRepository.findById(id);
    }

    public List<Room> findRoomsByStatus(String status){
        return roomRepository.findByStatus(status);
    }

    public void deleteRoomById(Long id){
        roomRepository.deleteById(id);
    }

    public Room saveRoom(Room room){
        return roomRepository.save(room);
    }

    public List<Room> findAllRooms(){
        return roomRepository.findAll();
    }
}
