class MultiCatch {
static void mFunc() {
try {
int i = 50/8;
int arr[] = new int[3];
arr[4] = 24;
}
catch(ArithmeticException e) {
System.out.println(e);
}
catch (ArrayIndexOutOfBoundsException e) {
System.out.println(e);
}
finally {
System.out.println("I am finally block");
}
}
public static void main(String[] args) {
mFunc();
}
}