package com.learnperfectio.studentproject.Repository;

import com.learnperfectio.studentproject.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findByCname(String cname);
}
