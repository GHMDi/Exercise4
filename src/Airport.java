import Airplanes.Airplane;
import Airplanes.CargoPlane;
import Airplanes.PeoplePlane;

public class Airport {
    private String name;
    private boolean available;
    int i;

    Airplane[] airplaneFromAirport = new Airplane[5];
    // Give airport name + assign String to airplane Array


    public Airport(String name) {
        this.name = name;
        setName(name);
        airplaneFromAirport[0] = new PeoplePlane("ABC123", false,
                "Eindhoven", "Airplanes.PeoplePlane", 30, 60);
        airplaneFromAirport[1] = new PeoplePlane("DDD888", true,
                "Eindhoven", "Airplanes.PeoplePlane", 30, 60);
        airplaneFromAirport[2] = new PeoplePlane("ODL345", true,
                "Eindhoven", "Airplanes.PeoplePlane", 30, 60);
        airplaneFromAirport[3] = new CargoPlane("FF2134", false,
                "Eindhoven", "Airplanes.CargoPlane", 5, 20);
        airplaneFromAirport[4] = new CargoPlane("PLA166", true,
                "Eindhoven", "Airplanes.CargoPlane", 0, 20);
    }


    public void printPlanes() {
        System.out.println("Passagiersvliegtuigen");
        for (Airplane PeoplePlane : airplaneFromAirport) {
            if (PeoplePlane.getType() == "Airplanes.PeoplePlane")
                System.out.println("Passagiersvliegtuig " + PeoplePlane.getPlaneIdentification());
          else System.out.println();
        }
        System.out.println("Cargovliegtuigen");
        for (Airplane CargoPlane : airplaneFromAirport) {
            if (CargoPlane.getType() == "Airplanes.CargoPlane")
                System.out.println("Cargovliegtuig " + CargoPlane.getPlaneIdentification());
        }
    }


    public String toString() {
        Airplane airplane = airplaneFromAirport[i];
        switch (airplane.getType()) {
            case "Airplanes.PeoplePlane":
                return "Vliegtuig " + airplane.getPlaneIdentification() + " is een passagiersvliegtuig afkomstig uit "
                        + airplane.getOrigin() + ". " + airplane.getPlaneIdentification() +
                        " heeft een maximale capaciteit van: " + airplane.getMaxLoad() + " passagiers.";
            case "Airplanes.CargoPlane":
                return "Vliegtuig " + airplane.getPlaneIdentification() + " is een passagiersvliegtuig afkomstig uit "
                        + airplane.getOrigin() + ". " + airplane.getPlaneIdentification() +
                        " heeft een maximale cargocapaciteit van: " + airplane.getMaxLoad() + " ton cargo.";
        }
        return null;
    }

    public void availablePlanes() {
        for (int i = 0; i < airplaneFromAirport.length; i++) {
            Airplane airplane = airplaneFromAirport[i];
            airplane.checkAvailable();
            // connected with airplane class, so we can use this in the method
            if (airplane.isFlying() == false) {
                switch (airplane.getType()) {
                    case "Airplanes.PeoplePlane":
                        System.out.println("Passagiersvliegtuig " + airplane.getPlaneIdentification() + " " +
                                "opgevraagd. Is niet aan het vliegen. Heeft nog plek voor " + airplane.getAvailableLoad()
                                + " passagiers.");
                        setAvailable(true);
//                           tested outcome System.out.println("switch 1 OK");
                        airplane.loadPlane(63);
                        System.out.println(toString());
                        break;
                    case "Airplanes.CargoPlane":
                        System.out.println("Cargovliegtuig " + airplane.getPlaneIdentification() + " " +
                                "opgevraagd. Is niet aan het vliegen. Heeft nog plek voor " + airplane.getAvailableLoad()
                                + " ton cargo.");
                        setAvailable(true);
//                         tested outcome   System.out.println("switch 2 OK");
                        airplane.loadPlane(20);
                        System.out.println(toString());
                        break;
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airplane[] getAirplaneFromAirport() {
        return airplaneFromAirport;
    }

    public void setAirplaneFromAirport(Airplane[] airplaneFromAirport) {
        this.airplaneFromAirport = airplaneFromAirport;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}