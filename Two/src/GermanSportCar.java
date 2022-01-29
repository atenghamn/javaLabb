public class GermanSportCar extends Car {


    @Override
    public void mountChasi() {
        System.out.println("Mounting aerodynamic chasi");
    }

    @Override
    public void mountGears() {
        System.out.println("Mounting padels to change gear");
    }

    @Override
    public void mountDrive() {
        System.out.println("Mounting a big V8-engine that will get you killed on autobahn");
    }

    @Override
    public void readyForPickup() {
        System.out.println("Your sportscar is ready for pickup, this mid-life crisis really cost you!");
    }
}
