package session11_abstraction.practice.footbal_management_system;

import java.time.LocalDate;

public class FootballClubManagementSystem {

    public static void main(String[] args) {
        Coach coach = new Coach("Mihai Pop", LocalDate.parse("1980-01-15"), 10, 5000);

        Player player1 = new Player("Player 1", LocalDate.parse("1990-05-20"), "Forward", 6000);
        Player player2 = new Player("Player 2", LocalDate.parse("1992-03-10"), "Midfielder", 5500);

        Team team = new Team("Team of stars", coach);
        team.addPlayer(player1);
        team.addPlayer(player2);
        team.updateMatchResults(5, 2, 3);

        team.displayDetails();

        team.removePlayer(player1);
        team.displayDetails();
    }
}
