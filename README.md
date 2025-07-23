# 🚗 Vehicle Rental System

A Java-based Object-Oriented Vehicle Rental System that supports renting and returning various types of vehicles like Cars, Bikes, and Trucks. The project showcases the use of abstract classes, interfaces, inheritance, and encapsulation, and is designed with extensibility in mind. Final assessment of OOPs Prinicples course from learn.epam.com 

---

## 📌 Features

- Abstract base class `Vehicle` with polymorphic `calculateRentalCost` method.
- Interface `Rentable` defining contract for `rentVehicle()` and `returnVehicle()`.
- Concrete vehicle types: `Car`, `Bike`, and `Truck`.
- Rental cost calculated per vehicle type and rental duration.
- Rental management through a `RentalService` class.
- Console-based interface via `Main.java`.

---

## 🛠 Technologies Used

- **Java 8+**
- **OOP Principles** (Abstraction, Inheritance, Interface, Polymorphism)
- No external libraries required.

---

## 🧱 Class Structure

```plaintext
Vehicle (abstract)
├── Car
├── Bike
└── Truck

Interface
├── Rentable

Manager
├── RentalService
```
## 📂 Project Structure
Vehicle_Rental_System/
│
├── Vehicle.java
├── Car.java
├── Bike.java
├── Truck.java
├── Rentable.java
├── RentalService.java
└── Main.java

## 🚀 How to Run
1. Clone the repository
```bash
git clone https://github.com/alloy77/Vehicle_Rental_System.git
cd Vehicle_Rental_System
```
2. Compile the project
```bash
javac *.java
```
3. Run the program
```bash
java Main
```
