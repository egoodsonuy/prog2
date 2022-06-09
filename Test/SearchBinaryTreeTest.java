

import org.junit.jupiter.api.Test;
import LinkedList.src.uy.edu.um.prog2.adt.BinaryTree.MySearchBinaryTree;
import LinkedList.src.uy.edu.um.prog2.adt.BinaryTree.MyBinarySearchTreeImpl;
import static org.junit.jupiter.api.Assertions.*;


public class SearchBinaryTreeTest {

    @Test
    public void testPrincipal() {
        MySearchBinaryTree<Integer, Integer> ArbolP = new MySearchBinaryTreeImpl<>();

        ArbolP.add(3, 478);
        ArbolP.add(5, 934);
        ArbolP.add(1, 1000);
        ArbolP.add(2, 1432);

        assertEquals(null, test.find(4));
        assertEquals(934, test.find(5));

        test.remove(1);
        test.add(1, 1111);
        assertEquals(1111, test.find(1));
    }
}
