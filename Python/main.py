from car import Car

if __name__ == "__main__":
    print("hola Mundo")
    car = Car()
    car.license = "AAW132"
    car.drive = "Cosme Fulanito"
    print(vars(car))

    car2 = Car()
    car2.license = "WQR123"
    car2.drive = "Homero Simpson"
    print(vars(car2))