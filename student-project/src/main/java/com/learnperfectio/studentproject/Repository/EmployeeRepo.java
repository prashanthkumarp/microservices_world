package com.learnperfectio.studentproject.Repository;

import com.learnperfectio.studentproject.Entity.Employee;

import java.util.List;

public interface EmployeeRepo {

    public int save(Employee e);
    public List<Employee> findAll();
    public int update(Employee e, int id);
    public int deleteById(int id);
}
