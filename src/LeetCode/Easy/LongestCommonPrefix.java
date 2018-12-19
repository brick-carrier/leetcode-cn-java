package LeetCode.Easy;



/**
 * 14、Longest Common Prefix
 Description
 Write a function to find the longest common prefix string amongst an array of strings.

 If there is no common prefix, return an empty string "".

 Example 1:
 Input: ["flower","flow","flight"]
 Output: "fl"

 Example 2:
 Input: ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.
 Note:

 All given inputs are in lowercase letters a-z.

 Tags: String
 获取String数组里字符串的最长公共前缀
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs={"string","sriii","stringiting"};
        System.out.println(getCommonPrefix(strs));
//        System.out.println("ctttttttttttttttttttpa".compareTo("com"));
    }

    //思路1
    public static String getCommonPrefix(String[] strs){
        int strLen=strs.length;
        if (strLen==0) return "";
        int minLen = 0x7fffffff;
        for (String str:strs
             ) {
            minLen=Math.min(minLen,str.length());
        }
        for (int i=0;i<minLen;i++){
            for (int j=1;j<strLen;j++){
                if (strs[0].charAt(i)!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLen);
    }

    //思路2,强
    public static String longestCommmonPrefix(String[] strs){
        int strLen=strs.length;
        String prefix="";
        if (strLen!=0){
            prefix=strs[0];
        }
        for (int i=1;i<strLen;i++){
            while (!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
