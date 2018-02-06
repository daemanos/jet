package jet.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Describes an arbitrary constraint on this field.
 *
 * <p>
 *     The argument to {@code @Check} is an array of strings describing SQL predicates, which will
 *     be connected as AND clauses.
 * </p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Check {

    /**
     * Get the array of SQL expressions describing this check.
     * @return an array of SQL predicate expressions
     */
    String[] value();
}
