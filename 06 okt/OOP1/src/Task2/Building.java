package Task2;
import java.util.ArrayList;

public class Building {

    private final ArrayList<Rooms> Rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Rooms> Rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.Rooms = Rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Rooms> getRooms() {

        return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {

        return isOfficeBuilding;
    }
}

