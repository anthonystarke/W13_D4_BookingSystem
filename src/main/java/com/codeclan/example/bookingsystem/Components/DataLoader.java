package com.codeclan.example.bookingsystem.Components;

import com.codeclan.example.bookingsystem.Models.Booking;
import com.codeclan.example.bookingsystem.Models.Course;
import com.codeclan.example.bookingsystem.Models.Customer;
import com.codeclan.example.bookingsystem.Repositories.BookingRepository;
import com.codeclan.example.bookingsystem.Repositories.CourseRepository;
import com.codeclan.example.bookingsystem.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Customer customer = new Customer("John", "edi",50);
        customerRepository.save(customer);

        Course course = new Course("Python","Edi",5);
        courseRepository.save(course);

        Booking booking = new Booking("2019-10-10",customer,course);
        bookingRepository.save(booking);


    }


}
