import java.util.Scanner;
class IfelseExample{
public void show()
{
Scanner s= new Scanner (System.in);
System.out.println("Enter time");
int time =s.nextInt();
if ( time < 12)
System.out.println(" hi... good morning");

else if(time < 17)
{
System.out.println ("hi.... good afternoon");
}
else if(time <20)
{
System.out.println ("hi.... good evening");
}
else if (time <25)
{
System.out.println ("hi.... good night");
}
}

public static void main(String args[])
{
IfelseExample e= new IfelseExample();
e.show();
}
}
