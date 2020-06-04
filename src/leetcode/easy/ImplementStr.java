package leetcode.easy;

/**
 * 28,、Implement strStr()
 Description
 Implement strStr().

 Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 Example 1:

 Input: haystack = "hello", needle = "ll"
 Output: 2

 Example 2:

 Input: haystack = "aaaaa", needle = "bba"
 Output: -1
 Clarification:

 What should we return when needle is an empty string? This is a great question to ask during an interview.

 For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 Tags:** Two Pointers, String
 */
public class ImplementStr {

    public static void main(String[] args) {
        String str="n";
        System.out.println(implementStr(str,"n"));
    }

    //5ms
    public static int implementStr(String haystack, String needle) {
        int hLEN=haystack.length(),nLen=needle.length();
        if (hLEN<nLen)return -1;
        for (int i=0;;i++){
            if (i+nLen>hLEN)return -1;
            for (int j=0;;j++){
                if (nLen==j)return i;
                if (haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
        }
    }

    //8ms
    public static int compareStr(String haystack, String needle) {
        if (needle.equals("")){
            return 0;
        }
        int hLEN=haystack.length(),nLen=needle.length();
        if (hLEN<nLen)return -1;
        int i=0;
        int j=0;
        while(i+nLen<=hLEN){
            if(haystack.charAt(i+j)!=needle.charAt(j)){
                j=0;
                ++i;
                continue;
            }
            if (j==nLen-1){
                return i;
            }
            j++;
        }
        return -1;
    }
}
