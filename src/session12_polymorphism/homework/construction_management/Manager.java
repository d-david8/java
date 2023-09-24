package session12_polymorphism.homework.construction_management;

public class Manager extends User {

    Manager(String userName, Project project) {
        super(userName, Role.MANAGER, project);
    }

    public void printProjectMembers() {
        project.printProjectMembers();
    }

    public void addMemberToTeam(Team team, Engineer engineer) {
        team.addEngineer(engineer);
    }

    public void setTeamLead(Team team, Engineer engineer) {
        team.setTeamLead(engineer);
    }

    public void addTeamToProject(Team team) {
        this.project.addTeam(team);
    }

    public void setProjectStatus(ProjectStatus projectStatus) {
        this.project.setProjectStatus(projectStatus);
    }

    public void sendGeneralEmail() {
        this.project.sendEmailsToAllMembers();
    }
}
