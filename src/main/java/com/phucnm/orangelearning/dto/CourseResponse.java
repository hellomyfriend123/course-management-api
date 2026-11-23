package com.phucnm.orangelearning.dto;

import java.time.LocalDateTime;

public class CourseResponse {
    private Long id;

    private String code;

    private String title;

    private String description;

    private Integer credits;

    private Long categoryId;

    private String categoryName;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
