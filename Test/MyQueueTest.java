
import org.junit.jupiter.api.Test;
import LinkedList.src.uy.edu.um.prog2.adt.Queue.MyQueue;
import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    @Test
    void enqueue_dequeue() {
        MyQueue<Integer> queueTest = new MyQueueImpl<>();

        queueTest.enqueue(3);
        queueTest.enqueue(5);
        queueTest.enqueue(8);
        queueTest.enqueue(11);
        queueTest.enqueue(15);

        try {
            Integer eliminado = queueTest.dequeue();
            assertEquals(3,eliminado);
        } catch (EmptyQueueException e) {
            System.out.println("Queue Empty");
        }
    }
}
