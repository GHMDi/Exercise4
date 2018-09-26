package Airplanes;

public class Airplane {
    private String planeIdentification;
    private boolean isFlying;
    private int cruiseSpeed;
    private String origin;
    private String type;
    private boolean available;
    private int maxLoad;
    private int currentLoad;
    private int notFittingLoad;
    private int availableLoad;


    public Airplane(String planeIdentification, boolean isFlying, String origin, String type, int currentLoad,
                    int maxLoad) {
        this.planeIdentification = planeIdentification;
        this.isFlying = isFlying;
        this.origin = origin;
        this.type = type;
        this.currentLoad = currentLoad;
        this.maxLoad = maxLoad;
    }

    public void takeoffPlane() {
        if (isFlying() == true) {
            System.out.println("Airplanes.Airplane " + planeIdentification +
                    " can not take off, because we are still flying.");
        } else if (isFlying() == false)
            System.out.println("Plane " + planeIdentification + " rises.");
        setFlying(true);
    }

    public void landPlane() {
        if (isFlying() == false) {
            System.out.println("Airplanes.Airplane " + planeIdentification +
                    " can not land, because we are still on the ground.");
        } else if (isFlying() == true)
            // Always recall method is Flying () instead of variable, else it fails
            System.out.println("Plane " + planeIdentification + " lands.");
        setFlying(false);
    }

    public void loadPlane(int LoadsToLoad) {
        setCurrentLoad(getCurrentLoad()+LoadsToLoad);
        int notFittingLoads = (currentLoad - maxLoad);
        switch (type) {
            case "Airplanes.PeoplePlane":
                if (currentLoad <= maxLoad) {
                    System.out.println("Passagiersvliegtuig " + planeIdentification + " laadt " + currentLoad
                            + " Passagiers.");
                } else System.out.println("Passagiersvliegtuig " + getPlaneIdentification() + " laadt " + maxLoad
                        + " Passagiers. " + notFittingLoads + " passagiers passen niet.");
                break;
//              System.out.println("switch 1 OK");
            case "Airplanes.CargoPlane":
                if (currentLoad <= maxLoad) {
                    System.out.println("Cargovliegtuig " + planeIdentification + " laadt " + currentLoad
                            + " ton Cargo.");
                } else System.out.println("Cargovliegtuig " + getPlaneIdentification() + " laadt " + maxLoad
                        + " ton Cargo. " + notFittingLoads + " ton past niet.");
                break;
//              System.out.println("switch 2 OK");
        }
    }

    public void unloadPlane(int LoadsToLoad) {
        int i = getCurrentLoad();
        System.out.println("Airplanes.Airplane " + getPlaneIdentification() + " unloads " + i + " passengers.");
        setCurrentLoad(currentLoad - i);
        switch (type) {
            case "Airplanes.PeoplePlane":
                System.out.println("Passagiersvliegtuig " + getPlaneIdentification() + " unloads " + i + " passengers.");
                setCurrentLoad(currentLoad - i);
//              System.out.println("switch 1 OK");
            case "Airplanes.CargoPlane":
                System.out.println("Cargovliegtuig " + getPlaneIdentification() + " unloads " + i + " tonnes of Cargo.");
                setCurrentLoad(currentLoad - i);
//              System.out.println("switch 2 OK");
        }
    }

    public void checkAvailable () {
        availableLoad = (getMaxLoad() - getCurrentLoad());
        setAvailableLoad(availableLoad);
        this.availableLoad = availableLoad;
    }

    public String getPlaneIdentification () {
        return planeIdentification;
    }

    private void setPlaneIdentification (String planeIdentification){
        this.planeIdentification = planeIdentification;
    }

    public boolean isFlying () {
        return isFlying;
    }

    public void setFlying ( boolean flying){
        isFlying = flying;
    }

    public int getCruiseSpeed () {
        return cruiseSpeed;
    }

    public void setCruiseSpeed ( int cruiseSpeed){
        this.cruiseSpeed = cruiseSpeed;
    }

    public String getOrigin () {
        return origin;
    }

    public void setOrigin (String origin){
        this.origin = origin;
    }

    public String getType () {
        return type;
    }

    public void setType (String type){
        this.type = type;
    }

    public boolean isAvailable () {
        return available;
    }

    public void setAvailable ( boolean available){
        this.available = available;
    }

    public int getMaxLoad () {
        return maxLoad;
    }

    protected void setMaxLoad ( int maxLoad){
        this.maxLoad = maxLoad;
    }

    public int getCurrentLoad () {
        return currentLoad;
    }

    public void setCurrentLoad ( int currentLoad){
        this.currentLoad = currentLoad;
    }

    public int getNotFittingLoad () {
        return notFittingLoad;
    }

    public void setNotFittingLoad ( int notFittingLoad){
        this.notFittingLoad = notFittingLoad;
    }

    public int getAvailableLoad () {
        return availableLoad;
    }

    public void setAvailableLoad ( int availableLoad){
        this.availableLoad = availableLoad;
    }
}