package com.tickets.Movie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.ticket.booking.movie.MovieTicketBookingApplication;
import com.ticket.booking.movie.service.BookingService;
import com.ticket.booking.movie.service.MovieService;
import com.ticket.booking.movie.service.UserService;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(classes = MovieTicketBookingApplication.class)
class MovieApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

	@Autowired
	private UserService userService;

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private BookingService bookingService;

	@Test
	void userServiceBeanLoaded() {
		assertNotNull(userService, "UserService bean should be loaded in the context");
	}

	@Test
	void movieServiceBeanLoaded() {
		assertNotNull(movieService, "MovieService bean should be loaded in the context");
	}

	@Test
	void bookingServiceBeanLoaded() {
		assertNotNull(bookingService, "BookingService bean should be loaded in the context");
	}

}
