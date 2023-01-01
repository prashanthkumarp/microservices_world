package com.learnperfectio.studentproject.Controller;

import com.learnperfectio.studentproject.Entity.Employee;
import com.learnperfectio.studentproject.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepo erobj;

    @PostMapping("/employees")
    public String save(@RequestBody Employee e) {
        return erobj.save(e)+" Employee details saved";
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return erobj.findAll();
    }

    @PutMapping("/employees/{id}")
    public String update(@RequestBody Employee e, @PathVariable int id) {
        return erobj.update(e, id)+" Employee details updated";
    }

    @DeleteMapping("/employees/{id}")
    public String deleteById(@PathVariable int id) {
        return erobj.deleteById(id)+" Employee deleted";
    }
}