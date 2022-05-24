public class SecondMostFreq {
    public static void main(String[] args) {
    Solution solution = new Solution();
    String a = "ababababd";
    solution.solution(a);
 }


class Solution {
     public void solution(String a) {
         int[] array = new int[26];
         char[] char_array = a.toCharArray();

         for(int i = 0; i < char_array.length; i++) {
             int index = char_array[i] - 'a';
             array[index]++;
         }
         int max = 0;
         for(int i = 0; i < array.length; i++) {
             if(array[i] > max) {
                 max = array[i];
             }
         }
     }
 }
}