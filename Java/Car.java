package CursoPOOUber.Java;

class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("licence: "+ license + " Nombre driver: "+ driver.name + " passenger: "+passegenger);
    }
}
