package session12_polymorphism.practice.change_runtime_behavior;

public class GameCharacter {
    private Weapon weapon;

    GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attak(){
        weapon.use();
    }
}
