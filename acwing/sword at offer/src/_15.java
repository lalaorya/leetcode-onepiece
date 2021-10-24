/**
 * @Author virtual
 * @Date 2021/10/24 0:00
 * @题目描述：https://www.acwing.com/problem/content/16/
 * 很经典的题目，时间复杂度为O（max（n，m））
 */
class _15 {
    public boolean searchArray(int[][] array, int target) {
        int a=array.length-1;
        if(a==-1){
            return false;
        }
        int b=array[0].length-1;
        // 从右上角开始
        int i=0;
        int j=b;

        while(i<=a&&j>=0){
            if(array[i][j]==target){
                return true;
            }else if(array[i][j]>target){
                j=j-1;
            }else{
                i=i+1;
            }
        }
        return false;
    }
}
