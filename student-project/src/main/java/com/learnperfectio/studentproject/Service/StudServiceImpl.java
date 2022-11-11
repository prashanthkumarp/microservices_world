package com.learnperfectio.studentproject.Service;
import com.learnperfectio.studentproject.Entity.Course;
import com.learnperfectio.studentproject.Entity.Student;
import com.learnperfectio.studentproject.Repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudServiceImpl implements StudService{
    @Autowired
    private StudRepository srobj;
    List<Student> stulist = new ArrayList<>();
    @Override
    public void setStud(Student student) {
        Course course = student.getCourse();
        course.setStudent(student);
        srobj.save(student);
    }

    @Override
    public List<Student> getStudByNamepath(String name) {
        stulist= srobj.findByName(name);
        return stulist;
    }

//    @Override
//    public List<Student> getStudByName(String name) {
//        stulist= srobj.findByName(name);
//        return stulist;
//    }

}
