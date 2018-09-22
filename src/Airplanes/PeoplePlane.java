package Airplanes;

import Airplanes.Airplane;

public class PeoplePlane extends Airplane {

    public PeoplePlane(String newPlaneIdentification, boolean newIsFlying, String newOrigin,
                       String newType, int newCurrentLoad, int newMaxLoad) {
        super(newPlaneIdentification, newIsFlying, newOrigin, newType, newCurrentLoad, newMaxLoad);
        // Nieuwe constructor gemaakt die Airplanes.Airplane specs inherit, maar deze met de super vernieuwd.
        // Daarna specs die voor de Airplanes.PeoplePlane specifiek zijn bijgewerkt
    }
}

