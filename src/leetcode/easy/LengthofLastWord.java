package leetcode.easy;

/**
 * 58、Length of Last Word
 Description
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 Example:

 Input: "Hello World"
 Output: 5
 Tags: String
 */
public class LengthofLastWord {
    public static void main(String[] args) {
        String s="asdm  q  a      ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int temp=0;
        for (int i=s.length()-1;i>=0;i--){
            if (temp!=0&&s.charAt(i)==' '){
                break;
            }
            if (s.charAt(i)!=' '){
                temp++;
            }
        }
        return temp;
    }


}
