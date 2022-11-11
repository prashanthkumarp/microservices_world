package com.learnperfectio.studentproject.Entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long sid;
    private String name;
    private long age;
    private long[] marks=new long[6];
    @OneToOne(cascade = CascadeType.ALL,mappedBy="student")
    @JsonManagedReference
    private Course course;
}
