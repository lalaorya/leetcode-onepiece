/**
 * @Author virtual
 * @Date 2021/10/16 22:30
 * @题目描述：https://www.acwing.com/problem/content/15/
 * 类似唤醒链表的解法，相当的妙：https://www.acwing.com/solution/content/1220/
 */
public class _14_2 {
    public int duplicateInArray(int[] nums) {
        int slow=0;
        int fast=0;
        while (fast==0||fast!=slow){
            fast=nums[nums[fast]];
            slow=nums[slow];
        }

        fast=0;
        while (fast!=slow){
            fast=nums[fast];
            slow=nums[slow];
        }

        return slow;

    }
}
