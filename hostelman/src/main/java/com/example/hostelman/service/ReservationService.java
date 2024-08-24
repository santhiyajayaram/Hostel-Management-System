package com.example.hostelman.service;
import com.example.hostelman.entity.Reservation;
import com.example.hostelman.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAllReservations(){
        return reservationRepository.findAll();
    }

    public Optional<Reservation> findReservationById(long id){
        return reservationRepository.findById(id);
    }

    public List<Reservation> findReservationByRoomId(long roomId){
        return reservationRepository.findByRoomId(roomId);
    }

    public Reservation saveReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(long id){
        reservationRepository.deleteById(id);
    }

    public boolean reservationExists(long id) {
        return reservationRepository.existsById(id);
    }
}

