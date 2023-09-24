package session12_polymorphism.homework.construction_management;

public class Engineer extends User {

    Engineer(String userName, Project project) {
        super(userName, Role.ENGINEER, project);
    }

}
