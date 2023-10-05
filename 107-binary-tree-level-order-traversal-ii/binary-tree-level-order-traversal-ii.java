/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
      public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> list=new ArrayList();
    get(list,root,0);
    Collections.reverse(list);
    return list;
}
public void get(List<List<Integer>> list,TreeNode root,int lvl){
    if(root==null) return;
    List<Integer> lvlList;
    if(lvl==list.size()){
        lvlList=new ArrayList<Integer>();
        list.add(lvlList);
    }
    lvlList=list.get(lvl);
    lvlList.add(root.val);
    get(list,root.left,lvl+1);
    get(list,root.right,lvl+1);
  }
}