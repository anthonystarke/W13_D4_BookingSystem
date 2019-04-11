package com.codeclan.example.bookingsystem;

import com.codeclan.example.bookingsystem.Models.Booking;
import com.codeclan.example.bookingsystem.Models.Customer;
import com.codeclan.example.bookingsystem.Repositories.BookingRepository;
import com.codeclan.example.bookingsystem.Repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingsystemApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void canSaveCustomerToDB(){
		Customer customer1 = new Customer("John","Edi",50);
		customerRepository.save(customer1);
	}

	@Test
	public void canSaveBookingToDB(){
//		Customer customer1 = new Customer("John","Edi",50);
//		customerRepository.save(customer1);
//
//		Booking booking1 = new Booking("2019-10-10",customer1);
//		bookingRepository.save(booking1);

	}


}
