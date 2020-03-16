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
        Assert.assertEquals(tree.calculateMedian(), 20.0, Math.pow(10,-5));
    }

    @Test
    public void treeMedianOddTest(){
        Node root = new Node(50);
        root.setRight(new Node(10));
        root.setLeft(new Node(30));
        root.getRight().setRight(new Node(40));
        root.getLeft().setLeft(new Node(5));

        Tree tree = new Tree(root);
        Assert.assertEquals(tree.calculateMedian(), 30.0, Math.pow(10,-5));
    }

    @Test
    public void treeFromTaskTest(){
        Node root = new Node(5);
        root.setLeft(new Node(3));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(2));
        root.getLeft().setRight(new Node(5));
        root.getRight().setLeft(new Node(1));
        root.getRight().setRight(new Node(0));
        root.getRight().getRight().setLeft(new Node(2));
        root.getRight().getRight().setRight(new Node(8));
        root.getRight().getRight().getRight().setRight(new Node(5));

        Tree tree = new Tree(root);

        Assert.assertEquals(tree.calculateMedian(), 4.0, Math.pow(10,-5));
        Assert.assertEquals(tree.calculateSum(), 38);
        Assert.assertEquals(tree.calculateAverage(), 3.8, Math.pow(10,-5));

        tree.changeRoot(root.getRight().getRight());

        Assert.assertEquals(tree.calculateMedian(), 3.5, Math.pow(10,-5));
        Assert.assertEquals(tree.calculateSum(), 15);
        Assert.assertEquals(tree.calculateAverage(), 3.75, Math.pow(10,-5));
    }
}
