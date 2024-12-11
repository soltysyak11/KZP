
# boats/motor_boat.py
from .row_boat import RowBoat

class MotorBoat(RowBoat):
    def __init__(self, engine_power, oars=2, material='wood', fuel_type='gasoline', max_speed=30):
        super().__init__(oars, material)
        self.engine_power = engine_power  # Engine power in horsepower
        self.fuel_type = fuel_type  # Type of fuel used by the motor
        self.max_speed = max_speed  # Maximum speed in knots

    def start_engine(self):
        return f"Starting the engine with {self.engine_power} horsepower, running on {self.fuel_type}."

    def stop_engine(self):
        return "Stopping the engine."

    def get_engine_power(self):
        return self.engine_power

    def set_engine_power(self, power):
        self.engine_power = power

    def get_fuel_type(self):
        return self.fuel_type

    def set_fuel_type(self, fuel_type):
        self.fuel_type = fuel_type

    def accelerate(self):
        return f"The motorboat is accelerating to a maximum speed of {self.max_speed} knots."

    def anchor(self):
        return "The motorboat is anchoring."