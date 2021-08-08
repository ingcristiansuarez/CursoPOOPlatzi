from car import Car
from account import Account

if __name__ == "__main__":
    print("hola Mundo")
    
    car = Car("AAW132", Account("Cosme Fulanito","AAAW122"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("WQR123", Account("Homero Simpson","WQR123"))
    print(vars(car2))
    print(vars(car2.driver))