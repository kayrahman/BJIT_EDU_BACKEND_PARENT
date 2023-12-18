package com.bjit.edu_backend.backend.model;

import jakarta.persistence.*;
@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String content;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

}

