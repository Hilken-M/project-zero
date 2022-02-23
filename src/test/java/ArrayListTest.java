import myCollection.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayListTest {


    ArrayList<String> test1 = new ArrayList<>();
    ArrayList<String> test2 = new ArrayList<>();
    ArrayList<Object> test3 = new ArrayList<>();
    ArrayList<Object> test4 = new ArrayList<>();
    Object bird = new ArrayList();
    Object cat = new ArrayList();
    Object whale = new ArrayList();


    @Test
    void addToArrayList(){
        test1.add("Testing");
        assertTrue(test1.contains("Testing"));
    }

    @Test
     void compareElements(){
        //setup
        test1.add("Testing");
        test1.add("Foo");
        test2.add("Bar");
        test2.add("Tests");
        test3.add(bird);
        test3.add(whale);
        //test2.add("Foo");
        //exercise
        boolean isValid = (test1.compareElement("Foo"));
        boolean notValid = (test1.compareElement(bird));
        assertTrue(isValid);
        assertFalse(notValid);
    }

//    @Test
//    void enlargeArrayLengths(){
//
//    }

    @Test
    void testEquals(){
        test3.add(bird);
        test3.add(whale);
        test4.add(bird);
        test4.add(whale);
        //exercise
        boolean isValid = (test3.equals(test4));
        boolean notValid = (test1.equals(test3));
        assertTrue(isValid);
        assertFalse(notValid);
    }

    @Test
    void testEquals2(){
        test3.add(bird);
        test3.add(cat);
        test4.add(cat);
        test4.add(bird);
        test4.add(whale);
        //exercise
        boolean notValid = (test4.equals(test3));
        assertFalse(notValid);
    }

    @Test
    void contains1(){
        test4.add(bird);
        test4.add(whale);
        test3.add(bird);
        test3.add(cat);
        //exercise
        boolean notValid = (test4.contains(cat));
        assertFalse(notValid);
        boolean isValid = (test3.contains(cat));
        assertTrue(isValid);
    }

    @Test
    void returnIndex1(){
        test4.add(bird);
        test4.add(whale);
        test3.add(bird);
        test3.add(cat);
        //exercise
        assertEquals(-1, test4.returnIndex(cat));
        assertEquals(1, test3.returnIndex(cat));

    }

    @Test
    void retrieveBasedOnIndex(){
        test4.add(bird);
        test4.add(whale);
        test3.add(bird);
        test3.add(cat);
        //exercise
        assertEquals(whale, test4.getIndex(1));
        assertEquals(bird, test3.getIndex(0));
    }

}
