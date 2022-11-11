package com.learnperfectio.studentproject.Repository;

import com.learnperfectio.studentproject.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudRepository extends JpaRepository<Student,Long> {

       List<Student> findByName(String name);
}
