package com.bjit.edu_backend.backend.repository;

import com.bjit.edu_backend.backend.model.Course;
import com.bjit.edu_backend.backend.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
