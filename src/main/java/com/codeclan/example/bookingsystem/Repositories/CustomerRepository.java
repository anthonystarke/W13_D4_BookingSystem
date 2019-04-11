package com.codeclan.example.bookingsystem.Repositories;

import com.codeclan.example.bookingsystem.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
