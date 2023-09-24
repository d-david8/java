package session10_inheritanceAndEncapsulation.homework.inheritance_types.multilevel_inheritance;

public class MultilevelInheritanceMain {
    public static void main(String[] args) {

        Tesla tesla = new Tesla("Tesla", "Model S", 2023, 100, 350, "2.5");

        tesla.start();
        tesla.accelerate();
        tesla.charge();
        tesla.enableAutopilot();
        tesla.stop();
    }
}
