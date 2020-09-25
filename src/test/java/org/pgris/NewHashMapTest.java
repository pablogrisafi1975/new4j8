package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NewHashMapTest {

    @Test
    void testMap() {
        Map<String, Integer> result = New.hashMap();
        assertEquals(Collections.emptyMap(), result);
        assertEquals(HashMap.class, result.getClass());
    }

    @Test
    void testMap1() {
        Map<String, Integer> result = New.hashMap("e0", 0);
        assertElements(result, 1);
        assertEquals(HashMap.class, result.getClass());
    }


    @Test
    void testMap2() {
        Map<String, Integer> result = New.hashMap("e0", 0, "e1", 1);
        assertElements(result, 2);
        assertEquals(HashMap.class, result.getClass());
    }

    @Test
    void testMap3() {
        Map<String, Integer> result = New.hashMap("e0", 0, "e1", 1, "e2", 2);
        assertElements(result, 3);
        assertEquals(HashMap.class, result.getClass());
    }

    @Test
    void testMap4() {
        Map<String, Integer> result = New.hashMap("e0", 0, "e1", 1, "e2", 2, "e3", 3);
        assertElements(result, 4);
        assertEquals(HashMap.class, result.getClass());
    }


    @Test
    void testMap5() {
        Map<String, Integer> result = New.hashMap("e0", 0, "e1", 1, "e2", 2, "e3", 3, "e4", 4);
        assertElements(result, 5);
        assertEquals(HashMap.class, result.getClass());
    }

    @Test
    void testMap6() {
        Map<String, Integer> result = New.hashMap("e0", 0, "e1", 1, "e2", 2, "e3", 3, "e4", 4, "e5", 5);
        assertElements(result, 6);
        assertEquals(HashMap.class, result.getClass());
    }

    @Test
    void testMap7() {
        Map<String, Integer> result = New.hashMap("e0", 0, "e1", 1, "e2", 2, "e3", 3, "e4", 4, "e5", 5, "e6", 6);
        assertElements(result, 7);
        assertEquals(HashMap.class, result.getClass());
    }

    @Test
    void testMap8() {
        Map<String, Integer> result = New.hashMap("e0", 0, "e1", 1, "e2", 2, "e3", 3, "e4", 4, "e5", 5, "e6", 6, "e7", 7);
        assertElements(result, 8);
        assertEquals(HashMap.class, result.getClass());
    }



    @Test
    void testMapAcceptNulls() {
        Map<String, Integer> result = New.hashMap("e0", 0, "e1",null, "e2", 2);
        assertEquals(0, 0, result.get("e0"));
        Assertions.assertNull(result.get("e1"));
        assertEquals( 2, result.get("e2"));
        assertEquals(HashMap.class, result.getClass());
    }

    private void assertElements(Map<String, Integer> result, int size) {
        for(int i = 0; i < size; i++){
            assertEquals( i, result.get("e" + i));
        }
        assertEquals(size, result.size());
    }

}

