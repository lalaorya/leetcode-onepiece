import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author virtual
 * @Date 2021/10/16 15:52
 * @题目描述：唯一最小数 （给一大堆乱序的数，求只出现过一次的数中最小的数，并输出它的索引）
 *              https://www.acwing.com/problem/content/description/3764/
 */
public class _3761 {
    public static void main(String[] args) {
        /**
         * 内部类，节点信息
         */
        class Msg{
            private boolean repeat;
            private int index;

            public Msg(boolean val,int index){
                this.repeat=val;
                this.index=index;
            }
        }


        Scanner sc = new Scanner(System.in);

        int min=Integer.MAX_VALUE;
        int temp=0;
        Map<Integer,Msg> map=new HashMap<>();

        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                temp=sc.nextInt();
                if(map.containsKey(temp)){
                    map.put(temp,new Msg(false,-1));
                    continue;
                }
                map.put(temp,new Msg(true,j+1));

            }
            if(map.isEmpty()){
                System.out.println(-1);
                continue;
            }
            Set<Integer> set=map.keySet();
            for(Integer ii:set){
                Msg msg = map.get(ii);
                if(msg.repeat==true){
                    min=ii<min?ii:min;
                }

            }
            if(map.get(min)!=null){
                System.out.println(map.get(min).index);
            }else
                System.out.println(-1);

            min=Integer.MAX_VALUE;
            map.clear();
        }

    }

}
