import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class testNode {
    @Test
    public void simpleNodeTest(){
        Node node = new Node(5);
        Assert.assertEquals(node.getValue(), 5);
        Assert.assertNull(node.getLeft());
        Assert.assertNull(node.getRight());
        node.setLeft(new Node(10));
        Assert.assertNotNull(node.getLeft());
    }

    @Test
    public void simpleTreePrintTest(){
        Node root = new Node(5);
        root.setLeft(new Node(3));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(10));
        System.out.println(root);
    }
}
