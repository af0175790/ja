import java.util.ArrayList;
import java.util.ListIterator;

class IteratorArray{
  public static void main(String[] args) {
    
    ArrayList <Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(3);
    numbers.add(2);
    System.out.println("ArrayList: " + numbers);

    
    ListIterator<Integer> iterate = numbers.listIterator();
    System.out.println("Iterating over ArrayList:");
    while(iterate.hasNext()) 
	{
      System.out.print(iterate.next() + ", ");
    }
  }
}