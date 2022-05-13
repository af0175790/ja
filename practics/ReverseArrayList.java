import java.util.ArrayList;
import java.util.Collections;


public class ReverseArrayList {
public static void main(String[] args) {
ArrayList<String> aL = new ArrayList<String>();
aL.add("Rose");
aL.add("Sunflower");
aL.add("Rose");
aL.add("Lily");
aL.add("Daisy");
aL.add("Marigold");
aL.add("Tulip");
aL.add("Jasmine");

System.out.println("Before reversing");
System.out.println(aL.toString());

Collections.reverse(aL);
System.out.println("After reversing");
System.out.println(aL);



ArrayList<Integer> aL1 = new ArrayList<Integer>();
aL1.add(20);
aL1.add(60);
aL1.add(80);
aL1.add(10); //duplicate
aL1.add(5);
aL1.add(40);
aL1.add(96);
aL1.add(22);

System.out.println("Integer sorted list");
// sorting aL1 in ascending
Collections.sort(aL1);

for(Integer i : aL1) {
System.out.println(i);
}

//sorting aL1 in descending
Collections.reverse(aL1);
System.out.println(aL1);
}
}