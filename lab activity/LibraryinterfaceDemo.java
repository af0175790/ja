import java.util.Scanner;
public class AdultUser implements LibraryUser{
int age;
String bookType;
Scanner s =new Scanner(System.in);

@Override 
public void registerAccount()
{
System.out.println("Enter age:");
int age = s.nextInt();
if (age>12)
{
System.out.println("You have successfully registered to adult account");
}else{
System.out.println("Sorry,age must be greater than12 to register as an adult");
}
}
@Override
public void requestBook()
{
System.out.println("Enter bookTyoe:");
String bookType = s.next();
if(bookType=="Fiction")
{
System.out.println("Book issuessuccesfully,pleasereturn the book within 7 days");
}else{
System.out.println("oops you are allowedto take adultbook");
}
}
}

public class  interface LibaryUser{
void registerAccount();
void requestBook();
}

public class LibraryinterfaceDemo{

public static void main(String [] args)
{
KidUsers k = new KidUsers();
k.registerAccount();
k.requestBook();

AdultUser a =new AdultUser();
a.registerAccount();
a.requestBook();
}
}