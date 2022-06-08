package uy.edu.um.prog2.adt.LinkedList;

import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.LinkedList;

public class LinkedListTest {
    @Test
    public void testAdd(){
        MyList<Integer> prueba = new MyLinkedList();

        prueba.add(7);
        prueba.add(9);
        prueba.add(3);
        prueba.add(4);

        assertEquals(3, prueba.get(3));
        assertEquals(7, prueba.get(1));

        assertTrue(prueba.contains(4));
    }

    @Test

    public void testRemove(){
        MyList<Integer> prueba = new MyLinkedList();

        prueba.add(7);
        prueba.add(9);
        prueba.add(3);
        prueba.add(4);

        prueba.remove(9);
        assertNotEquals(9, prueba.get(2));

        assertFalse(prueba.contains(9));

        assertEquals(3, prueba.size());

        prueba.remove(7);
        prueba.remove(4);

        assertEquals(1, prueba.size());
    }

}

