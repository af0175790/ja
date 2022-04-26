public class StringMutuable{
 public static void my(){
 StringBuffer s = new StringBuffer("life");
 s.append("beautiful....");
 System.out.println("String is:" +s);//life beautiful.....
 s.insert(2,"ayshu");
 System.out.println("insert is = "+s);//liayshufe
 
 StringBuilder s1 = new StringBuilder("world");
 s1.replace(1,3,"java");
 System.out.println("replace is:" +s1);//wjavald
 s1.delete(1,3);
 System.out.println( "delete is:"+s1);//wvald
 s1.reverse();
 System.out.println("reverse is:"+s1);//dlavw
 }
 public static void main(String args[])
 {
 my();
 }}