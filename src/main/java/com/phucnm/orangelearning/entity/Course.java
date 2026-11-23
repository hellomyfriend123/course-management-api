package com.phucnm.orangelearning.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.ManyToAny;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity
@Table (name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true, nullable = false, length = 100, columnDefinition = "NVARCHAR(100)")
    private String name;

    @Column(name = "code", unique = true, nullable = false, length = 10, columnDefinition = "VARCHAR(10)")
    private String code;

    @Column (name = "title", unique = true, nullable = false, length = 150, columnDefinition = "NVARCHAR(150)") 
    private String title;

    @Column (name = "description", unique = true, nullable = false, length = 500, columnDefinition = "NVARCHAR(500)")
    private String description; 


    @Column (name = "credits", nullable = false)
    private int credits;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false, foreignKey = @ForeignKey (name = "FK_Course_Category"))
    private Category category;

    @Column (name = "created_at", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime createdAt;

    @Column (name = "updated_at", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime updatedAt;

    

}
