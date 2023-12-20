package com.bjit.edu_backend.backend.service;

import com.bjit.edu_backend.backend.dto.CreateCourseRequest;
import com.bjit.edu_backend.backend.model.Course;
import com.bjit.edu_backend.backend.repository.CourseRepository;
import com.bjit.edu_backend.backend.instructor.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepository;
    public Course createCourse(@RequestBody CreateCourseRequest request) {
        Course course = new Course();
        course.setTitle(request.getTitle());
        course.setDescription(request.getDescription());
        course.setCategory(request.getCategory());
        course.setLevel(request.getLevel());
        course.setDurationInMinutes(request.getDurationInMinutes());
        course.setPrice(request.getPrice());
        course.setStartDate(request.getStartDate());
        course.setEndDate(request.getEndDate());

/*        Instructor instructor = instructorRepository.findById(request.getInstructorId())
                .orElseThrow(() -> new EntityNotFoundException("Instructor not found with ID: " + request.getInstructorId()));
        course.setInstructor(instructor);*/

        /*
        // Set tags (assuming you have a valid set of tag IDs)
        Set<Tag> tags = tagRepository.findAllById(createCourseRequest.getTagIds());
        course.setTags(tags);*/


        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}

/*
*  @NotBlank
    private String title;

    private String description;

    @NotBlank
    private String category;

    @NotBlank
    private String level;

    @NotNull
    private Long instructorId;

    private Set<Long> tagIds;

    private int durationInMinutes;

    private double price;
* */