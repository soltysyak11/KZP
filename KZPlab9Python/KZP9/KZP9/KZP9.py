# boats/row_boat.py
class RowBoat:
    def __init__(self, oars=2, material='wood'):
        self.oars = oars
        self.material = material

    def row(self):
        print(f"Rowing the boat with {self.oars} oars made of {self.material}.")

    def get_oars_count(self):
        return self.oars

    def set_oars_count(self, count):
        self.oars = count

    def get_material(self):
        return self.material

    def set_material(self, material):
        self.material = material

    def dock(self):
        print("The rowboat is docking.")

# boats/motor_boat.py
from .row_boat import RowBoat

class MotorBoat(RowBoat):
    def __init__(self, engine_power, oars=2, material='wood', fuel_type='gasoline', max_speed=30):
        super().__init__(oars, material)
        self.engine_power = engine_power  # Engine power in horsepower
        self.fuel_type = fuel_type  # Type of fuel used by the motor
        self.max_speed = max_speed  # Maximum speed in knots

    def start_engine(self):
        print(f"Starting the engine with {self.engine_power} horsepower, running on {self.fuel_type}.")

    def stop_engine(self):
        print("Stopping the engine.")

    def get_engine_power(self):
        return self.engine_power

    def set_engine_power(self, power):
        self.engine_power = power

    def get_fuel_type(self):
        return self.fuel_type

    def set_fuel_type(self, fuel_type):
        self.fuel_type = fuel_type

    def accelerate(self):
        print(f"The motorboat is accelerating to a maximum speed of {self.max_speed} knots.")

    def anchor(self):
        print("The motorboat is anchoring.")

# boats/sail_boat.py
class SailBoat:
    def __init__(self, sail_area, material='wood'):
        self.sail_area = sail_area  # Sail area in square meters
        self.material = material

    def hoist_sail(self):
        print(f"Hoisting the sail with an area of {self.sail_area} square meters.")

    def lower_sail(self):
        print("Lowering the sail.")

    def get_sail_area(self):
        return self.sail_area

    def set_sail_area(self, sail_area):
        self.sail_area = sail_area

    def get_material(self):
        return self.material

    def set_material(self, material):
        self.material = material

    def dock(self):
        print("The sailboat is docking.")

# boats/yacht.py
from .sail_boat import SailBoat

class Yacht(SailBoat):
    def __init__(self, sail_area, engine_power, material='fiberglass', luxury_level='high'):
        super().__init__(sail_area, material)
        self.engine_power = engine_power  # Engine power in horsepower
        self.luxury_level = luxury_level  # Level of luxury: low, medium, high

    def start_engine(self):
        print(f"Starting the yacht's engine with {self.engine_power} horsepower.")

    def stop_engine(self):
        print("Stopping the yacht's engine.")

    def get_luxury_level(self):
        return self.luxury_level

    def set_luxury_level(self, level):
        self.luxury_level = level

    def entertain_guests(self):
        print(f"Entertaining guests in a {self.luxury_level} luxury level yacht.")

# main.py
from boats.motor_boat import MotorBoat
from boats.sail_boat import SailBoat
from boats.yacht import Yacht

def main():
    # Creating an instance of MotorBoat
    motor_boat = MotorBoat(engine_power=100, oars=2, material='aluminum', fuel_type='diesel', max_speed=40)
    
    # Using RowBoat functionality
    motor_boat.row()
    motor_boat.set_oars_count(4)
    motor_boat.set_material('fiberglass')
    motor_boat.row()
    motor_boat.dock()
    
    # Using MotorBoat functionality
    motor_boat.start_engine()
    motor_boat.set_engine_power(150)
    motor_boat.set_fuel_type('electric')
    motor_boat.start_engine()
    motor_boat.accelerate()
    motor_boat.anchor()
    motor_boat.stop_engine()

    # Creating an instance of SailBoat
    sail_boat = SailBoat(sail_area=50, material='canvas')
    sail_boat.hoist_sail()
    sail_boat.lower_sail()
    sail_boat.dock()

    # Creating an instance of Yacht
    yacht = Yacht(sail_area=80, engine_power=200, material='carbon fiber', luxury_level='high')
    yacht.hoist_sail()
    yacht.start_engine()
    yacht.entertain_guests()
    yacht.stop_engine()
    yacht.lower_sail()
    yacht.dock()

if __name__ == "__main__":
    main()
