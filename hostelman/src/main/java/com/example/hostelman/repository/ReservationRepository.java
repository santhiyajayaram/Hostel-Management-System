package com.example.hostelman.repository;
import com.example.hostelman.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByRoomId(Long roomId);

    List<Reservation> findByUserId(Long userId);

    List<Reservation> findByStatus(String status);

    List<Reservation> findAllUserById(Long userId);
}
