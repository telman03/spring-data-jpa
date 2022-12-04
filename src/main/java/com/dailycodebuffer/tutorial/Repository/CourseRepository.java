package com.dailycodebuffer.tutorial.Repository;

import com.dailycodebuffer.tutorial.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
