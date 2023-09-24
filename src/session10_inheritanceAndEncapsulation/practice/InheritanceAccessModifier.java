package session10_inheritanceAndEncapsulation.practice;

public class InheritanceAccessModifier {

}

class Athlete {

    private int age;

    protected void setAge(int age) {
        this.age = age;
    }
}

class Runner extends Athlete {

    private int age;
}

class Biker extends Athlete {

}