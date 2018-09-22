package Airplanes;

import Airplanes.Airplane;

public class CargoPlane extends Airplane {

    public CargoPlane(String newPlaneIdentification, boolean newIsFlying, String newOrigin,
                      String newType, int newCurrentLoad, int newMaxLoad) {
        super(newPlaneIdentification, newIsFlying, newOrigin, newType, newCurrentLoad, newMaxLoad);
    }
}