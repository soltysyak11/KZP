# boats/yacht.py
from .sail_boat import SailBoat

class Yacht(SailBoat):
    def __init__(self, sail_area, engine_power, material='fiberglass', luxury_level='high'):
        super().__init__(sail_area, material)
        self.engine_power = engine_power  # Engine power in horsepower
        self.luxury_level = luxury_level  # Level of luxury: low, medium, high

    def start_engine(self):
        return f"Starting the yacht's engine with {self.engine_power} horsepower."

    def stop_engine(self):
        return "Stopping the yacht's engine."

    def get_luxury_level(self):
        return self.luxury_level

    def set_luxury_level(self, level):
        self.luxury_level = level

    def entertain_guests(self):
        return f"Entertaining guests in a {self.luxury_level} luxury level yacht."
