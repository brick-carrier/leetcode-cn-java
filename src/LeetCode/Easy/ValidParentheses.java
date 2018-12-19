package LeetCode.Easy;


import java.util.Stack;

/**
 * 20、Valid Parentheses
 Description
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.开始与结束的符号一致
 Open brackets must be closed in the correct order.要按正确的顺序结束
 Note that an empty string is also considered valid.注意空字符串也是有效的

 Example 1:
 Input: "()"
 Output: true

 Example 2:
 Input: "()[]{}"
 Output: true

 Example 3:
 Input: "(]"
 Output: false

 Example 4:
 Input: "([)]"
 Output: false

 Example 5:
 Input: "{[]}"
 Output: true

 Tags: Stack, String
 */
public class ValidParentheses {
    public static void main(String[] args) {
      String str=" () { }[ ]";
        System.out.println(isVaild(str));
//        System.out.println();
    }

    //思路1
    public static boolean isParenthesesVaild(String str){
        char[] stack=new char[str.length()+1];
        int top=1;
        for (char c:str.toCharArray()){
            if (c=='('||c=='['||c=='{'){
                stack[top++]=c;
            }else if(c==')'&&stack[--top]!='('){
                return false;
            }else if (c==']'&&stack[--top]!='['){
                return false;
            }else if (c=='}'&&stack[--top]!='{'){
                return false;
            }
        }
        return top==1;
    }

    //思路2，后进先出，需要用到栈
    public static boolean isVaild(String str){
        Stack<Character> stack=new Stack<>();
        char[] c=str.trim().toCharArray();
        if (c.length==0) return true;
        for(int i=0;i<c.length;i++){
            if (c[i]=='('||c[i]=='['||c[i]=='{'){
                stack.push(c[i]);
            }else {
                if(stack.isEmpty()) return false;
                if (c[i] == ')' && stack.pop() != '(') {//用pop不用peek，pop会弹出，peek不会
                    return false;
                } else if (c[i] == ']' && stack.pop() != '[') {
                    return false;
                } else if (c[i] == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
