package swordoffer.string;

/**
 * [剑指offer002]替换字符串空格
 * @author Administrator
 *
 */
public class ReplaceSpace_002 {

	public static void main(String[] args) {
		System.out.println(replacespace(new StringBuffer("     ")));
	}

	public static String replacespace(StringBuffer str){
		if(str==null){
			return null;
		}
		StringBuffer res=new StringBuffer();
		int len=str.length();
		for(int i=0;i<len;i++){
			if (str.charAt(i)==' ') {
				res.append("%");
				res.append("2");
				res.append("0");
			}else{
				res.append(str.charAt(i));
			}
		}
		return res.toString();
	}

}
