public class Application {

    public static void main(String[] args) {

        Airport eindhoven = new Airport("Eindhoven");
        System.out.println("Aircraft from airport " + eindhoven.getName());
        eindhoven.printPlanes();
        System.out.println();
        eindhoven.availablePlanes();
    }
}
