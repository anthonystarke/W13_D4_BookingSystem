package com.codeclan.example.bookingsystem.Repositories;

import com.codeclan.example.bookingsystem.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
