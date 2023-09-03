package session11.practice.data_transformation_system;

import java.util.List;

public abstract class Report {

    protected String title;
    protected List<String> data;

    Report(String title, List<String> data) {
        this.title = title;
        this.data = data;
    }

    public abstract void showPreview();

    public void displayMetadata() {
        System.out.println("Title: " + title);
    }
}
