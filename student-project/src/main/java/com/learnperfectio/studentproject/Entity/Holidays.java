package com.learnperfectio.studentproject.Entity;

import com.learnperfectio.studentproject.Validation.DateConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Holidays")
public class Holidays {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long hid;
    @Min(value=2021,message="Year should be between 2021 and 2022")
    @Max(value=2022,message="Year should be between 2021 and 2022")
    private long year;
    @Min(value = 1 ,message = "It is not a valid month")
    @Max(value = 12 ,message = "It is not a valid month")
    private long month;
    @DateConstraint(message = "It is not a valid date")
    private String date;
    private boolean holiday;
    @Size(min = 1,max = 60,message = "Reason should be between 3 to 60 characters")
    private String reason;
}