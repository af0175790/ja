public class ToStringExample{
int rollno;
String "name","addr";
ToStringExample (int rollno,String "name",String "addr");
{  this.rollno = rollno;
   this .name = name;
   this.addr = addr;
}
   public String ToString()
   {
   return rollno+" "+name+" "+addr;
   }
   public static void main(String args[])
   {  ToStringExample s = new ToStringExample(5,"pavi","vellor");
      ToStringExample s1 = new ToStringExample(6,"ayshu","chennai");
	   
	   System.out.println(s);//s.toString()
	   System.out.println(s1);//s1.toString
   
   }
}