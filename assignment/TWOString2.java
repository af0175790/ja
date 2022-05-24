public class TWOString2 {
    public static void main(String[] args) {
        String str1 = "Walter Winchell";
        String str2 = "Mike Royko";
        String str3 = "Stephen Edwin King";

        boolean s1 = str1.equals(str3);
        boolean s2 = str2.equals(str3);

        System.out.printf("\"%s\" equals \"%s\"? %s\n", str3, str1, s1);
        System.out.printf("\"%s\" equals \"%s\"? %s\n", str3, str2, s2);


    }
}