package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

public class NewMapOfEntriesTest {

	@Test
	void testMap() {
		Map<String, Integer> result = New.mapOfEntries();
		Assertions.assertEquals(Collections.emptyMap(), result);
		assertUnmodifiable(result);
	}

	@Test
	void testMap1() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0));
		assertElements(result, 1);
		assertUnmodifiable(result);
	}

	@Test
	void testMap2() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1));
		assertElements(result, 2);
		assertUnmodifiable(result);
	}

	@Test
	void testMap3() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2));
		assertElements(result, 3);
		assertUnmodifiable(result);
	}

	@Test
	void testMap4() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3));
		assertElements(result, 4);
		assertUnmodifiable(result);
	}

	@Test
	void testMap5() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4));
		assertElements(result, 5);
		assertUnmodifiable(result);
	}

	@Test
	void testMap6() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5));
		assertElements(result, 6);
		assertUnmodifiable(result);
	}

	@Test
	void testMap7() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5), New.entry("e6", 6));
		assertElements(result, 7);
		assertUnmodifiable(result);
	}

	@Test
	void testMap8() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5), New.entry("e6", 6), New.entry("e7", 7));
		assertElements(result, 8);
		assertUnmodifiable(result);
	}

	@Test
	void testMap9() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5), New.entry("e6", 6), New.entry("e7", 7),
				New.entry("e8", 8));
		assertElements(result, 9);
		assertUnmodifiable(result);
	}

	@Test
	void testMap10() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5), New.entry("e6", 6), New.entry("e7", 7),
				New.entry("e8", 8), New.entry("e9", 9));
		assertElements(result, 10);
		assertUnmodifiable(result);
	}

	@Test
	void testMapAcceptNulls() {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", null), New.entry("e2", 2));
		Assertions.assertEquals(0, 0, result.get("e0"));
		Assertions.assertNull(result.get("e1"));
		Assertions.assertEquals(2, result.get("e2"));
		assertUnmodifiable(result);
	}

	private void assertElements(Map<String, Integer> result, int size) {
		for (int i = 0; i < size; i++) {
			Assertions.assertEquals(i, result.get("e" + i));
		}
		Assertions.assertEquals(size, result.size());
	}

	private void assertUnmodifiable(Map<String, Integer> result) {
		Assertions.assertThrows(UnsupportedOperationException.class, () -> result.put(" a string ", 33));
	}

}
