package com.codeclan.example.bookingsystem.Repositories;

import com.codeclan.example.bookingsystem.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
}
