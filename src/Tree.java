import java.util.ArrayList;
import java.util.Collections;

public class Tree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void changeRoot(Node node) {
        this.root = node;
    }

    public int calculateSum() {
        return sumOfSubTree(this.root);
    }

    private int sumOfSubTree(Node node) {
        if (node == null) {
            return 0;
        } else {
            return sumOfSubTree(node.getLeft()) + node.getValue() + sumOfSubTree(node.getRight());
        }
    }

    public double calculateAverage() {
        double sum = sumOfSubTree(this.root);
        int count = countSubTree(this.root);
        return sum / count;
    }

    private int countSubTree(Node node) {
        if (node != null) {
            return countSubTree(node.getLeft()) + 1 + countSubTree(node.getRight());
        } else {
            return 0;
        }
    }

    public int calculateMedian() {
        ArrayList<Integer> values = new ArrayList<>();
        getValuesIntoArray(this.root, values);
        Collections.sort(values);
        int size = values.size();
        if (size % 2 == 0) {
            return (values.get(size / 2) + values.get((size - 1) / 2)) / 2;
        } else {
            return values.get(size / 2);
        }
    }

    private void getValuesIntoArray(Node node, ArrayList<Integer> values) {
        if (node != null) {
            getValuesIntoArray(node.getLeft(), values);
            values.add(node.getValue());
            getValuesIntoArray(node.getRight(), values);
        }
    }

    @Override
    public String toString(){
        print(root);
        return "";
    }

    private void print(Node node){
        if(node != null){
            print(node.getLeft());
            System.out.println(node);
            print(node.getRight());
        }
    }
}
