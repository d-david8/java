package session12_polymorphism.practice.change_runtime_behavior;

public class GameTest {

    public static void main(String[] args) {
        GameCharacter character = new GameCharacter(new Sword());
        character.attak();

        character.setWeapon(new Bow());
        character.attak();
    }
}
