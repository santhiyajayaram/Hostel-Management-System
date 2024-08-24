package com.example.hostelman.repository;
import com.example.hostelman.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByStatus(String status);

    List<Room> findByCapacity(int capacity);

   // List<Room> findByBlock_Id(int block_id);
}
