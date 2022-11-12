package com.learnperfectio.studentproject.Controller;
import com.learnperfectio.studentproject.Entity.Student;
import com.learnperfectio.studentproject.Service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value="/student")
public class StudController {
    @Autowired
    private StudService ssobj;

    @PostMapping("/setstud")
    public ResponseEntity<Void> setStud(@RequestBody Student stu){
        ssobj.setStud(stu);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Student>> getStudByNamepath(@PathVariable String name) {
        return new ResponseEntity<>(ssobj.getStudByNamepath(name), HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<List<Student>> getStudByName(@RequestBody Student stu) {
        return new ResponseEntity<>(ssobj.getStudByNamepath(stu.getName()), HttpStatus.OK);
    }


    @GetMapping("/name1")
    public ResponseEntity<List<Student>> getStudByName(@RequestBody StudentSearch stu) {
        return new ResponseEntity<>(ssobj.getStudByNamepath(stu.getSname()), HttpStatus.OK);
    }


    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(ssobj.getAllStudents(), HttpStatus.OK);
    }


    @GetMapping("/id/{id}")
    public ResponseEntity<Student> getStudById(@PathVariable String id) {
        return new ResponseEntity<>(ssobj.getStudById(id), HttpStatus.OK);
    }


}
