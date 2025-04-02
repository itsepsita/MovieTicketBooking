package com.ticket.booking.movie.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long movieId;
    private String showtime;
    private int numberOfTickets;
    private String movieName;
    private String customerName;
    private int seats;
    

   
}
