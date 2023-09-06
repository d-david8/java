package session12.homework.construction_management;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamName;
    private Engineer teamLead;
    private List<Engineer> members;

    public Team(String teamName, Engineer teamLead) {
        this.teamName = teamName;
        this.teamLead = teamLead;
        this.members = new ArrayList<>();
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamLead(Engineer teamLead) {
        this.teamLead = teamLead;
    }

    public void addEngineer(Engineer engineer) {
        members.add(engineer);
    }

    public void removeEngineer(Engineer engineer) {
        members.remove(engineer);
    }

    public void printTeamDetails() {
        System.out.println("Team lead: " + this.teamLead.getDetails());
        for (Engineer engineer : members) {
            System.out.println(engineer.getDetails());
        }
    }

    public void sendEmailToAllTeamMembers() {
        for (Engineer engineer : members) {
            System.out.println("The emeail was sent to " + engineer.getEmail());
        }
    }
}
