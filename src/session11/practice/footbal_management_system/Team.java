package session11.practice.footbal_management_system;

import java.util.ArrayList;
import java.util.List;

class Team {
    private String teamName;
    private Coach coach;
    private List<Player> players;
    private int wins;
    private int losses;
    private int draws;

    public Team(String teamName, Coach coach) {
        this.teamName = teamName;
        this.coach = coach;
        this.players = new ArrayList<>();
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void updateMatchResults(int wins, int losses, int draws) {
        this.wins += wins;
        this.losses += losses;
        this.draws += draws;
    }

    public void displayDetails() {
        System.out.println("Team Details:");
        System.out.println("Team Name: " + teamName + "\n");
        System.out.println("Coach:");
        coach.displayDetails();
        System.out.println();
        System.out.println("Players:");
        for (Player player : players) {
            player.displayDetails();
            System.out.println();
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
    }
}

