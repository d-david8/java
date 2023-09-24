package session15_equalsHashcodeGenericsEnum.homework.tostring;

import java.util.ArrayList;
import java.util.List;

/*
 * Implement the toString method in a class holding a large dataset to print a “summary” version of the
 * dataset, facilitating debugging and logging.
 * */
public class Database {
    private static final int PREVIEW_COUNT = 5;
    private List<String> data;

    public Database(List<String> data) {
        this.data = data;
    }

    public String toString() {
        StringBuilder summary = new StringBuilder();
        summary.append("Summary:\n");
        summary.append("Total Items: ").append(data.size()).append("\n");
        summary.append("Preview: ").append("\n");

        for (int i = 0; i < Math.min(data.size(), PREVIEW_COUNT); i++) {
            summary.append(data.get(i)).append("\n");
        }
        return summary.toString();
    }

    public static void main(String[] args) {
        List<String> database = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            database.add("Item " + i);
        }
        Database database1 = new Database(database);
        System.out.println(database1);
    }
}
