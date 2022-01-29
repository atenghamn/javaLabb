public abstract class CarFactory {

    public Car orderACar(String carType) {
        Car car = createCar(carType);

        car.mountChasi();
        car.mountDrive();
        car.mountGears();
        car.readyForPickup();

        return car;
    }

    protected abstract Car createCar(String carType);
}
