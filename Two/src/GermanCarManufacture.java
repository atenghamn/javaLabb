public class GermanCarManufacture extends CarFactory{


    @Override
    protected Car createCar(String carType) {
        if (carType.equalsIgnoreCase("sportscar")){
            return new GermanSportCar();
        } else if (carType.equalsIgnoreCase("suv")) {
            return new GermanSUV();
        } else {
            return null;
        }
    }

}
