package com.learnperfectio.studentproject.Repository;


import com.learnperfectio.studentproject.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(Employee e) {
        return jdbcTemplate.update("INSERT into employee (name, Salary) VALUES (?, ?)", new Object[] {e.getName(), e.getSalary()});
    }

    @Override
    public List<Employee> findAll() {
        return jdbcTemplate.query("select * from employee",new RowMapper<Employee>(){
            @Override
            public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {
                Employee e=new Employee();
                e.setId(rs.getLong(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getLong(3));
                return e;
            }
        });
    }

    @Override
    public int update(Employee e, int id) {
        return jdbcTemplate.update("UPDATE employee SET name = ?, salary = ? WHERE id = ?", new Object[] {e.getName(), e.getSalary(), id});
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM employee WHERE id=?", id);
    }

}
