public class OverloadingEg{
static int pulseMe(int x,int y)//methods
{
return x+y;//+z
}

static double pulseMe(double x,double y){
return x+y;
} public static void main(String args[])
{
int a=pulseMe(38,76);// int c = pulseMe(112,345);
double b = pulseMe(88.4,99.8);
System.out.println("int 1 value :" +a);
System.out.println(" double value :"+b);//System.out.println("int 2 value :" +c)
}
}