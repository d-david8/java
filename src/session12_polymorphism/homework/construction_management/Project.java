package session12_polymorphism.homework.construction_management;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String projectName;
    private List<Team> teams;
    private List<Manager> managers;

    ProjectStatus projectStatus;

    Project(String projectName) {
        this.projectName = projectName;
        this.teams = new ArrayList<>();
        this.managers = new ArrayList<>();
        this.projectStatus = ProjectStatus.NOT_STARTED;
    }

    public ProjectStatus getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public void addManager(Manager manager) {
        this.managers.add(manager);
    }

    void printResources() {
        System.out.println("The resources of the project are the following....");
    }

    protected void printProjectMembers() {
        System.out.println(this.projectName);
        System.out.println("Managers");
        for (Manager manager : managers) {
            System.out.println(manager.getDetails());
        }

        System.out.println("Teams:");
        for (Team team : this.teams)
            team.printTeamDetails();
    }

    protected void makeSomeChanges() {
        System.out.println("Some changes was made in the project");
    }

    public void sendEmailsToAllMembers() {
        System.out.println("Managers");
        for (Manager manager : managers) {
            System.out.println("The email was sent to:" + manager.getEmail());
        }

        System.out.println("Teams");
        for (Team team : this.teams) {
            team.sendEmailToAllTeamMembers();
        }
    }
}
