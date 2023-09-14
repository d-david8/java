package session15.practice.generics;

public class NumberBox<T extends Number> {

    private  T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double doubleNumber(){
        return  number.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.setNumber(2);
        System.out.println(integerNumberBox.doubleNumber());

    }
}
