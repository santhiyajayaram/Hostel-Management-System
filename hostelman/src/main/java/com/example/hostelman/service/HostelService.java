package com.example.hostelman.service;
import com.example.hostelman.entity.Hostel;
import com.example.hostelman.repository.HostelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HostelService {
    private final HostelRepository hostelRepository;

    @Autowired
    public HostelService(HostelRepository hostelRepository){
        this.hostelRepository = hostelRepository;
    }

    public Optional<Hostel> findHostelById(Long id){
        return hostelRepository.findById(id);
    }

    public List<Hostel> getAllHostels(){
        return hostelRepository.findAll();
    }

    public boolean hostelExists(Long id){
        return hostelRepository.existsById(id);
    }

    public List<Hostel> findAllByHostels(){
        return hostelRepository.findAll();
    }

    public Hostel saveHostel(Hostel hostel){
        return hostelRepository.save(hostel);
    }

    public void deleteHostelById(long id){
        hostelRepository.deleteById(id);
    }

    public Hostel findHostelByName(String name){
        return hostelRepository.findByName(name);
    }
}
