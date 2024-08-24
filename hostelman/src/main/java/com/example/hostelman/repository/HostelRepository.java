package com.example.hostelman.repository;
import com.example.hostelman.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public interface HostelRepository extends JpaRepository<Hostel, Long>{

    Hostel findByName(String name);

    Hostel findByLocation(String location);

}
