package session15_equalsHashcodeGenericsEnum.homework.enums;

/*
 * Create a simulation of a traffic light system using an enum to represent the different
 * states of a traffic light.
 * */
public class TrafficLightSystem {

    enum TrafficLightState {
        RED, YELLOW, GREEN
    }

    private TrafficLightState currentState;

    public TrafficLightSystem() {
        currentState = TrafficLightState.RED;
    }

    public void changeState() {
        switch (currentState) {
            case RED -> currentState = TrafficLightState.GREEN;
            case YELLOW -> currentState = TrafficLightState.RED;
            case GREEN -> currentState = TrafficLightState.YELLOW;
        }
    }

    public TrafficLightState getCurrentState() {
        return currentState;
    }

    public static void main(String[] args) {
        TrafficLightSystem trafficLight = new TrafficLightSystem();

        for (int i = 0; i < 5; i++) {
            System.out.println("Current state: " + trafficLight.getCurrentState());
            trafficLight.changeState();
        }
    }
}

