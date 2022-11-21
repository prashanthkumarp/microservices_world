package com.learnperfectio.studentproject.Service;
import com.learnperfectio.studentproject.Entity.Course;
import com.learnperfectio.studentproject.Entity.Student;
import com.learnperfectio.studentproject.Model.RequestCourse;

import java.util.List;

public interface StudService {

    void setStud(Student stu);

    void setCourse();

    void setCourse1(Course course);

    List<Student> getStudByNamepath(String name);

    public Student getStudById(String id);

    public List<Student> getAllStudents();

    List<Course> getStudByCourseName(String rcname);

}
