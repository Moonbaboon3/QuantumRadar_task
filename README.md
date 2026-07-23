# Quantum Radar task

### CarTypes.java 
    enum class to be used as datatype for carType field in Car.java

### Car.java 
   - absract class to store car data and have abstract methods that handles rules violation checking
    those methods will be implemented by the extended classes: "Bus", "PrivateCar", "Truck"

   - Methods checkSpeed and checkSeatBealtStatus are base and the blueprint implemented in parent class 
    since they rely in variables of implemented classes using abstract get methods (getSpeedLimit, getSpeedFees, getSeatBelt)

   - The two methods above are integrated in one main abstract function checkViolations() , providing extendability for implemented cars to add other check  rules

### Maiin.java (the radar)
    - instances of cars are created and appended to car list , then getReport is called to print the data in same format specificied in the task requirement