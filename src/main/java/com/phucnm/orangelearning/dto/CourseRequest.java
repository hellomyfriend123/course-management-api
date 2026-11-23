package com.phucnm.orangelearning.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor 
public class CourseRequest {
    @NotBlank
    @Pattern (regexp = "^[A-Z]{3}\\d{3}$")
    private String code;

    @NotBlank
    @Size (min = 2, max = 150)
    private String tittle;
    
    @Size(max = 500)
    private String description;

    @NotNull 
    @Min(1)
    @Max(10)
    private int credits;

    @NotNull
    private Integer categoryId;
}
