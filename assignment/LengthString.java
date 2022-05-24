import java.util.Scanner;

public class LengthString
{
   public static void main(String[] args)
   {
      String str;
      int len=0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = scan.nextLine();
      
      char[] strChars = str.toCharArray();
      for(char ch: strChars)
         len++;
      
      System.out.println("\nLength of String = " +len);
   }
}