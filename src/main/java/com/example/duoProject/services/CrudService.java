package com.example.duoProject.services;

import com.example.duoProject.entities.User;
import com.example.duoProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    public CrudService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public void delete(Long id) {
        // Находим сущность по её идентификатору
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            // Удаляем сущность, если она существует
            userRepository.delete(user);
        }
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public List<User> index() {
        List<User> users = userRepository.findAll();
        System.out.println("Пользователи добавлены");
        System.out.println(users);
        return users;
    }
    //SOSAL

    public User update(Long id, User user){
        return null;
    }
    //sozdal new branch

}
