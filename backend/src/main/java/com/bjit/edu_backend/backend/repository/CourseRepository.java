package com.bjit.edu_backend.backend.repository;

import com.bjit.edu_backend.backend.model.Course;
import com.bjit.edu_backend.backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
