package com.learnperfectio.studentproject.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateConstraintValidator implements ConstraintValidator<DateConstraint, String> {

    @Override
    public void initialize(DateConstraint Date){
    }
    @Override
    public boolean isValid(String value, ConstraintValidatorContext cxt) {
        String arr[]=value.split("-");
        int d=Integer.parseInt(arr[2]);
        int m =Integer.parseInt(arr[1]);
        int y =Integer.parseInt(arr[0]);
        return y>=2021 && y<=2022 && m >= 0 && m < 12 && d > 1 && d <= daysInMonth(m,y);
    }
        public int daysInMonth(int m, int y) {
            switch (m) {
                case 2 :
                    return (y % 400 == 0 || y % 4 == 0 && y % 100==0)? 29 : 28;
                case 9 : case 4 : case 6 : case 11 :
                    return 30;
                default :
                    return 31;
            }
        }
}
