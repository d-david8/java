package session11.homework.smart_home_management_system;

public class Camera extends Device {

    private boolean isRecording;

    public Camera(String name) {
        super(name);
        this.isRecording = false;
    }

    @Override
    public String getDeviceDetails() {
        return super.getDeviceDetails() + "\n" +
                "Is recording: " + isRecording;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The camera is on");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        isRecording = false;
        System.out.println("The camera was turned of");
    }

    public void starRecording() {
        if (isRecording) {
            System.out.println("The camera already is recording");
        } else {
            isRecording = true;
            System.out.println("The camera is recording");
        }
    }

    public void stopRecording() {
        if (!isRecording) {
            System.out.println("The camera is not recording right now");
        } else {
            isRecording = false;
            System.out.println("The recording was stopped");
        }
    }
}
