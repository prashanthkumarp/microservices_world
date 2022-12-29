package com.learnperfectio.studentproject.Entity;
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
@Table(name="Student_tbl")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long sid;
    private String name;
    private long age;
    private long marks;
//    []=new long[6];
//    private long m1=marks[0];
//    private long m2=marks[1];
//    private long m3=marks[2];
//    private long m4=marks[3];
//    private long m5=marks[4];
//    private long m6=marks[5];
}
