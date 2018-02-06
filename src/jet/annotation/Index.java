package jet.annotation;

import java.lang.annotation.*;

/**
 * Represents an index on a table for fast access.
 *
 * <p>
 *     Each index has a name and an array of columns to which it applies. Multiple indexes can be
 *     specified on the same table, which will be stored in a {@link Indices} annotation.
 * </p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Indices.class)
public @interface Index {

    /**
     * Get the name of this index.
     * @return the name
     */
    String name();

    /**
     * Get the columns this index applies to.
     * @return the column names
     */
    String[] columns();

}
