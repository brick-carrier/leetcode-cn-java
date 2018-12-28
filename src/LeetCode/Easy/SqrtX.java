package LeetCode.Easy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 69、Sqrt(x)
 Description
 Implement int sqrt(int x).

 Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

 Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

 Example 1:

 Input: 4
 Output: 2

 Example 2:

 Input: 8
 Output: 2
 Explanation: The square root of 8 is 2.82842..., and since
 the decimal part is truncated, 2 is returned.
 Tags: Binary Search, Math
 */
public class SqrtX {

    public static void main(String[] args) {
        System.out.println(sqrt(27));
    }

    public static int mySqrt(int x) {
        long n=x;
        while(n*n>x){
            n=(n+x/n)>>1;
        }
        return (int)n;
    }

    public static int sqrt(int x) {
        if (x==0)
            return 0;
        if (x>0 && x<4)
            return 1;
        int left = 1, right = x/2;
        while (true) {
            int mid = (left + right)/2;
            if (mid > 0 && mid > x/mid) {//用大于的原因，平方的意思就是相同的数相乘，如果mid乘比mid小的数都等于x，那mid*mid肯定大于x
                right = mid-1;
            } else if ((mid+1) > x/(mid+1)) {
                return mid;
            } else {
                left = mid+1;
            }
        }
    }



}
