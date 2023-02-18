package annotations;

public @interface Date {

    String format();

    boolean enabled() default true;
}
