package swordoffer.array;

/**
 * [剑指offer001]二维数组中的查找
 * @author Administrator
 *
 */
public class TwoDArrayQuery_001 {

	public static void main(String[] args) {
		int[][] arr={{2,5,6,8,25},{6,7,9,12,26},{7,20,21,22,27},{9,21,23,44,45}};
		boolean a=find(45, arr);
		System.out.println(a);
	}

	/**
	 *
	 * @param target
	 * @param array
	 * @return
	 */
	public static boolean find(int target,int[][] array){
		if (array==null) {
			return false;
		}
//		 boolean isExist=true;
		//第一行
		int row=0;
		//第一行最后一列
		int col=array[0].length-1;
		//数组的元素，第一行最后一列
		int temp=array[row][col];
		while(target!=temp){
			//防止数组越界
			if (col>0&&row<array.length-1) {

				if (target>temp) {//大于则往下一行
					row++;
				}else if (target<temp) {	//小于则往前一列
					col--;
				}
				temp=array[row][col];
			}else{
				return false;
			}

		}
		return true;
	}

}


