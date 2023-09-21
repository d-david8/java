package session17.streamsAndOptional.practice;

import java.util.Optional;

public class OptionalPractice {

    public static void main(String[] args) {
        Optional<String> email = getEmail();
        if (email.isPresent()) {
            System.out.println("User email: " + email.get());
        } else {
            System.out.println("Email is missing");
        }
    }

    private static Optional<String> getEmail() {
        return Optional.ofNullable("user@email.com");
    }
}
