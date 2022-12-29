package com.learnperfectio.studentproject.Repository;

import com.learnperfectio.studentproject.Entity.Holidays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository extends JpaRepository<Holidays,Long> {
}
