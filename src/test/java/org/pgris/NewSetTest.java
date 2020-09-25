package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;

public class NewSetTest {

	@Test
	void testSet() {
		Set<String> result = New.set();
		Assertions.assertEquals(Collections.emptySet(), result);
		assertUnmodifiable(result);
	}

	@Test
	void testSet1() {
		Set<String> result = New.set("e0");
		assertElements(result, 1);
		assertUnmodifiable(result);
	}

	@Test
	void testSet2() {
		Set<String> result = New.set("e0", "e1");
		assertElements(result, 2);
		assertUnmodifiable(result);
	}

	@Test
	void testSet3() {
		Set<String> result = New.set("e0", "e1", "e2");
		assertElements(result, 3);
		assertUnmodifiable(result);
	}

	@Test
	void testSet4() {
		Set<String> result = New.set("e0", "e1", "e2", "e3");
		assertElements(result, 4);
		assertUnmodifiable(result);
	}

	@Test
	void testSet5() {
		Set<String> result = New.set("e0", "e1", "e2", "e3", "e4");
		assertElements(result, 5);
		assertUnmodifiable(result);
	}

	@Test
	void testSet6() {
		Set<String> result = New.set("e0", "e1", "e2", "e3", "e4", "e5");
		assertElements(result, 6);
		assertUnmodifiable(result);
	}

	@Test
	void testSet7() {
		Set<String> result = New.set("e0", "e1", "e2", "e3", "e4", "e5", "e6");
		assertElements(result, 7);
		assertUnmodifiable(result);
	}

	@Test
	void testSet8() {
		Set<String> result = New.set("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7");
		assertElements(result, 8);
		assertUnmodifiable(result);
	}

	@Test
	void testSet9() {
		Set<String> result = New.set("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8");
		assertElements(result, 9);
		assertUnmodifiable(result);
	}

	@Test
	void testSet10() {
		Set<String> result = New.set("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "e9");
		assertElements(result, 10);
		assertUnmodifiable(result);
	}

	@Test
	void testSetAcceptNulls() {
		Set<String> result = New.set("e0", null, "e2");
		Assertions.assertTrue(result.contains("e0"));
		Assertions.assertTrue(result.contains(null));
		Assertions.assertTrue(result.contains("e2"));
		assertUnmodifiable(result);
	}

	private void assertElements(Set<String> result, int size) {
		for (int i = 0; i < size; i++) {
			Assertions.assertTrue(result.contains("e" + i));
		}
		Assertions.assertEquals(size, result.size());
	}

	private void assertUnmodifiable(Set<String> result) {
		Assertions.assertThrows(UnsupportedOperationException.class, () -> result.add(" a string "));
	}

}
