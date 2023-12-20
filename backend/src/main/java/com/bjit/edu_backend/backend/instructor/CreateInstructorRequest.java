package com.bjit.edu_backend.backend.instructor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateInstructorRequest {
    @NotBlank
    private String firstname;
    private String lastname;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
