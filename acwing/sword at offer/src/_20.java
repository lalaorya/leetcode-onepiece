import java.util.Stack;

/**
 * @Author virtual
 * @Date 2021/10/24 22:17
 * @题目描述：两个栈实现一个队列
 * https://www.acwing.com/problem/content/description/32
 */
class _20 {

    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();

    /** Initialize your data structure here. */
    public _20() {
        stack1=new Stack<Integer>();
        stack2=new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // 如果栈2不为空，弹出栈顶
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        // 否则把栈1数据逆序放到栈2
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        // 注意此时不需要把栈2数据重新放回栈1，栈1为空即可，不会对程序有影响。
        // 因为我们需要使用栈1和栈2存储全部数据
        return stack2.pop();

    }

    /** Get the front element. */
    public int peek() {
        // 同pop方法
        if(!stack2.isEmpty()){
            return stack2.peek();
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.peek();

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        // 只有栈1栈2同时为空时，队列才为空
        return stack1.empty()&&stack2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
