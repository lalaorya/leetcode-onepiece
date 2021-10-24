/**
 * @Author virtual
 * @Date 2021/10/24 0:02
 * @题目描述：替换空格    请实现一个函数，把字符串中的每个空格替换成"%20"。
 * https://www.acwing.com/problem/content/17/
 */
public class _16 {
    public String replaceSpaces(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i)==' '?"%20":str.charAt(i));
        }
        return sb.toString();

    }
}
