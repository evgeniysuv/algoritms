package other;

public class BinaryTree {
    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.setLeft(new Node(2));
        rootNode.setRight(new Node(3));

        traverse(rootNode);


    }

    public static void traverse(Node node) {
        if (node == null)
            return;

        System.out.println("value = " + node.value);


        traverse(node.left);
        traverse(node.right);
    }


}

class Node {
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

    int value;

    Node left;

    Node right;
}
