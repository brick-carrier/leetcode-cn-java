package leetcode.easy;

/**
 * Palindrome Number
 Description
 Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

 Example 1:

 Input: 121
 Output: true
 Example 2:

 Input: -121
 Output: false
 Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 Example 3:

 Input: 10
 Output: false
 Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 Follow up:

 Coud you solve it without converting the integer to a string?

 Tags: Math
 判断一个有符号整型数是否是回文
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isHasPalindrome(10010));
//        System.out.println(18/10);
    }

    public static boolean isHasPalindrome(int num){
        if (num<=0||num%10==0) return false;
        int temp=0;
        int cpNum=num;
        while(num>0){
            temp=temp*10+num%10;
            num/=10;
        }
        return cpNum==temp;
    }
}
