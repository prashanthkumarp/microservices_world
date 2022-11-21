package com.learnperfectio.studentproject.Repository;

import com.learnperfectio.studentproject.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudRepository extends JpaRepository<Student,Long> {

       List<Student> findByName(String name);
}
