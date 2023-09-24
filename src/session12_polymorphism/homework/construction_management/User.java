package session12_polymorphism.homework.construction_management;

public class User {

    protected String userName;
    protected String email;
    protected Role role;
    protected Project project;

    User(String userName, Role role, Project project) {
        this.userName = userName;
        this.role = role;
        this.email = userName + "@company.com";
        this.project = project;
    }

    public void printProjectStatus() {
        System.out.println("Status of the project: " + this.project.getProjectStatus());
    }

    public void printProjectResources() {
        this.project.printResources();
    }

    public String getEmail() {
        return this.email;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getDetails() {
        return "User name: " + this.userName +
                " email: " + this.email +
                " role: " + this.role;
    }
}
