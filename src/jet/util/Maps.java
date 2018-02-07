package jet.util;


import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

    /**
     * Create a new entry for use with {@link #of}.
     * @param key the key
     * @param value the value
     * @return a (key, value) pair used to create a new map
     */
    public static <K, V> Map.Entry<K, V> entry(K key, V value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }

    /**
     * Create a new map from entries.
     * @param entries the list of entries
     * @return a map containing those entries
     */
    public static <K, V> Map<K, V> of(Map.Entry<K, V>... entries) {
        return Arrays.stream(entries)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}
