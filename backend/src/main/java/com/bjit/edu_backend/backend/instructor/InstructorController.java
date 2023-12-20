package com.bjit.edu_backend.backend.instructor;

import com.bjit.edu_backend.backend.dto.CreateCourseRequest;
import com.bjit.edu_backend.backend.model.Course;
import com.bjit.edu_backend.backend.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/instructors")
@RequiredArgsConstructor
public class InstructorController {

    private final CourseService courseService;

    @PostMapping
    public Course createCourse(@RequestBody CreateCourseRequest createCourseRequest) {
        // Logic for creating a course
        return courseService.createCourse(createCourseRequest);
    }

 /*   @PostMapping("/{courseId}/lessons")
    public Lesson createLesson(@PathVariable Long courseId, @RequestBody CreateLessonRequest createLessonRequest) {
        // Logic for creating a lesson for a specific course
       // return courseService.createLesson(courseId, createLessonRequest);
    }*/


    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
