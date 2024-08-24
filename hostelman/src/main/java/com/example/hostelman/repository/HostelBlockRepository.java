package com.example.hostelman.repository;
import com.example.hostelman.entity.Hostel;
import com.example.hostelman.entity.HostelBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HostelBlockRepository extends JpaRepository<HostelBlock,Long>{

    HostelBlock findByName(String name);

    HostelBlock findById(long id);

   // List<HostelBlock> findByHostel(long id);

}
