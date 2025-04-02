package com.ticket.booking.movie.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.booking.movie.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
