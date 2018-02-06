package jet.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that this field references a field in another table.
 *
 * <p>
 *     The type of reference is specified by a string argument to the annotation of the form
 *     <i>table</i>[#<i>field</i>], that is, a table name optionally followed by a pound sign (#)
 *     and the name of a field in that table. If no field name is given, the name of the current
 *     field will be used.
 * </p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ForeignKey {
    /**
     * Get a string describing the referent.
     * @return a string of the form TABLE[#FIELD]
     */
    String value();
}
