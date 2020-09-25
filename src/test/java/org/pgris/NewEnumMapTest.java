package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.util.Collections;
import java.util.EnumMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewEnumMapTest {

	@Test
	void testEnumMap() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class);
		assertEquals(Collections.emptyMap(), result);
	}

	@Test
	void testEnumMap1() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class, Month.JANUARY, 0);
		assertElements(result, 1);
	}

	@Test
	void testEnumMap2() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class, Month.JANUARY, 0, Month.FEBRUARY, 1);
		assertElements(result, 2);
	}

	@Test
	void testEnumMap3() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class, Month.JANUARY, 0, Month.FEBRUARY, 1, Month.MARCH, 2);
		assertElements(result, 3);
	}

	@Test
	void testEnumMap4() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class, Month.JANUARY, 0, Month.FEBRUARY, 1, Month.MARCH, 2,
				Month.APRIL, 3);
		assertElements(result, 4);
	}

	@Test
	void testEnumMap5() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class, Month.JANUARY, 0, Month.FEBRUARY, 1, Month.MARCH, 2,
				Month.APRIL, 3, Month.MAY, 4);
		assertElements(result, 5);
	}

	@Test
	void testEnumMap6() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class, Month.JANUARY, 0, Month.FEBRUARY, 1, Month.MARCH, 2,
				Month.APRIL, 3, Month.MAY, 4, Month.JUNE, 5);
		assertElements(result, 6);
	}

	@Test
	void testEnumMap7() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class, Month.JANUARY, 0, Month.FEBRUARY, 1, Month.MARCH, 2,
				Month.APRIL, 3, Month.MAY, 4, Month.JUNE, 5, Month.JULY, 6);
		assertElements(result, 7);
	}

	@Test
	void testEnumMap8() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class, Month.JANUARY, 0, Month.FEBRUARY, 1, Month.MARCH, 2,
				Month.APRIL, 3, Month.MAY, 4, Month.JUNE, 5, Month.JULY, 6, Month.AUGUST, 7);
		assertElements(result, 8);
	}

	@Test
	void testEnumMapAcceptNulls() {
		EnumMap<Month, Integer> result = New.enumMap(Month.class, Month.JANUARY, 0, Month.FEBRUARY, null, Month.MARCH,
				2);
		assertEquals(0, 0, result.get(Month.JANUARY));
		Assertions.assertNull(result.get(Month.FEBRUARY));
		assertEquals(2, result.get(Month.MARCH));
	}

	private void assertElements(EnumMap<Month, Integer> result, int size) {
		for (int i = 0; i < size; i++) {
			assertEquals(i, result.get(Month.values()[i]));
		}
		assertEquals(size, result.size());
	}

}
