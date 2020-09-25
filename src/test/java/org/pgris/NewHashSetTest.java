package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NewHashSetTest {

    @Test
    void testHashSet() {
        Set<String> result = New.hashSet();
        assertEquals(Collections.emptySet(), result);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    void testHashSet1() {
        Set<String> result = New.hashSet("e0");
        assertElements(result, 1);
        assertEquals(HashSet.class, result.getClass());
    }


    @Test
    void testHashSet2() {
        Set<String> result = New.hashSet("e0", "e1");
        assertElements(result, 2);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    void testHashSet3() {
        Set<String> result = New.hashSet("e0", "e1", "e2");
        assertElements(result, 3);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    void testHashSet4() {
        Set<String> result = New.hashSet("e0", "e1", "e2", "e3");
        assertElements(result, 4);
        assertEquals(HashSet.class, result.getClass());
    }


    @Test
    void testHashSet5() {
        Set<String> result = New.hashSet("e0", "e1", "e2", "e3", "e4");
        assertElements(result, 5);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    void testHashSet6() {
        Set<String> result = New.hashSet("e0", "e1", "e2", "e3", "e4", "e5");
        assertElements(result, 6);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    void testHashSet7() {
        Set<String> result = New.hashSet("e0", "e1", "e2", "e3", "e4", "e5", "e6");
        assertElements(result, 7);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    void testHashSet8() {
        Set<String> result = New.hashSet("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7");
        assertElements(result, 8);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    void testHashSet9() {
        Set<String> result = New.hashSet("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8");
        assertElements(result, 9);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    void testHashSet10() {
        Set<String> result = New.hashSet("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "e9");
        assertElements(result, 10);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    void testHashSetAcceptNulls() {
        Set<String> result = New.hashSet("e0", null, "e2");
        Assertions.assertTrue(result.contains("e0"));
        Assertions.assertTrue(result.contains(null));
        Assertions.assertTrue(result.contains("e2"));
        assertEquals(HashSet.class, result.getClass());
    }

    private void assertElements(Set<String> result, int size) {
        for(int i = 0; i < size; i++){
            Assertions.assertTrue(result.contains("e" + i));
        }
        assertEquals(size, result.size());
    }
}

