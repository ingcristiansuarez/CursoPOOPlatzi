/*function Car(license, driver){
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
}

Cars.prototype.printDataCar = function(){
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}
*/
class Car {
    constructor (license, driver){
        this.license = license
        this.driver = driver
        this.id
        this.passenger
    }

    printDataCar = () => {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}