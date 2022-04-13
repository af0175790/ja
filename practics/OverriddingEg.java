 class Bank{
 int getRateOfIntrest()
 {
 return 0;}
 }
 class  SBI extends Bank{
 int getRateOfIntrest()
 {
 return 8;}
 }
 class  ICICI extends Bank{
 int getRateOfIntrest()
 {
 return  7;}
 }
 class CANARA extends Bank{
 int getRateOfIntrest()
 {
 return 6;}
 }
 
 class OverriddingEg{
 public static void main (String args[])
 {
 SBI s = new SBI();
 ICICI i=new ICICI();
 CANARA  c = new CANARA();
 
 System .out.println("The rate of intrest in SBI: " + s.getRateOfIntrest ());
 System .out.println("the rate of intrest in ICICI: "+ i.getRateOfIntrest());
 System .out.println("The rate of intrest in CANARA: "+ c.getRateOfIntrest());
 }
 }
