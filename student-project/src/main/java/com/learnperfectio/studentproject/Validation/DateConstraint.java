package com.learnperfectio.studentproject.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateConstraintValidator.class)
public @interface DateConstraint {
String message() default "Invalid day given";
Class<?>[] groups() default {};
Class<? extends Payload>[] payload() default {};
}
