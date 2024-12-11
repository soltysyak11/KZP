# boats/row_boat.py
class RowBoat:
    def __init__(self, oars=2, material='wood'):
        self.oars = oars
        self.material = material

    def row(self):
        return f"Rowing the boat with {self.oars} oars made of {self.material}."

    def get_oars_count(self):
        return self.oars

    def set_oars_count(self, count):
        self.oars = count

    def get_material(self):
        return self.material

    def set_material(self, material):
        self.material = material

    def dock(self):
        return "The rowboat is docking."