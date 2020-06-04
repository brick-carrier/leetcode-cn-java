package tensort.insert;

/**
 * 希尔排序：插入排序 平均时间复杂度O(N^1.3)  最坏O(N^2)  最好O(N)    不稳定
 * @author Administrator
 *
 */
public class ShellSort {

	public static void main(String[] args) {
		
		int[] arr={8,2,4,78,63,55,99,5};
		shellsort(arr);
		for (int i : arr) {
			System.out.printf("%d\t",i);
		}
	}
	
	public static void shellsort(int[] arr){
		if (arr==null) {
			System.out.println("null");
			return;
		}
		for (int gap=arr.length/2;gap>0;gap/=2){
			for(int i=gap;i<arr.length;i++){
				int j=i;
				int temp=arr[j];
				if (arr[j]<arr[j-gap]) {
					while(j>=0&&temp<arr[j-gap]){
						//移动
						arr[j]=arr[j-gap];
						j-=gap;
					}
					//当退出 while 后，就给 temp 找到插入的位置
					arr[j]=temp;
				}
			}
		}
		
	}
	

	public static void shell(int[] arr){
		
	}

}
