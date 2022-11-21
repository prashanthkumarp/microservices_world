package com.learnperfectio.studentproject.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cid;
    private String cname;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
                    name="course_id",
                    referencedColumnName = "cid"
    )
    private List<Student> studentList;
}