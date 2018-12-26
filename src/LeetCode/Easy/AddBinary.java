package LeetCode.Easy;

/**
 * 67、Add Binary
 Description
 Given two binary strings, return their sum (also a binary string).

 The input strings are both non-empty and contains only characters 1 or 0.

 Example 1:

 Input: a = "11", b = "1"
 Output: "100"

 Example 2:

 Input: a = "1010", b = "1011"
 Output: "10101"
 Tags: Math, String
 */
public class AddBinary {
    public static void main(String[] args) {
        String a="11";
        String b="11111";
        System.out.println(addBinaryB(a,b));
    }

    public static String addBinary(String a, String b){
        int alen=a.length()-1,blen=b.length()-1,carry=0;
        StringBuilder sb=new StringBuilder();
        while (alen>=0&&blen>=0){
                carry+=a.charAt(alen--)-'0';
                carry+=b.charAt(blen--)-'0';
                sb.insert(0,(char)(carry%2+'0'));
                carry>>=1;
        }
        while(alen>=0){
            carry+=a.charAt(alen--)-'0';
            sb.insert(0,(char)(carry%2+'0'));
            carry>>=1;
        }
        while(blen>=0){
            carry+=b.charAt(blen--)-'0';
            sb.insert(0,(char)(carry%2+'0'));
            carry>>=1;
        }
        if (carry==1){
            sb.insert(0,'1');
        }
        return sb.toString();

    }
    public static String addBinaryB(String a, String b){
        char[] ac=a.toCharArray();
        char[] bc=b.toCharArray();
        if (ac.length<bc.length){
            return addBinaryB(b,a);
        }
        StringBuilder sb=new StringBuilder();
        int len=ac.length-bc.length;
        char carry='0';
        int i=ac.length-1;
        for (;i-len>=0;i--){
            if (ac[i]=='1'&&bc[i-len]=='1'){
                ac[i]=carry;
                carry='1';
            }else if (ac[i]=='1'||bc[i-len]=='1'){
                ac[i]=carry=='1'?'0':'1';
            }else{
                ac[i]=carry;
                carry='0';
            }
        }
        for (;i>=0;i--){
            if (ac[i]=='1'&&carry=='1'){
                ac[i]='0';
            }else{
               ac[i]=carry=='1'?'1':ac[i];
               carry='0';
            }
        }
        if (carry=='1'){
            sb.append(carry).append(String.valueOf(ac));
            return sb.toString();
        }
        return String.valueOf(ac);
    }

}
