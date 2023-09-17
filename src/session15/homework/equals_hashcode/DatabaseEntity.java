package session15.homework.equals_hashcode;

import java.util.Objects;

/*
 * Given a list of objects representing database entities with fields such as id, name, and timestamp,
 * ensure that no two entities are considered equal if their id fields are different.
 * */
public class DatabaseEntity {
    private long id;
    private String name;
    private long timestamp;

    public DatabaseEntity(long id, String name, long timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DatabaseEntity databaseEntity = (DatabaseEntity) obj;
        return id == databaseEntity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        DatabaseEntity entity1 = new DatabaseEntity(1, "Entity A", System.currentTimeMillis());
        DatabaseEntity entity2 = new DatabaseEntity(2, "Entity B", System.currentTimeMillis());
        DatabaseEntity entity3 = new DatabaseEntity(1, "Entity A", System.currentTimeMillis());

        System.out.println("Are entity1 and entity2 equal? " + entity1.equals(entity2));
        System.out.println("Are entity1 and entity3 equal? " + entity1.equals(entity3));

        System.out.println("Hash code for entity1: " + entity1.hashCode());
        System.out.println("Hash code for entity2: " + entity2.hashCode());
        System.out.println("Hash code for entity3: " + entity3.hashCode());
    }
}
