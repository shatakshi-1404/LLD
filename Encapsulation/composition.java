//objects inside object
class ParkingSpot {
    private int spotNumber;
    private boolean occupied;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void park() {
        if (occupied) {
            throw new IllegalStateException(
                "Spot is already occupied"
            );
        }

        occupied = true;
    }

    public void vacate() {
        occupied = false;
    }
}
// a parking lot can manage multiple spots 
import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    private final List<ParkingSpot> spots =
        new ArrayList<>();

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public int getTotalSpots() {
        return spots.size();
    }
}
ParkingLot lot = new ParkingLot();

lot.addSpot(new ParkingSpot(1));
lot.addSpot(new ParkingSpot(2));

System.out.println(lot.getTotalSpots());