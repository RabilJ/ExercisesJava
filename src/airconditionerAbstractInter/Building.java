package airconditionerAbstractInter;

import java.util.Random;

public class Building {
    private Room[] rooms;

    public Building(int numberOfRooms) {
        rooms = new Room[numberOfRooms];
        generateRooms();

    }

    private void generateRooms() {
        Random random = new Random();
        for (int i = 0; i < rooms.length; i++) {
            int currentTemperature = 20 + random.nextInt(15);
            int targetTemperature = currentTemperature - random.nextInt(10);
            int volume = 20 + random.nextInt(15);
            AirConditioner airConditioner = getRandomAirConditioner();
            rooms[i] = new Room(i + 1, volume, currentTemperature, targetTemperature, airConditioner);
        }
    }

    private AirConditioner getRandomAirConditioner() {
        Random random = new Random();
        int number = random.nextInt(10);
        if (number<5)
            return new BasicAirConditioner();
        else
            return new ProAirConditioner();
    }
public boolean areAllRoomsCool(){
    for (Room room : rooms)
        if(room.getBaseTemperature()>room.getGoalTemperature()){
            return false;
    }
    return true;
}
public void coolRooms(){
    for (Room room : rooms) {
        room.cool();
    }
}

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Room room : rooms) {
            builder.append(room).append("\n");
        }
    return builder.toString();
    }
}
