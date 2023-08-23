package extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomParticipant {

    public static void main(String[] args) {
        List<String> participants = new ArrayList<>();
        participants.add("Levi");
        participants.add("Tatiana");
        participants.add("Adrian");
        participants.add("Alexandra");
        participants.add("Titi");
        participants.add("Dragos");

        Random random = new Random();

        int randomNumber = random.nextInt(participants.size());
        System.out.println("The winner is: " + participants.get(randomNumber));
    }
}
