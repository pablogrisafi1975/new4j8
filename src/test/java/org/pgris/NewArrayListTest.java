package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewArrayListTest {

	@Test
	void testArrayList() {
		List<String> result = New.arrayList();
		assertEquals(Collections.emptyList(), result);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList1() {
		List<String> result = New.arrayList("e0");
		assertElements(result, 1);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList2() {
		List<String> result = New.arrayList("e0", "e1");
		assertElements(result, 2);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList3() {
		List<String> result = New.arrayList("e0", "e1", "e2");
		assertElements(result, 3);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList4() {
		List<String> result = New.arrayList("e0", "e1", "e2", "e3");
		assertElements(result, 4);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList5() {
		List<String> result = New.arrayList("e0", "e1", "e2", "e3", "e4");
		assertElements(result, 5);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList6() {
		List<String> result = New.arrayList("e0", "e1", "e2", "e3", "e4", "e5");
		assertElements(result, 6);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList7() {
		List<String> result = New.arrayList("e0", "e1", "e2", "e3", "e4", "e5", "e6");
		assertElements(result, 7);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList8() {
		List<String> result = New.arrayList("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7");
		assertElements(result, 8);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList9() {
		List<String> result = New.arrayList("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8");
		assertElements(result, 9);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayList10() {
		List<String> result = New.arrayList("e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "e9");
		assertElements(result, 10);
		assertEquals(ArrayList.class, result.getClass());
	}

	@Test
	void testArrayListAcceptNulls() {
		List<String> result = New.arrayList("e0", null, "e2");
		assertEquals("e0", result.get(0));
		Assertions.assertNull(result.get(1));
		assertEquals("e2", result.get(2));
		assertEquals(ArrayList.class, result.getClass());
	}

	private void assertElements(List<String> result, int size) {
		for (int i = 0; i < size; i++) {
			assertEquals("e" + i, result.get(i));
		}
		assertEquals(size, result.size());
	}

}
