''' 
there are two types of variables 
1.instance variable
2.class or static variable
'''
class car:
    wheels=4
    def __init__(self):
        self.mil=10
        self.com='Tesla'
cars=car()
cars1=car()
print(cars.mil,cars.com,cars.wheels)
car.wheels=6
print(f"change in class wheels={car.wheels}")
cars.wheels=8
print(f"change in object wheels={cars.wheels}")
print(f"object2 wheels{cars1.wheels}")
