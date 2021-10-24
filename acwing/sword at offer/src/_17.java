import basic.ListNode;

/**
 * @Author virtual
 * @Date 2021/10/24 0:17
 * @题目描述：https://www.acwing.com/problem/content/18/
 * 从尾到头打印链表
 * - 遍历两次
 * - 借助栈结构
 * - 遍历一次数组逆序
 *
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class _17 {
    public int[] printListReversingly(ListNode head) {
        ListNode t=head;
        int len=0;
        // 获取链表长度
        while(head!=null){
            len++;
            head=head.next;
        }
        // 从数组尾开始赋值 就不需要逆序
        int[] res=new int[len];
        while(t!=null){
            res[len-1]=t.val;
            t=t.next;
            len--;
        }
        return res;


    }
}
