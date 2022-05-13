import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ArrayListUsingIterator {
public static void main(String[] args) {
List<String> aL = new ArrayList<String>();
aL.add("Rose");
aL.add("Sunflower");
aL.add("Rose");
aL.add("Lily");
aL.add("Daisy");
aL.add("Marigold");
aL.add("Tulip");
aL.add("Jasmine");

System.out.println("traversing using for loop");
for(int i=0; i<aL.size();i++) {
System.out.println(aL.get(i));
}

System.out.println("traversing using for each loop");
for(String i : aL) {
System.out.println(i);
}

System.out.println("traversing using iterator");
Iterator itr = aL.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}

System.out.println("traversing using list…");
}}