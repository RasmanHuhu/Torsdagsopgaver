package Task2;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Rooms room1 = new Rooms(4, 8, 12);
        Rooms room2 = new Rooms(6, 10, 14);
        Rooms room3 = new Rooms(8, 12, 16);
        Rooms room4 = new Rooms(10, 14, 18);


        //2.h
        ArrayList<Rooms> setOfRooms = new ArrayList<>();
        setOfRooms.add(room1);
        setOfRooms.add(room2);
        setOfRooms.add(room3);
        setOfRooms.add(room4);

        //2.i instantiate a new building
        Building b1 = new Building(setOfRooms, 4, 6, false);

        System.out.println(countLampsInBuilding(b1));
        System.out.println(isNormal(b1));
    }

                    public static int countLampsInBuilding(Building b) {
                            int sum = 0;
                            for (Rooms r : b.getRooms()){
                                sum += r.getNumberOfLamps();

                            }
                            return sum;
    }

                    //2.k
                    public static boolean isNormal(Building b) {
                    int floors = b.getNumberOfFloors();
                    int rooms = b.getRooms().size();

                    if(floors > rooms) {
                        System.out.println("THis building is odd");
                        return false;
                    }
                    return true;
                    }
}