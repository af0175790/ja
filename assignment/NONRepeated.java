public class NONRepeated{

 public static void main(String[] args) {
  String str = "zanzibar";
  
  boolean found = false;
  for(int i = 0; i < str.length(); i++){
   found = true;
   char c = str.charAt(i);
   //System.out.println("char " + c);
   for(int j = 0; j < str.length(); j++){
    //System.out.println("n-char " + str.charAt(j));
    // if found then set the boolean field as false
    // Also skip the char which is compared 
    if(c == str.charAt(j) && j != i){
     found = false;
     break;
    }
   }
   if(found){
    System.out.println("Character is "  + c);
    break;
   }
  }
  if(!found){
   System.out.println("No single character found");
  }
  
 }
}
