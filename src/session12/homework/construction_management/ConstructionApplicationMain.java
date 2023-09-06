package session12.homework.construction_management;

public class ConstructionApplicationMain {

    public static void main(String[] args) {
        Project project = new Project("Construction project");

        Admin admin = new Admin("admin", project);
        Manager manager1 = new Manager("manager1", project);
        Manager manager2 = new Manager("manager2", project);
        admin.addManagersToProject(manager1);
        admin.addManagersToProject(manager2);

        Engineer engineer1 = new Engineer("engineer1", project);
        Engineer engineer11 = new Engineer("engineer11", project);
        Engineer engineer12 = new Engineer("engineer12", project);
        Engineer engineer13 = new Engineer("engineer13", project);

        Team team1 = new Team("Team1", engineer1);
        manager1.addMemberToTeam(team1, engineer11);
        manager1.addMemberToTeam(team1, engineer12);
        manager1.addMemberToTeam(team1, engineer13);
        manager1.addTeamToProject(team1);

        Engineer engineer2 = new Engineer("engineer2", project);
        Engineer engineer21 = new Engineer("engineer21", project);
        Engineer engineer22 = new Engineer("engineer22", project);

        Team team2 = new Team("Team2", engineer2);
        manager2.addMemberToTeam(team2, engineer21);
        manager2.addMemberToTeam(team2, engineer22);
        manager2.addTeamToProject(team2);

        System.out.println("\nDetails od the project printed by a manager");
        manager1.printProjectMembers();

        System.out.println("\nDetails of the status and resources printed by an engineer");
        engineer21.printProjectStatus();
        engineer2.printProjectResources();

        System.out.println("\nChanges made bt admin");
        admin.makeChanges();

        System.out.println("\nA manager change the status of the project and an engineer check the new status");
        manager1.setProjectStatus(ProjectStatus.DONE);
        engineer13.printProjectStatus();

        System.out.println("\nSend the email to all members of the project");
        manager2.sendGeneralEmail();
    }
}
