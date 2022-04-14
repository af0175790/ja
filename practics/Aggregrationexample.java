 class Address{
  String street,city,state,country;
  int pincode;
  
  public Address (String street',city,state,country,
  int pincode){
  this.street = street;
  this.state = state;
  this.country = country;
  this.city = city;
  this.pincode = pincode;
  }
  }
  
  class  Student {
int studentId;
String studentName,courseName,centerName;
Address addr;//aggregationand adress is an entity
 
 public Student(int studentId,
String studentName,courseName,centerName, Address addr){
this.studentId = studentId;
this.studentName = studentName;
this.courseName = courseName;
this.centerName = centerName;
}
}

public void display()
{
System.out.println("Id is :" +studentId+ " " + " name is" + studentName+ " " +" course is " +courseName+ " "  +"center is" + centerName);
System.out.println(addr.street +" "+addr.city+" "+addr.state+" "+addr.country+" "+ addr.pincode);
}

class Aggregrationexample{
public static void main (String args[]){
  Address a = new Address("xyz street"," munmbai","MH","India",40076);
  Address a1 = new Address("abc road","chennai","TN","India",600043);
  
  
  Student s = new Student(101,"mamta","java","kolkata",a);
  Student s1= new Student(102,"ayshu","networking","chennai",a1);
  s.display();
  s1.display();
  }

   }