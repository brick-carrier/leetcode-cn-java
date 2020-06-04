package leetcode.easy;

/**
 * (7)Reverse Integer
 Description
 Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:
 Input: 123
 Output:  321

 Example 2:
 Input: -123
 Output: -321

 Example 3:
 Input: 120
 Output: 21

 Note:
 Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 Tags: Math
 给你一个整型数，求它的逆序整型数，而且有个小坑点，当它的逆序整型数溢出的话，那么就返回 0
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(getReverseInteger( 345));
    }

    public static int getReverseInteger(int num){
        long temp=0;
        while(num!=0){
            temp=temp*10+num%10;
            num/=10;
        }
        return temp>Integer.MAX_VALUE||temp<Integer.MIN_VALUE?0:(int)temp;
    }
}
