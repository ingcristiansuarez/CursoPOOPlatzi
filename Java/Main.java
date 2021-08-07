package CursoPOOUber.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car();
        car.license = "IIA244";
        car.driver = "Cosme Fulanito";
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "AAA323";
        car2.driver = "Andrea Herrera";
        car2.passegenger = 5;
        car2.printDataCar();
    }
}