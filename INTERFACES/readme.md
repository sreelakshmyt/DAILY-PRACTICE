

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

### 2. **Shape Drawing Application**

**Scenario:**
You are developing a drawing application that can create different shapes such as rectangles, circles, and triangles. Each shape can be drawn and resized. The application should allow for calculating the area and perimeter of each shape.

**Requirements:**

* Create an **interface** `Shape` with methods `draw()`, `resize()`, `getArea()`, and `getPerimeter()`.
* Create an **abstract class** `AbstractShape` that implements the `Shape` interface and provides common methods like `resize()`.
* Implement concrete classes for each shape:

  * `Circle` (radius-based area and perimeter)
  * `Rectangle` (length and width-based area and perimeter)
  * `Triangle` (side-based area and perimeter)

**Deliverables:**

* Define the `Shape` interface and the `AbstractShape` abstract class.
* Implement the concrete classes `Circle`, `Rectangle`, and `Triangle`.
* Write code to demonstrate the creation of each shape, resizing them, and calculating their area and perimeter.

---

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

