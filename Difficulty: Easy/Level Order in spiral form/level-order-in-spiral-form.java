/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Deque<Node> deque = new ArrayDeque<>();
        deque.offer(root);
        boolean leftToRight = false;

        while (!deque.isEmpty()) {
            int size = deque.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = deque.poll();

                if (leftToRight)
                    level.add(node.data);
                else
                    level.add(0, node.data);

                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);
            }

            result.addAll(level);
            leftToRight = !leftToRight;
        }

        return result;
    }
}