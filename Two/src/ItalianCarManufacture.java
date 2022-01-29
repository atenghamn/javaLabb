public class ItalianCarManufacture extends CarFactory{
    @Override
    protected Car createCar(String carType) {
        if (carType.equalsIgnoreCase("sportscar")){
            return new ItalianSportCar();
        } else if (carType.equalsIgnoreCase("suv")) {
            return new ItalianSUV();
        } else {
            return null;
        }
    }
}
