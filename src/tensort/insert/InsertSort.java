package tensort.insert;

/**
 * 插入排序 平均时间复杂度O(N^2)  最坏O(N^2)  最好O(N)    稳定
 * @author Administrator
 *
 */
public class InsertSort {
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,2,3,4,5};
		insertsort(arr);
	}
	
	
	public static void insertsort(int[] arr){
		int curent=0;
		int preindex=0;
		for (int i = 1; i < arr.length; i++) {
			curent=arr[i];
			preindex=i-1;
			while(preindex>=0&&arr[preindex]>curent){
				arr[preindex+1]=arr[preindex];
				preindex--;
			}
			arr[preindex+1]=curent;
		}
	}

}
