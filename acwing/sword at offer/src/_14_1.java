/**
 * @Author virtual
 * @Date 2021/10/16 22:25
 * @题目描述：https://www.acwing.com/problem/content/15/
 *
 */
public class _14_1 {
    public int duplicateInArray(int[] nums) {
        // 暴力算法
        int n=nums.length;
        int count=0;
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if(nums[j]==i){
                    count++;
                }
            }
            if(count>1){
                return i;
            }
            count=0;
        }
        return -1;

    }

}
