package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;


public class NewMapTest {

    @Test
    void testMap() {
        Map<String, Integer> result = New.map();
        Assertions.assertEquals(Collections.emptyMap(), result);
        assertUnmodifiable(result);
    }

    @Test
    void testMap1() {
        Map<String, Integer> result = New.map("e0", 0);
        assertElements(result, 1);
        assertUnmodifiable(result);
    }


    @Test
    void testMap2() {
        Map<String, Integer> result = New.map("e0", 0, "e1", 1);
        assertElements(result, 2);
        assertUnmodifiable(result);
    }

    @Test
    void testMap3() {
        Map<String, Integer> result = New.map("e0", 0, "e1", 1, "e2", 2);
        assertElements(result, 3);
        assertUnmodifiable(result);
    }

    @Test
    void testMap4() {
        Map<String, Integer> result = New.map("e0", 0, "e1", 1, "e2", 2, "e3", 3);
        assertElements(result, 4);
        assertUnmodifiable(result);
    }


    @Test
    void testMap5() {
        Map<String, Integer> result = New.map("e0", 0, "e1", 1, "e2", 2, "e3", 3, "e4", 4);
        assertElements(result, 5);
        assertUnmodifiable(result);
    }

    @Test
    void testMap6() {
        Map<String, Integer> result = New.map("e0", 0, "e1", 1, "e2", 2, "e3", 3, "e4", 4, "e5", 5);
        assertElements(result, 6);
        assertUnmodifiable(result);
    }

    @Test
    void testMap7() {
        Map<String, Integer> result = New.map("e0", 0, "e1", 1, "e2", 2, "e3", 3, "e4", 4, "e5", 5, "e6", 6);
        assertElements(result, 7);
        assertUnmodifiable(result);
    }

    @Test
    void testMap8() {
        Map<String, Integer> result = New.map("e0", 0, "e1", 1, "e2", 2, "e3", 3, "e4", 4, "e5", 5, "e6", 6, "e7", 7);
        assertElements(result, 8);
        assertUnmodifiable(result);
    }



    @Test
    void testMapAcceptNulls() {
        Map<String, Integer> result = New.map("e0", 0, "e1",null, "e2", 2);
        Assertions.assertEquals(0, 0, result.get("e0"));
        Assertions.assertNull(result.get("e1"));
        Assertions.assertEquals( 2, result.get("e2"));
        assertUnmodifiable(result);
    }

    private void assertElements(Map<String, Integer> result, int size) {
        for(int i = 0; i < size; i++){
            Assertions.assertEquals( i, result.get("e" + i));
        }
        Assertions.assertEquals(size, result.size());
    }


    private void assertUnmodifiable(Map<String, Integer> result) {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> result.put(" a string ", 33));
    }


}

