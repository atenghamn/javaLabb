public class ItalianSportCar extends Car{
    @Override
    public void mountChasi() {
        System.out.println("Mounting ferrari red chasi");
    }

    @Override
    public void mountGears() {
        System.out.println("Mounting gearbox covered in calfskin");
    }

    @Override
    public void mountDrive() {
        System.out.println("Mounting a roaring enginge that will get you killed speeding in the Dolomites");
    }

    @Override
    public void readyForPickup() {
        System.out.println("Your multimillion dollar luxury car is ready for pickup. I'll bet you work in finance");
    }
}
