import basic.TreeNode;
/**
 * @Author virtual
 * @Date 2021/10/24 22:08
 * @题目描述：https://www.acwing.com/problem/content/description/31/
 * 二叉树中序遍历的下一个节点 笔试面试重点题 分情况讨论
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode father;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class _19 {
    public TreeNode inorderSuccessor(TreeNode p) {
        // 分情况讨论
        // 1.如果有右子树，右子树的最左节点就是下一个节点
        // 2.如果是左孩子，那么父亲就是下一个节点
        // 3.如果是右孩子，向上遍历直至该节点是父亲左孩子，父亲是下一个节点
        if(p.right!=null){
            p=p.right;
            while(p.left!=null){
                p=p.left;
            }
            return p;
        }
        if(p.father==null)  return null;
        if(p==p.father.left){
            return p.father;
        }else{
            p=p.father;
            while(p.father!=null&&p!=p.father.left){
                p=p.father;
            }
            return p.father==null?null:p.father;
        }



    }
}