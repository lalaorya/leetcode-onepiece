/**
 * @Author virtual
 * @Date 2021/10/16 22:02
 * @题目描述：https://www.acwing.com/problem/content/description/14/
 * 一个无序的数组0-n,每个元素也是0-n，找出数组中任意一个重复的元素
 */
public class _13_1 {
    /**
     * 桶数组的思想，每次交换就有一个元素被移动到正确的位置，当移动不了（当前位置和待交换位置相等）时
     * 说明出现了重复元素
     * @param nums
     * @return
     */
    public int duplicateInArray(int[] nums) {
        /**
         * 先行判断
         */
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0||nums[i]>nums.length-1){
                return -1;
            }
        }

        for(int i=0;i<nums.length;i++){

            if(i==nums[i]){
                continue;
            }
            boolean res=swap(nums,nums[i],i);
            if(res==true){
                return nums[i];
            }else{
                i--;
            }
        }
        return -1;
    }

    public boolean swap(int[] nums,int i,int j){
        if(nums[i]==nums[j]){
            return true;
        }
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return false;
    }
}
