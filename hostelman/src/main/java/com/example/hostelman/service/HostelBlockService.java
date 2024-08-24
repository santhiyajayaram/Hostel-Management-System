package com.example.hostelman.service;
import com.example.hostelman.entity.HostelBlock;
import com.example.hostelman.repository.HostelBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class HostelBlockService {

    private final HostelBlockRepository hostelBlockRepository;
    @Autowired
    public HostelBlockService(HostelBlockRepository hostelBlockRepository){
        this.hostelBlockRepository = hostelBlockRepository;
    }

    public Optional<HostelBlock> findByHostelBlockId(Long id){
        return hostelBlockRepository.findById(id);
    }

    public boolean isPresent(long id){
        return !hostelBlockRepository.existsById(id);
    }

   // public List<HostelBlock> findAllHostelBlockByHostelId(long hostelId){
     //   return hostelBlockRepository.findByHostel(hostelId);
    //}

    public List<HostelBlock> findHostelBlocks(){
        return hostelBlockRepository.findAll();
    }

    public HostelBlock saveHostelBlock(HostelBlock hostelBlock){
        return hostelBlockRepository.save(hostelBlock);
    }

    public void deleteHostelBlockById(long id){
        hostelBlockRepository.deleteById(id);
    }

    //public List<HostelBlock> findHostelBlockById(long id) {
      //  return hostelBlockRepository.findByHostel(id);
    //}
}
