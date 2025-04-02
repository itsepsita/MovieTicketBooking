package com.ticket.booking.movie.service;

import java.util.Optional;

import com.ticket.booking.movie.model.User;

public interface UserService {
	User registerUser(User user);
    Optional<User> getUserById(Long id);
    void deleteUser(Long id);
}

