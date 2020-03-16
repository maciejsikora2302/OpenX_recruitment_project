import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class testTree {
    @Test
    public void treeSumTest(){
        Node root = new Node(5);
        root.setLeft(new Node(10));
        root.getLeft().setRight(new Node(12));
        Tree tree = new Tree(root);
        Assert.assertEquals(tree.calculateSum(), 27);
    }

    @Test
    public void treeSwapInitRootTest(){
        Node root = new Node(5);
        root.setLeft(new Node(10));
        root.getLeft().setRight(new Node(12));
        Tree tree = new Tree(root);
        Assert.assertEquals(tree.calculateSum(), 27);

        tree.changeRoot(root.getLeft().getRight());
        Assert.assertEquals(tree.calculateSum(), 12);
    }

    @Test
    public void treeAvgTest(){
        Node root = new Node(10);
        root.setRight(new Node(15));
        root.setLeft(new Node(25));
        root.getRight().setLeft(new Node(40));
        root.getRight().setRight(new Node(15));
        root.getRight().getRight().setLeft(new Node(3));

        Tree tree = new Tree(root);
        Assert.assertEquals(tree.calculateAverage(), 18.0, Math.pow(10, -5));
    }

    @Test
    public void treeMedianEvenTest(){
        Node root = new Node(5);
        root.setRight(new Node(10));
        root.setLeft(new Node(30));
        root.getRight().setRight(new Node(40));

        Tree tree = new Tree(root);
        Assert.assertEquals(tree.calculateMedian(), 20);
    }

    @Test
    public void treeMedianOddTest(){
        Node root = new Node(50);
        root.setRight(new Node(10));
        root.setLeft(new Node(30));
        root.getRight().setRight(new Node(40));
        root.getLeft().setLeft(new Node(5));

        Tree tree = new Tree(root);
        Assert.assertEquals(tree.calculateMedian(), 30);
    }
}
