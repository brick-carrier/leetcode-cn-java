package leetcode.easy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *(1)Two Num
 Description
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:

 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 Tags: Array, Hash Table
 中文理解:在给定的数组中找两个元素，相加为目标数值，返回这两个的索引组成的数组
 */
public class TwoNum {
            public static void main(String[] args) {
                int[] nums = new int[]{2 ,3,7, 7, 7};
                long start=System.currentTimeMillis();
                int numarr[]=getTwoNum(nums,9);
                long end=System.currentTimeMillis();
                System.out.println("花费时间------------------------------"+(end-start));
                for (Integer i:numarr
                     ) {
                    System.out.println(i);
                }
            }

            //思路1,两个for循环，若arr[i]+arr[j]=target，返回结果，时间复杂度为O(n^2)
            public static int[] getTwoNumArray(int numArr[],int target){
                for (int i=0;i<numArr.length;i++){
                    for (int j=0;j<numArr.length;j++){
                        if (numArr[i]+numArr[j]==target){
                            return new int[]{i,j};
                        }
                    }
                }
                return new int[]{};
            }

            //思路2,利用Map存储，键为已迭代的数组元素，值为元素在数组中的索引值，在循环中判断目标值减当前元素的差是否包含在map中，
            // 若存在，则根据和差相等的键返回对应的值，时间复杂度为O(n)
            //问题:由于map会覆盖重复的键，所以如果在得到结果前map加入相同的元素(键)，会出现覆盖情况，最终得到的结果跟思路1会不同。
            public static int[] getTwoNumArr(int numArr[],int target){
                Map<Integer,Integer> map=new HashMap<>();
                for (int i=0;i<numArr.length;i++){
                    if (map.containsKey(target-numArr[i])){
                        return new int[]{map.get(target-numArr[i]),i};
                    }
                    map.put(numArr[i],i);

                    /**
                     if (map.containsKey(numArr[i])){
                     return new int[]{map.get(numArr[i]),i};
                     }
                     map.put(target-numArr[i],i);

                     */
                }
                return new int[]{};
            }

            //思路3,利用List存储，list中的元素为目标数值减已经迭代的元素(target-numArr[i]),若迭代的数组元素存在于List中，
            // 则返回list中相应的索引值(numList.indexOf(numArr[i]))，由于list允许重复元素存在，若包含多个相同元素，会获取最先加入的值得索引值，结果和思路1相同
            // ，时间复杂度为O(n)

            public static int[] getTwoNum(int numArr[],int target){
                List<Integer> numList=new ArrayList<>();
                for (int i=0;i<numArr.length;i++){
                    if(numList.contains(numArr[i])){
                        return new int[]{numList.indexOf(numArr[i]),i};
                    }
                    numList.add(target-numArr[i]);
                }
                return new int[]{};
            }

}
