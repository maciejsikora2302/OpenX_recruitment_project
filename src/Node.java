public class Node {
    private int value;
    private Node left = null;
    private Node right = null;

    public Node(int value) {
        this.value = value;
    }

    public void setLeft(Node node){
        this.left = node;
    }

    public void setRight(Node node){
        this.right = node;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ",\t left=" + left +
                ",\t right=" + right +
                '}';
    }
}
