package CursoPOOUber.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("IIA244", new Account("Cosme Fulanito", "123455") );
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("AAA323", new Account("Homero Thompson", "432123") );
        car2.passegenger = 5;
        car2.printDataCar();
    }
}