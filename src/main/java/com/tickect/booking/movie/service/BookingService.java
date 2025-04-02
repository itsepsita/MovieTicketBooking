package com.ticket.booking.movie.service;

import java.util.Optional;

import com.ticket.booking.movie.model.Booking;


public interface BookingService {
	Booking createBooking(Booking booking);
    Optional<Booking> getBookingById(Long id);
}
