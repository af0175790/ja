public class STRINGMETHOD{
public void show()
{
String a = "Anudip is the best trining center";
String a1 = "  AYSHU  ";
System.out.println("upper case is:"+a.toUpperCase());
System.out.println("lower case is:"+a1.toLowerCase());
System.out.println("trim is:"+a.trim());
System.out.println("startwith is:"+a.startsWith("Anu"));//true
System.out.println("endwith is:"+a.endsWith("err"));//false
System.out.println("charAT is:"+a.charAt(3));
System.out.println("charAT is:"+a.charAt(15));
System.out.println("length is:"+a.length());

int b = 20;
String a2 = String.valueOf(b);
System.out.println(a2+40);
System.out.println("replace is:"+a.replace("Development","Career development"));
}
public static void main(String args[])
{
STRINGMETHOD obj = new STRINGMETHOD();
obj.show();
}
}