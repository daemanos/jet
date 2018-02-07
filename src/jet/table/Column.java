package jet.table;

import jet.annotation.Field;
import jet.util.Maps;
import static jet.util.Maps.entry;

import java.sql.JDBCType;
import java.util.Collections;
import java.util.Map;

public class Column {

    private static final Map<Class<?>, JDBCType> TYPE_MAP = Collections.unmodifiableMap(Maps.of(
            entry(Integer.class, JDBCType.INTEGER)
    ));

    private final String name;
    private final int precision;
    private final int scale;

    private final JDBCType type;

    Column(java.lang.reflect.Field source) {
        Field annotation = source.getAnnotation(Field.class);

        name = (annotation.name().equals("")) ? source.getName() : annotation.name();
        precision = annotation.precision();
        scale = annotation.scale();

        Class<?> fieldType = source.getType();
        if (TYPE_MAP.containsKey(fieldType)) {
            type = TYPE_MAP.get(fieldType);
        } else {
            throw new RuntimeException("Invalid SQL type: " + fieldType.getName());
        }
    }

    public String getName() {
        return name;
    }

    public JDBCType getType() {
        return type;
    }

}
