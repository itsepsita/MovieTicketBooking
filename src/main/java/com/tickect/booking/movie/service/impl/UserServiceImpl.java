package com.ticket.booking.movie.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.booking.movie.model.User;
import com.ticket.booking.movie.repository.UserRepository;
import com.ticket.booking.movie.service.UserService;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    // Constructor Injection
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);  // Saves user in DB
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

