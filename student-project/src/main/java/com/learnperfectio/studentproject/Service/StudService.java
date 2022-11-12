package com.learnperfectio.studentproject.Service;
import com.learnperfectio.studentproject.Entity.Student;
import java.util.List;

public interface StudService {

    void setStud(Student stu);

    List<Student> getStudByNamepath(String name);

    public Student getStudById(String id);

    public List<Student> getAllStudents();

//    public List<Student> getStudByName(String name);

}
