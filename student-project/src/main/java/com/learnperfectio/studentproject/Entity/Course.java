package com.learnperfectio.studentproject.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String cname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="s_id")
    @JsonBackReference
    private Student student;
}
