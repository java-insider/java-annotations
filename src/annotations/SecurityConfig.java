package annotations;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

@Target(TYPE)
public @interface SecurityConfig {

    Group[] allowed();
}
