# Jet: The Java Database Engine

Jet is a small database engine that allows rapid development of database applications in pure Java.

## Table syntax

Tables in Jet each get their own class, which is annotated with information that allows Jet to generate the SQL necessary to create and insert into them. For example:

```java
import jet.annotation.*;
import jet.table.Table;

@TableDef(name = "User")
public class UserTable extends Table {
    public @Field @PrimaryKey int id;
    public @Field String name;
    public @Field @Check(">=18") int age;
    
    // ...
}
```

This generates the following SQL table schema:

```sql
CREATE TABLE User (
    id int,
    name varchar(255),
    age int,
    CHECK (age>=18)
)
```
