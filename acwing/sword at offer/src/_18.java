import basic.TreeNode;

import java.util.HashMap;

/**
 * @Author virtual
 * @Date 2021/10/24 0:52
 * @题目描述：根据前序遍历结果和中序遍历结果重建二叉树
 * https://www.acwing.com/problem/content/description/23/
 *
 * Definition for a binary tree node.
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class _18 {
    // 需要在中序数组中高效找到索引位置，因此使用哈希表
    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return dfs(preorder,0,preorder.length-1,inorder,0,inorder.length-1);

    }
    /**
     * 解法就是递归，前序遍历第一个元素为根节点
     * 通过根节点在中序遍历遍历的位置可以得知
     *          左子树的前序遍历和中序遍历以及右子树的前序遍历和中序遍历
     * 对另外部分递归 注意边界问题
     *
     */
    public TreeNode dfs(int[] preorder,int pi,int pj,int[] inorder,int ii,int ij){
        if(pi>pj || ii>ij){
            return null;
        }
        TreeNode root = new TreeNode(preorder[pi]);
        int t=map.get(root.val);
        int before=t-ii;
        int after=ij-t-1;
        root.left = dfs(preorder,pi+1,pi+before,inorder,ii,t-1);
        root.right = dfs(preorder,pi+before+1,pj,inorder,t+1,ij);
        return root;




    }
}