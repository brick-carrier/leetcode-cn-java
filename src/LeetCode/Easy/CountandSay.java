package LeetCode.Easy;

/**
 * 38、Count and Say
 Description
 The count-and-say sequence is the sequence of integers with the first five terms as following:

 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221
 6.     312211
 7.     13112221
 8.     1113213211
 9.     31131211131221
 1 is read off as "one 1" or 11.

 11 is read off as "two 1s" or 21.

 21 is read off as "one 2, then one 1" or 1211.

 Given an integer n, generate the nth term of the count-and-say sequence.

 Note: Each term of the sequence of integers will be represented as a string.

 Example 1:

 Input: 1
 Output: "1"

 Example 2:

 Input: 4
 Output: "1211"
 Tags: String
 */
public class CountandSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(10));
    }

    public static String countAndSay(int n) {
        String str="1";
        if (n==1)return str;
        while (n>1){
          n--;
          StringBuilder sb=new StringBuilder();
          char[] c=str.toCharArray();
          int time=1;
          for (int j=1;j<c.length;j++){
                if (c[j]==c[j-1]){
                    time++;
                }else{
                    sb.append(time).append(c[j-1]);
                    time=1;
                }
          }
          str=sb.append(time).append(c[c.length-1]).toString();
        }
        return str;
    }

}
