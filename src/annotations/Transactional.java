package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ElementType.CONSTRUCTOR, METHOD})
@Retention(RUNTIME)
public @interface Transactional {

    boolean rollback() default false;
}
