package com.example.hostelman.repository;
import com.example.hostelman.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    List<User> findByRole(String role);

    List<User> findByGender(String gender);

    List<User> findByEmail(String email);

    List<User> findById(int id);
}
