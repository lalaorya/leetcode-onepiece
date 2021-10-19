import java.util.*;

/**
 * @Author virtual
 * @Date 2021/10/16 16:09

 * @题目描述： 唯一最小数 （给一大堆乱序的数，求只出现过一次的数中最小的数，并输出它的索引）
 * https://www.acwing.com/problem/content/description/3764/
 * 解法二 使用桶数组的方式写起来会方便得多
 */
public class _3761_2 {
    public static final int N=300000;
    public static void main(String[] args) {
        // 因为要输出的是索引，索引需要一个内部类存储额外的节点信息
        class Msg{
            public int val=0;
            public int index=0;

            public Msg(int val,int index){
                this.val=val;
                this.index=index;
            }
        }
        Scanner sc = new Scanner(System.in);

        int temp=0;
        // 定义桶
        Msg[] bucket=new Msg[N];

        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                temp=sc.nextInt();
                if(bucket[temp]==null){
                    bucket[temp]=new Msg(1,j+1);
                }else{
                    bucket[temp].val++;
                }

            }

            boolean flag=false;
            for(Msg msg:bucket){
                if(msg!=null&&msg.val==1){
                    System.out.println(msg.index);
                    flag=true;
                    break;
                }
            }

            if(!flag){
                System.out.println(-1);
            }

            Arrays.fill(bucket,0,t,null);
        }



    }
}
