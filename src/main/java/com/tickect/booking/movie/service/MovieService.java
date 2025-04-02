package com.ticket.booking.movie.service;

import java.util.List;

import com.ticket.booking.movie.model.Movie;


public interface MovieService {
    List<Movie> getAllMovies();
    List<Movie> getMoviesByGenre(String genre);
    Movie getMovieById(Long id);
    Movie createMovie(Movie movie);
}
