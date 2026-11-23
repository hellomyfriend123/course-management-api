package com.phucnm.orangelearning.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;

    @Column (name = "name", unique = true, nullable = false, length = 100, columnDefinition = "NVARCHAR(100)")
    private String categoryName;

    @Column (name = "description",  unique = true, nullable = false, length = 100, columnDefinition = "NVARCHAR(300)")
    private String categoryDescription;

}
