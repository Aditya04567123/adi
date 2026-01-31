package adityanathapplication;

abstract class Vehicle {
   abstract void start();
}
class Car extends Vehicle {
 void start() {
     System.out.println("Car is starting with key ignition or push button");
 }
}
class Bike extends Vehicle {
 void start() {
     System.out.println("Bike is starting with a kick or self-start");
 }
}
public class VehicleDemo {
 public static void main(String[] args) {

     Vehicle myCar = new Car();  
     Vehicle myBike = new Bike();

     myCar.start();   
     myBike.start();  
 }
}


