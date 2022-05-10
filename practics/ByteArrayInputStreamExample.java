public class ByteArrayInputStreamExample{

public static void main(String args[])
{ byte [] arr = {68,37,35,70,39};

ByteArrayInputStreamExample bin = new ByteArrayInputStreamExample(arr);
int i = 0;
while ((i = bin.read())!= -1){
char ch = (char)i;
System.out.println("ASCII charcter " +i+" value is"+ch);
}
}
}
}}






