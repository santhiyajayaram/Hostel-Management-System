package com.example.hostelman.service;
import com.example.hostelman.entity.User;
import com.example.hostelman.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean isUserExists(long id){
        return userRepository.existsById(id);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

    public User findUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public Optional<User> findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public List<User> findByRole(String role){
        return userRepository.findByRole(role);
    }

    public List<User> findByGender(String gender){
        return userRepository.findByGender(gender);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
}
