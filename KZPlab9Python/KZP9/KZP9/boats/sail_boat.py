# boats/sail_boat.py
class SailBoat:
    def __init__(self, sail_area, material='wood'):
        self.sail_area = sail_area  # Sail area in square meters
        self.material = material

    def hoist_sail(self):
        return f"Hoisting the sail with an area of {self.sail_area} square meters."

    def lower_sail(self):
        return "Lowering the sail."

    def get_sail_area(self):
        return self.sail_area

    def set_sail_area(self, sail_area):
        self.sail_area = sail_area

    def get_material(self):
        return self.material

    def set_material(self, material):
        self.material = material

    def dock(self):
        return "The sailboat is docking."