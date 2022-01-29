public class ItalianSUV extends Car{
    @Override
    public void mountChasi() {
        System.out.println("Mounting a shiny chasi");
    }

    @Override
    public void mountGears() {
        System.out.println("Mounting a Fiat motor in an SUV");
    }

    @Override
    public void mountDrive() {
        System.out.println("Mounting an automatic gearbox");
    }

    @Override
    public void readyForPickup() {
        System.out.println("You can come and have an espresso in your new italian SUV");
    }
}
