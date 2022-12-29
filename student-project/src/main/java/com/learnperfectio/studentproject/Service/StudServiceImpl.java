package com.learnperfectio.studentproject.Service;
import com.learnperfectio.studentproject.Entity.Course;
import com.learnperfectio.studentproject.Entity.Holidays;
import com.learnperfectio.studentproject.Entity.Student;
import com.learnperfectio.studentproject.Repository.CourseRepository;
import com.learnperfectio.studentproject.Repository.HolidayRepository;
import com.learnperfectio.studentproject.Repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudServiceImpl implements StudService{
    @Autowired
    private StudRepository srobj;
    @Autowired
    private CourseRepository crobj;
    @Autowired
    private HolidayRepository hrobj;

    List<Student> stulist = new ArrayList<>();
    List<Course> courselist = new ArrayList<>();
    @Override
    public void setStud(Student student) {
        srobj.save(student);
    }

    @Override
    public void setCourse1(Course course) {
        crobj.save(course);
    }

    @Override
    public void setCourse() {
        Student stu1= Student.builder()
                .name("Abc")
                .age(27)
                .marks(90)
                .build();
        Student stu2= Student.builder()
                .name("Abcd")
                .age(16)
                .marks(94)
                .build();
//        Student stu3= Student.builder()
//                .name("Anju")
//                .age(21)
//                .marks(97)
//                .build();

        Course course=Course.builder()
                .cname("CA")
                .studentList(List.of(stu1,stu2))
                .build();
        crobj.save(course);
    }

    @Override
    public List<Student> getStudByNamepath(String name) {
        System.out.println(name+"sdsdadadkjashdk");
        stulist= srobj.findByName(name);
        return stulist;
    }

    @Override
    public Student getStudById(String id) {
        System.out.println("ddsffsdff");

        return srobj.findById(Long.parseLong(id)).get();

    }

    @Override
    public List<Student> getAllStudents() {
        return srobj.findAll();
    }

    @Override
    public List<Course> getStudByCourseName(String rcname) {
        courselist= crobj.findByCname(rcname);
        return courselist;
    }

    @Override
    public List<Course> getAllByCourseName() {
        courselist=crobj.findAll();
        return courselist;
    }

    @Override
    public void holidayssave(Holidays holidays) {
        hrobj.save(holidays);
    }


}
