
from boats.motor_boat import MotorBoat
from boats.sail_boat import SailBoat
from boats.yacht import Yacht

def main():
    # Creating an instance of MotorBoat
    motor_boat = MotorBoat(engine_power=100, oars=2, material='aluminum', fuel_type='diesel', max_speed=40)
    
    # Using RowBoat functionality
    print(motor_boat.row())
    motor_boat.set_oars_count(4)
    motor_boat.set_material('fiberglass')
    print(motor_boat.row())
    print(motor_boat.dock())
    
    # Using MotorBoat functionality
    print(motor_boat.start_engine())
    motor_boat.set_engine_power(150)
    motor_boat.set_fuel_type('electric')
    print(motor_boat.start_engine())
    print(motor_boat.accelerate())
    print(motor_boat.anchor())
    print(motor_boat.stop_engine())

    # Creating an instance of SailBoat
    sail_boat = SailBoat(sail_area=50, material='canvas')
    print(sail_boat.hoist_sail())
    print(sail_boat.lower_sail())
    print(sail_boat.dock())

    # Creating an instance of Yacht
    yacht = Yacht(sail_area=80, engine_power=200, material='carbon fiber', luxury_level='high')
    print(yacht.hoist_sail())
    print(yacht.start_engine())
    print(yacht.entertain_guests())
    print(yacht.stop_engine())
    print(yacht.lower_sail())
    print(yacht.dock())

if __name__ == "__main__":
    main()
    