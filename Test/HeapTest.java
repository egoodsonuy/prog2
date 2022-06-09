
import org.junit.jupiter.api.Test;
import LinkedList.src.uy.edu.um.prog2.adt.Heap.MyHeap;
import LinkedList.src.uy.edu.um.prog2.adt.Heap.MyHeapImpl;
import static org.junit.jupiter.api.Assertions.*;


public class HeapTest {

    @Test
    void testInsert(){
        Integer[] arrayP = new Integer[15];
        MyHeap<Integer> heapMax = new MyHeapImpl<>(arrayP, true, false);

        heapMax.insert(5);
        heapMax.insert(7);
        heapMax.insert(3);
        heapMax.insert(10);
        heapMax.insert(12);

        assertEquals(12,arrayP[0]);
        assertEquals(10,arrayP[1]);

        Integer[] arrayP2 = new Integer[15];
        TADHeap<Integer> heapMin = new TreeHeap<>(arrayP2s,false,true);

        heapMin.insert(15);
        heapMin.insert(10);
        heapMin.insert(20);
        heapMin.insert(1);
        heapMin.insert(21);

        assertEquals(1,arrayP2[0]);
        assertEquals(21,arrayP2[4]);
    }


}
