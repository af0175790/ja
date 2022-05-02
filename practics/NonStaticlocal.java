public class NonStaticlocal{
int a = 25;
private int b = 45;

void display(){
class Inner{
int res = a+b;
void show(){
System.out.println("value of res:"+res);
}}
Inner i = new Inner();
i.show();
}
public static void main(String args[])
{
NonStaticlocal c = new NonStaticlocal();
c.show();}}