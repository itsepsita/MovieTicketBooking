package com.ticket.booking.movie.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.booking.movie.model.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByGenre(String genre);
}