package CursoPOOUber.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        UberX uberX = new UberX("IIA244", new Account("Cosme Fulanito", "123455"), "FORD", "FIESTA");
      //  uberX.passegenger = 4;
        uberX.setPassegenger(4);
        uberX.printDataCar();
/*
        Car car2 = new Car("AAA323", new Account("Homero Thompson", "432123") );
        car2.passegenger = 5;
        car2.printDataCar();
        */
    }
}