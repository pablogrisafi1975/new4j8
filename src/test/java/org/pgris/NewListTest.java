package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.*;


public class NewListTest {

    @Test
    void testList() {
        List<String> result = New.list();
        Assertions.assertEquals(Collections.emptyList(), result);
        assertUnmodifiable(result);
    }

    @Test
    void testList1() {
        List<String> result = New.list("e0");
        assertElements(result, 1);
        assertUnmodifiable(result);
    }


    @Test
    void testList2() {
        List<String> result = New.list("e0", "e1");
        assertElements(result, 2);
        assertUnmodifiable(result);
    }

    @Test
    void testList3() {
        List<String> result = New.list("e0", "e1", "e2");
        assertElements(result, 3);
        assertUnmodifiable(result);
    }

    @Test
    void testList4() {
        List<String> result = New.list("e0", "e1", "e2", "e3");
        assertElements(result, 4);
        assertUnmodifiable(result);
    }


    @Test
    void testList5() {
        List<String> result = New.list("e0", "e1", "e2", "e3", "e4");
        assertElements(result, 5);
        assertUnmodifiable(result);
    }

    @Test
    void testList6() {
        List<String> result = New.list("e0", "e1", "e2", "e3", "e4", "e5");
        assertElements(result, 6);
        assertUnmodifiable(result);
    }

    @Test
    void testList7() {
        List<String> result = New.list("e0", "e1", "e2", "e3", "e4", "e5", "e6");
        assertElements(result, 7);
        assertUnmodifiable(result);
    }

    @Test
    void testList8() {
        List<String> result = New.list("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7");
        assertElements(result, 8);
        assertUnmodifiable(result);
    }

    @Test
    void testList9() {
        List<String> result = New.list("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8");
        assertElements(result, 9);
        assertUnmodifiable(result);
    }

    @Test
    void testList10() {
        List<String> result = New.list("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "e9");
        assertElements(result, 10);
        assertUnmodifiable(result);
    }

    @Test
    void testListAcceptNulls() {
        List<String> result = New.list("e0", null, "e2");
        Assertions.assertEquals("e0", result.get(0));
        Assertions.assertNull(result.get(1));
        Assertions.assertEquals("e2", result.get(2));
        assertUnmodifiable(result);
    }

    private void assertElements(List<String> result, int size) {
        for(int i = 0; i < size; i++){
            Assertions.assertEquals("e" + i, result.get(i));
        }
        Assertions.assertEquals(size, result.size());
    }


    private void assertUnmodifiable(List<String> result) {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> result.add(" a string "));
    }


}

