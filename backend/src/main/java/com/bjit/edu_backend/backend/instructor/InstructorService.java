package com.bjit.edu_backend.backend.instructor;

import com.bjit.edu_backend.backend.dto.CreateCourseRequest;
import com.bjit.edu_backend.backend.model.Course;
import com.bjit.edu_backend.backend.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class InstructorService {
    private final InstructorRepository instructorRepository;

    public Instructor createInstructor(@RequestBody CreateInstructorRequest request) {
        Instructor instructor = new Instructor();
        instructor.setName(request.getName());
        instructor.setEmail(request.getEmail());


        //instructor.setCourses(courses);

        return instructorRepository.save(instructor);

    }
}
