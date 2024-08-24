package com.example.hostelman.controller;
import com.example.hostelman.entity.Hostel;
import com.example.hostelman.entity.HostelBlock;
import com.example.hostelman.repository.HostelRepository;
import com.example.hostelman.service.HostelBlockService;
import org.apache.catalina.Host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@RequestMapping("/api/hostel-blocks")
public class HostelBlockController {
    private final HostelBlockService hostelBlockService;

    @Autowired
    public HostelBlockController(HostelBlockService hostelBlockService){
        this.hostelBlockService = hostelBlockService;
    }

    @GetMapping
    public ResponseEntity<List<HostelBlock>> getAllHostelBlocks(){
        List<HostelBlock> hostelBlocks = hostelBlockService.findHostelBlocks();
        return new ResponseEntity<>(hostelBlocks,HttpStatus.OK);
    }

   /* @GetMapping("/hostel-id/{id}")
    public ResponseEntity<List<HostelBlock>> getBlocksByHostelId(@PathVariable long id){
        List<HostelBlock> block = hostelBlockService.findAllHostelBlockByHostelId(id);
        return new ResponseEntity<>(block, HttpStatus.OK);
    }*/

    @PostMapping("/hostel-id/{id}")
    public ResponseEntity<HostelBlock> createHostelBlock(@PathVariable HostelBlock hostelBlock){
        if(hostelBlockService.isPresent(hostelBlock.getBlock_id())){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        HostelBlock savedHostelBlock = hostelBlockService.saveHostelBlock(hostelBlock);
        return new ResponseEntity<>(savedHostelBlock,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HostelBlock> updateHostelBlock(@PathVariable long id, @RequestBody HostelBlockService hostelBlockService){
        HostelBlock hostelBlock = null;
        if(hostelBlockService.isPresent(id)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else if(id != hostelBlock.getBlock_id()){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        hostelBlock.setBlock_id(id);
        HostelBlock updatedHostelBlocks = hostelBlockService.saveHostelBlock(hostelBlock);
        return  new ResponseEntity<>(updatedHostelBlocks, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHostelBlock(@PathVariable long id){
        if(hostelBlockService.isPresent(id)){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        hostelBlockService.deleteHostelBlockById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
