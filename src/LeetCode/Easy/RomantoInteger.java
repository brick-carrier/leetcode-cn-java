package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 13、Roman to Integer
 Description
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

 Symbol       Value
 I             1
 V             5
 X             10
 L             50
 C             100
 D             500
 M             1000
 For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

 Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

 I can be placed before V (5) and X (10) to make 4 and 9.
 X can be placed before L (50) and C (100) to make 40 and 90.
 C can be placed before D (500) and M (1000) to make 400 and 900.
 Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

 Example 1:
 Input: "III"
 Output: 3

 Example 2:
 Input: "IV"
 Output: 4

 Example 3:
 Input: "IX"
 Output: 9

 Example 4:
 Input: "LVIII"
 Output: 58
 Explanation: C = 100, L = 50, XXX = 30 and III = 3.

 Example 5:
 Input: "MCMXCIV"
 Output: 1994
 Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 Tags: Math, String
 */
public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println(romanToIntC("MMMXIII"));

    }

    public static int romanToInt(String s){
        //I1, V5, X10, L50, C100, D500 and M1000
        //IV4,IX9,XL40,XC90,CD400,CM900
        char[] c=s.toCharArray();
        int sum=0;
        if (s.indexOf("IV")!=-1)sum-=2;
        if (s.indexOf("IX")!=-1)sum-=2;
        if (s.indexOf("XL")!=-1)sum-=20;
        if (s.indexOf("XC")!=-1)sum-=20;
        if (s.indexOf("CD")!=-1)sum-=200;
        if (s.indexOf("CM")!=-1)sum-=200;
        for (int i=0;i<s.length();i++){
            if(c[i]=='I')sum+=1;
            if(c[i]=='V')sum+=5;
            if(c[i]=='X')sum+=10;
            if(c[i]=='L')sum+=50;
            if(c[i]=='C')sum+=100;
            if(c[i]=='D')sum+=500;
            if(c[i]=='M')sum+=1000;
        }

        return sum;

    }

    public static int romanToIntB(String s) {
        //I1, V5, X10, L50, C100, D500 and M1000
        //IV4,IX9,XL40,XC90,CD400,CM900
        if (s.trim().equals(""))return 0;
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len=s.length();
        int sum=map.get(s.charAt(len-1));
        for (int i=len-2;i>=0;--i){
            if (map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                sum-=map.get(s.charAt(i));
            }else{
                sum+=map.get(s.charAt(i));
            }
        }
        return  sum;
    }

    public static int romanToIntC(String s) {
        //I1, V5, X10, L50, C100, D500 and M1000
        //IV4,IX9,XL40,XC90,CD400,CM900
        int[] nums=new int[s.length()];
        for (int i=0;i<s.length();i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int j = 0; j < nums.length-1;j++) {
                if (nums[j] < nums[j + 1]) {
                    sum -= nums[j];
                } else {
                    sum += nums[j];
                }
        }
        return  sum+nums[nums.length-1];
    }
}
