package algorithms;

import java.util.Arrays;

/**
 * 冒泡算法实现
 * 循环比较相邻的两个数，将较大的数放在后面
 * nums 待排序数值
 */
public class BubbleSorting {
    public static void main(String[] args) {
        int[] a = new int[]{1,12,34,23,1,12,212,34,235,45,123,234};
        System.out.println(Arrays.toString(bubblesort(a)));
    }
    //具体实现方法
    private static int[] bubblesort(int[] nums){
        int len = nums.length;
        if(len == 0 || len == 1){
            return nums;
        }
        for(int i = 0; i<len; i++){
            for(int j =0, sublen = len - 1 -i; j<sublen; j++){
                if(nums[j+1] < nums[j]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }
}
