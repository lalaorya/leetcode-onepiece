/**
 * @Author virtual
 * @Date 2021/10/16 22:07
 * @题目描述：https://www.acwing.com/problem/content/description/14/
 * 一个无序的数组0-n,每个元素也是0-n，找出数组中任意一个重复的元素
 */
class _13_2 {
    // 解法一有些不够优雅，但是思想都一样，时间复杂度为O（N）
    public int duplicateInArray(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0||nums[i]>nums.length-1){
                return -1;
            }
        }

        for(int i=0;i<nums.length;i++){

            // 这种情况下要一直交换
            while(i!=nums[i]&&nums[i]!=nums[nums[i]]){
                swap(nums,i,nums[i]);
            }
            if(i!=nums[i]){
                return nums[i];
            }
        }
        return -1;
    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
}
