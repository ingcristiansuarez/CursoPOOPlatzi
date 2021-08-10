package CursoPOOUber.Java;



class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        
    }

    public Integer getPasseger(){
        return passenger;
    }
    
    public void setPassegenger(Integer passenger){
        this.passenger = passenger;
    }
    

    void printDataCar(){
        System.out.println("licence: "+ license + " Nombre driver: "+ driver.name + " passenger: "+passegenger);
    }
}
