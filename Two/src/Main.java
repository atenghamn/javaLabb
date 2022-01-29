public class Main {

    public static void main(String[] args) {

        System.out.println("GERMANY");
        CarFactory audi = new GermanCarManufacture();
        Car germanFamilySUV = audi.orderACar("suv");
        Car germanSportCar = audi.orderACar("sportscar");
        System.out.println("");
        System.out.println("ITALY");
        CarFactory ferrari = new ItalianCarManufacture();
        Car italianFamilySuv = ferrari.orderACar("suv");
        Car italianSportCar = ferrari.orderACar("sportscar");
    }
}
