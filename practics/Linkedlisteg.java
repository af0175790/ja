import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlisteg{
public static void main(String args[])
{
LinkedList<String> al = new LinkedList<String>();
 al.add("ram");
 al.add("sam");
 al.add("ravi");
 al.add("pavi");
 al.add("ram");
 al.add("rahul");
 al.add(0,"arjum");
 al.addFirst("ayshu");
 al.add(2,"keerthu");
 al.addLast("sharmi");
 
 Iterator<String> itr = al.iterator();
 while (itr.hasNext())
 {
 System.out.println(itr.next());
 }
 al.removeLast();
 al.removeFirst();
 al.remove(2);
 
 System.out.println("List after removal");
 Iterator<String> itr1 = al.iterator();
 while(itr1.hasNext())
 {
 System.out.println(itr1.next());
 }
 System.out.println("List in reverse order");
 Iterator<String> itrr =al.descendingIterator();
 while(itrr.hasNext())
 {
 System.out.println(itrr.next());
 }
 }
 }
 
 
 
 
 
