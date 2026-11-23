package com.phucnm.orangelearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phucnm.orangelearning.entity.Course;

@Repository 
public interface CourseRepository extends JpaRepository<Course, Long> {
    boolean existByCode(String code);
    List<Course> findByCategoryId(Long categoryId);
    List<Course> findByContentContainingIgnoreCase(String title);
}
