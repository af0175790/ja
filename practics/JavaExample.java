class A
{
public void methodA()
{
System.out.println("method of class A");
}}
class B extends A
{
public void methodB()
{
System.out.println("method of class B");
}}

class C extends A
{
public void methodC()
{
System.out.println("method of class C");
}}
class D extends A
{
public void method()
{
System.out.println("method of class D");
}}
class  JavaExample
{
public static void main(String args[])
{
B obj1 = new B();
C obj2 = new C();
D obj3 = new D(); 
// all classes can access the method of class A
obj1.methodA();
obj2.methodA();
obj3.methodA();
}}