package session11.homework.smart_home_management_system;

public class SmartHomeManagementSystem {
    public static void main(String[] args) {

        User homeowner = new User("Homeowner", UserType.HOMEOWNER);
        User familyMember = new User("FamilyMember", UserType.FAMILY_MEMBER);
        User guest = new User("Guest", UserType.GUEST);

        Device livingRoomLight = new Light("Living room Light");
        Device frontDoor = new Door("Front Door");

        Device bedRoomLight = new Light("Bed room Light");
        Device bedRoomDoor = new Door("Bed room Door");

        Device thermostat = new Thermostat("Thermostat");


        Room livingRoom = new Room("Living Room");
        livingRoom.addDevice(livingRoomLight);
        livingRoom.addDevice(frontDoor);
        livingRoom.addDevice(thermostat);

        Room bedroom = new Room("Bedroom");
        bedroom.addDevice(bedRoomDoor);
        bedroom.addDevice(bedRoomLight);


        Scene nightMode = new Scene("Night Mode");
        nightMode.addDevice(livingRoomLight);
        nightMode.addDevice(bedRoomLight);
        nightMode.addDevice(frontDoor);

        Scene morningMode = new Scene("Morning Mode");
        morningMode.addDevice(bedRoomLight);
        morningMode.addDevice(livingRoomLight);

        nightMode.activate();

    }
}