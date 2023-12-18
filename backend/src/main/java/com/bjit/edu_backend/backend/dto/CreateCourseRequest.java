package com.bjit.edu_backend.backend.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCourseRequest {

    @NotBlank
    private String title;

    private String description;

    @NotBlank
    private String category;

    @NotBlank
    private String level;

    @NotNull
    private Long instructorId;

    //private Set<Long> tagIds;

    private int durationInMinutes;
    private double price;
    private Date startDate;
    private Date endDate;

    // Other validation annotations or constraints can be added as needed

    // Constructors, getters, and setters
}
