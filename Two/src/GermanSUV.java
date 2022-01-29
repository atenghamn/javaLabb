public class GermanSUV extends Car {
    @Override
    public void mountChasi() {
        System.out.println("Mounting a chasi that looks like a tank");
    }

    @Override
    public void mountGears() {
        System.out.println("Mounting an automatic gearbox");
    }

    @Override
    public void mountDrive() {
        System.out.println("Mounting an fuelefficient engine");
    }

    @Override
    public void readyForPickup() {
        System.out.println("You can pickup your car and get you kids to soccerpractice");
    }
}
