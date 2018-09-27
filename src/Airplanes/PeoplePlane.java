package Airplanes;

import Airplanes.Airplane;

public class PeoplePlane extends Airplane {

    public PeoplePlane(String newPlaneIdentification, boolean newIsFlying, String newOrigin,
                       String newType, int newCurrentLoad, int newMaxLoad) {
        super(newPlaneIdentification, newIsFlying, newOrigin, newType, newCurrentLoad, newMaxLoad);
        // Created new constructor that inherits from Airplane, but this super overrides the values.
    }
}

