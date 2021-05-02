package vehicle;

import parking.ParkingSpot;
import parking.VehicleSize;

public class Motorcycle extends Vehicle
{
    public Motorcycle()
    {
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }
    public boolean canFitinSpot(ParkingSpot spot)
    { ... }
}
