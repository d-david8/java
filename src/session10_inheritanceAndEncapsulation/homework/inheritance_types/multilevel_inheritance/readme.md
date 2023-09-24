Package 2: Multilevel Inheritance
Domain Model: Cars
Classes:

- Car
- ElectricCar (inherits from Car)
- Tesla (inherits from ElectricCar)

Attributes:

- Car: make, model, year
- ElectricCar: batteryCapacity, range
- Tesla: autopilotVersion

Methods:

- Car: start(), stop(), accelerate()
- ElectricCar: charge()
- Tesla: enableAutopilot()