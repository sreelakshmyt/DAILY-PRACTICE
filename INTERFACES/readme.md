

### 1. **Vehicle Management System**

**Scenario:**
You are building a vehicle management system for a fleet company. The company manages multiple types of vehicles, such as cars, bikes, and trucks. Each vehicle can start, stop, and accelerate. Trucks have an additional method for loading cargo, while bikes and cars do not.

**Requirements:**

* Create an **interface** `Vehicle` with methods `start()`, `stop()`, and `accelerate()`.
* Create an **abstract class** `Truck` that implements `Vehicle` and has an additional abstract method `loadCargo()`.
* Create concrete classes `Car` and `Bike` that implement the `Vehicle` interface but do not need to implement `loadCargo()`.
* Create a concrete class `CargoTruck` that extends `Truck` and implements the `loadCargo()` method.

**Deliverables:**

* Define the interface `Vehicle`.
* Define the abstract class `Truck` and the concrete classes `Car`, `Bike`, and `CargoTruck`.
* Write code to demonstrate the creation of a `Car`, `Bike`, and `CargoTruck`, and show their functionality.

---


### Problem 2: **Music Player Example - Abstract Class and Interface**

Design a **MusicPlayer** application using abstract classes and interfaces. The system has different types of music players: **MP3Player** and **RadioPlayer**.

* Create an interface `Playable` with methods:

  * `void play()`: Starts playing the music.
  * `void pause()`: Pauses the music.
  * `void stop()`: Stops the music.
* Create an abstract class `AbstractPlayer` which implements `Playable` and defines some common properties such as `volume`, `isPlaying`, and `trackName`.

  * Add a method `void displayInfo()` to show the player's information (e.g., track name, volume, etc.).
* Create two concrete classes: `MP3Player` and `RadioPlayer`:

  * The `MP3Player` class should implement `play()`, `pause()`, and `stop()`. It should also have an additional method to load a track by name.
  * The `RadioPlayer` class should implement `play()`, `pause()`, and `stop()`, but its `play()` method should play a radio station instead of a song.



### 3. **Employee Management System**

**Scenario:**
You are building a system to manage employees in a company. The system should be able to calculate salaries for different types of employees (e.g., full-time and part-time). Full-time employees have a fixed salary, whereas part-time employees have an hourly rate.

**Requirements:**

* Create an **interface** `Employee` with methods `calculateSalary()` and `getDetails()`.
* Create an **abstract class** `FullTimeEmployee` that implements `Employee` and has a fixed salary.
* Create an **abstract class** `PartTimeEmployee` that implements `Employee` and has a rate per hour along with the number of hours worked.
* Create concrete classes `Manager` (who is a full-time employee) and `Intern` (who is a part-time employee).

**Deliverables:**

* Define the `Employee` interface and the abstract classes `FullTimeEmployee` and `PartTimeEmployee`.
* Implement the concrete classes `Manager` and `Intern`.
* Write code to calculate and print salaries for both full-time and part-time employees.


