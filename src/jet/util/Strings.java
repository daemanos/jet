package jet.util;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * A collection of utilities for dealing with strings.
 */
public class Strings {

    /**
     * Join a list of objects into a string.
     *
     * @param xs a list to join
     * @param fmt a printf-style format string to apply to each object
     * @param infix a string to insert between objects
     * @param prefix a string to insert before the result
     * @param suffix a string to insert after the result
     *
     * @return a string formed with a {@link StringJoiner} according to the given parameters
     */
    public static String join(List<?> xs, String fmt, String infix, String prefix, String suffix) {
        StringJoiner sj = new StringJoiner(infix, prefix, suffix);
        xs.forEach(x -> sj.add(String.format(fmt, x)));

        return sj.toString();
    }

    /**
     * Join a list of objects into a string.
     *
     * @param xs a list to join
     * @param fmt a printf-style format to apply to each object
     * @param infix a string to insert between objects
     *
     * @return a string formed with a {@link StringJoiner} according to the given parameters
     */
    public static String join(List<?> xs, String fmt, String infix) {
        return join(xs, fmt, infix, "", "");
    }

    /**
     * Join a list of strings into a single string.
     * @param xs a list of strings to join
     * @param infix a string to apply between the elements
     *
     * @return a string formed by putting the given infix between the given strings
     */
    public static String join(List<String> xs, String infix) {
        StringJoiner sj = new StringJoiner(infix);
        xs.forEach(sj::add);

        return sj.toString();
    }

    /**
     * Join an array of strings into a single string.
     * @param xs an array of strings to join
     * @param infix a string to apply between the elements
     *
     * @return a string formed by putting the given infix between the given strings
     */
    public static String join(String[] xs, String infix) {
        return join(Arrays.asList(xs), infix);
    }

}
