/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        return helper(root, new ArrayList<Integer>());
    }
    private static List<Integer> helper(Node root, List<Integer> list){
        if(root == null){
            return list;
        }
        list.add(root.val);
        for(Node node: root.children){
            helper(node, list);
        }
        return list;
    }
}