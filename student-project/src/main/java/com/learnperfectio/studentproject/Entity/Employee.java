package com.learnperfectio.studentproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

        private Long id;
        private String name;
        private Long salary;

        public Employee(String name, Long salary) {
            this.name = name;
            this.salary = salary;
        }
}
