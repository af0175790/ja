// parent class
class Vehicle
{
String type = "4 wheeler";
String brand = "Suzuki";
}
// child class
class Car extends Vehicle
{
String modelName = "Ciaz";
}

// Main method class 
class SignalInhExample
{
public static void main(String[]args)
{
// creating child class object
Car c = new Car();

//displaying parent class property 
System.out.println("Car brand is:" +c.brand );
System.out.println("Car model is:" +c.modelName);

}
}
