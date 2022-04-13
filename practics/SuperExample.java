class Animal {
String color = "White";
}
class Dog extends Animal{
String color = "Black";

void printColor()
{
System.out.println(color);
System.out.println(super.color);
}
}

class SuperExample{
public static void main (String agrs[])
{
Dog d = new Dog();
d.printColor();
}}