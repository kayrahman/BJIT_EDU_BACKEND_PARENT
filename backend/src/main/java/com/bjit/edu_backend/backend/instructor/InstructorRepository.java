package com.bjit.edu_backend.backend.instructor;

import com.bjit.edu_backend.backend.instructor.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
