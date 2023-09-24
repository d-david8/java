package session12_polymorphism.homework.construction_management;

public class Admin extends Manager {

    Admin(String userName, Project project) {
        super(userName, project);
        this.role = Role.ADMIN;
    }

    public void addManagersToProject(Manager manager) {
        project.addManager(manager);
    }

    public void makeChanges() {
        System.out.println("The admin " + userName + " make some changes");
        project.makeSomeChanges();
    }

}
