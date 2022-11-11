package com.learnperfectio.studentproject.Service;
import com.learnperfectio.studentproject.Entity.Student;
import java.util.List;

public interface StudService {

    void setStud(Student stu);

    List<Student> getStudByNamepath(String name);

//    public List<Student> getStudByName(String name);

}
