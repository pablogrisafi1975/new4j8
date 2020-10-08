package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NewMapOfEntriesTest {

	@Test
	void testMap() {
		Map<String, Integer> result = New.mapOfEntries();
		Assertions.assertEquals(Collections.emptyMap(), result);
		assertUnmodifiable(result);
	}

	@Test
	void testMap1() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0));
		assertElements(result, 1);
		assertUnmodifiable(result);
		assertNullEntriesNotAllowed(1);
		assertNullKeysNotAllowed(1);
		assertNullValuesNotAllowed(1);
	}

	@Test
	void testMap2() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1));
		assertElements(result, 2);
		assertUnmodifiable(result);
		assertNullKeysNotAllowed(2);
		assertNullValuesNotAllowed(2);
	}

	@Test
	void testMap3() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2));
		assertElements(result, 3);
		assertUnmodifiable(result);
		assertNullKeysNotAllowed(3);
		assertNullValuesNotAllowed(3);
	}

	@Test
	void testMap4() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3));
		assertElements(result, 4);
		assertUnmodifiable(result);
		assertNullKeysNotAllowed(4);
		assertNullValuesNotAllowed(4);
	}

	@Test
	void testMap4NullEntry() {
		NullPointerException npe = assertThrows(NullPointerException.class,
				() -> New.mapOfEntries(New.entry("e0", 0), null, New.entry("e2", 2), New.entry("e3", 3)));
		assertEquals("e2 can not be null", npe.getMessage());
	}

	@Test
	void testMap4NullKey() {
		Map.Entry<String, String> nullKeyEntry = new AbstractMap.SimpleEntry<>(null, "v");
		NullPointerException npe = assertThrows(NullPointerException.class,
				() -> New.mapOfEntries(New.entry("e0", 0), nullKeyEntry, New.entry("e2", 2), New.entry("e3", 3)));
		assertEquals("e2.key can not be null", npe.getMessage());
	}

	@Test
	void testMap4NullValue() {
		Map.Entry<String, Integer> nullValueEntry = new AbstractMap.SimpleEntry<>("k", null);
		Map.Entry<String, Integer> entry0 = New.entry("e0", 0);
		Map.Entry<String, Integer> entry2 = New.entry("e2", 2);
		Map.Entry<String, Integer> entry3 = New.entry("e3", 3);
		NullPointerException npe = assertThrows(NullPointerException.class,
				() -> New.mapOfEntries(entry0, nullValueEntry, entry2, entry3));
		assertEquals("e2.value can not be null", npe.getMessage());
	}

	@Test
	void testMap5() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4));
		assertElements(result, 5);
		assertUnmodifiable(result);
		assertNullKeysNotAllowed(5);
		assertNullValuesNotAllowed(5);
	}

	@Test
	void testMap6() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5));
		assertElements(result, 6);
		assertUnmodifiable(result);
		assertNullKeysNotAllowed(6);
		assertNullValuesNotAllowed(6);
	}

	@Test
	void testMap7() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5), New.entry("e6", 6));
		assertElements(result, 7);
		assertUnmodifiable(result);
		assertNullKeysNotAllowed(7);
		assertNullValuesNotAllowed(7);
	}

	@Test
	void testMap8() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5), New.entry("e6", 6), New.entry("e7", 7));
		assertElements(result, 8);
		assertUnmodifiable(result);
		assertNullKeysNotAllowed(8);
		assertNullValuesNotAllowed(8);
	}

	@Test
	void testMap9() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5), New.entry("e6", 6), New.entry("e7", 7),
				New.entry("e8", 8));
		assertElements(result, 9);
		assertUnmodifiable(result);
		assertNullEntriesNotAllowed(9);
		assertNullKeysNotAllowed(9);
		assertNullValuesNotAllowed(9);

	}

	@Test
	void testMap10() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5), New.entry("e6", 6), New.entry("e7", 7),
				New.entry("e8", 8), New.entry("e9", 9));
		assertElements(result, 10);
		assertUnmodifiable(result);
		assertNullEntriesNotAllowed(10);
		assertNullKeysNotAllowed(10);
		assertNullValuesNotAllowed(10);
	}

	@Test
	void testMap11() throws NoSuchMethodException {
		Map<String, Integer> result = New.mapOfEntries(New.entry("e0", 0), New.entry("e1", 1), New.entry("e2", 2),
				New.entry("e3", 3), New.entry("e4", 4), New.entry("e5", 5), New.entry("e6", 6), New.entry("e7", 7),
				New.entry("e8", 8), New.entry("e9", 9), New.entry("e10", 10));
		assertElements(result, 11);
		assertUnmodifiable(result);
		assertNullEntriesNotAllowed(11);
		assertNullKeysNotAllowed(11);
		assertNullValuesNotAllowed(11);
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

	void assertNullEntriesNotAllowed(int size) throws NoSuchMethodException {

		Method method;
		if (size <= 10) {
			Class<?>[] parameterTypes = new Class[size];
			Arrays.fill(parameterTypes, Map.Entry.class);
			method = New.class.getMethod("mapOfEntries", parameterTypes);
		}
		else {
			method = New.class.getMethod("mapOfEntries", Map.Entry[].class);
		}

		for (int nullPosition = 0; nullPosition < size; nullPosition++) {
			Map.Entry<?, ?>[] arguments = new Map.Entry[size];
			for (int i = 0; i < size; i++) {
				arguments[i] = new AbstractMap.SimpleImmutableEntry<>("key" + (i + 1), "value" + (i + 1));
			}
			arguments[nullPosition] = null;

			Executable executable;
			if (size <= 10) {
				executable = () -> method.invoke(null, (Object[]) arguments);
			}
			else {
				executable = () -> method.invoke(null, new Object[] { arguments });
			}

			InvocationTargetException ite = assertThrows(InvocationTargetException.class, executable,
					"The call to New.mapOfEntries("
							+ Arrays.stream(arguments).map(String::valueOf).collect(Collectors.joining(", "))
							+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			assertEquals(NullPointerException.class, ite.getCause().getClass(), "The call to New.mapOfEntries("
					+ Arrays.stream(arguments).map(String::valueOf).collect(Collectors.joining(","))
					+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			NullPointerException npe = (NullPointerException) ite.getCause();
			String prefix = "e" + (nullPosition + 1);
			assertEquals(prefix + " can not be null", npe.getMessage(),
					"The call to New.mapOfEntries("
							+ Arrays.stream(arguments).map(String::valueOf).collect(Collectors.joining(", "))
							+ ") should have thrown a NullPointerException with another message");

		}
	}

	void assertNullKeysNotAllowed(int size) throws NoSuchMethodException {
		Method method;
		if (size <= 10) {
			Class<?>[] parameterTypes = new Class[size];
			Arrays.fill(parameterTypes, Map.Entry.class);
			method = New.class.getMethod("mapOfEntries", parameterTypes);
		}
		else {
			method = New.class.getMethod("mapOfEntries", Map.Entry[].class);
		}

		for (int nullPosition = 0; nullPosition < size; nullPosition++) {
			Map.Entry<?, ?>[] arguments = new Map.Entry[size];
			for (int i = 0; i < size; i++) {
				arguments[i] = new AbstractMap.SimpleImmutableEntry<>("key" + (i + 1), "value" + (i + 1));
			}
			arguments[nullPosition] = new AbstractMap.SimpleImmutableEntry<>(null, "value" + (nullPosition + 1));

			Executable executable;
			if (size <= 10) {
				executable = () -> method.invoke(null, (Object[]) arguments);
			}
			else {
				executable = () -> method.invoke(null, new Object[] { arguments });
			}
			InvocationTargetException ite = assertThrows(InvocationTargetException.class, executable,
					"The call to New.mapOfEntries("
							+ Arrays.stream(arguments).map(String::valueOf).collect(Collectors.joining(", "))
							+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			assertEquals(NullPointerException.class, ite.getCause().getClass(), "The call to New.mapOfEntries("
					+ Arrays.stream(arguments).map(String::valueOf).collect(Collectors.joining(","))
					+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			NullPointerException npe = (NullPointerException) ite.getCause();
			String prefix = "e" + (nullPosition + 1);
			assertEquals(prefix + ".key can not be null", npe.getMessage(),
					"The call to New.mapOfEntries("
							+ Arrays.stream(arguments).map(String::valueOf).collect(Collectors.joining(", "))
							+ ") should have thrown a NullPointerException with another message");

		}
	}

	void assertNullValuesNotAllowed(int size) throws NoSuchMethodException {
		Method method;
		if (size <= 10) {
			Class<?>[] parameterTypes = new Class[size];
			Arrays.fill(parameterTypes, Map.Entry.class);
			method = New.class.getMethod("mapOfEntries", parameterTypes);
		}
		else {
			method = New.class.getMethod("mapOfEntries", Map.Entry[].class);
		}

		for (int nullPosition = 0; nullPosition < size; nullPosition++) {
			Map.Entry<?, ?>[] arguments = new Map.Entry[size];
			for (int i = 0; i < size; i++) {
				arguments[i] = new AbstractMap.SimpleImmutableEntry<>("key" + (i + 1), "value" + (i + 1));
			}
			arguments[nullPosition] = new AbstractMap.SimpleImmutableEntry<>("key" + (nullPosition + 1), null);

			Executable executable;
			if (size <= 10) {
				executable = () -> method.invoke(null, (Object[]) arguments);
			}
			else {
				executable = () -> method.invoke(null, new Object[] { arguments });
			}
			InvocationTargetException ite = assertThrows(InvocationTargetException.class, executable,
					"The call to New.mapOfEntries("
							+ Arrays.stream(arguments).map(String::valueOf).collect(Collectors.joining(", "))
							+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			assertEquals(NullPointerException.class, ite.getCause().getClass(), "The call to New.mapOfEntries("
					+ Arrays.stream(arguments).map(String::valueOf).collect(Collectors.joining(","))
					+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			NullPointerException npe = (NullPointerException) ite.getCause();
			String prefix = "e" + (nullPosition + 1) + ".value";
			assertEquals(prefix + " can not be null", npe.getMessage(),
					"The call to New.mapOfEntries("
							+ Arrays.stream(arguments).map(String::valueOf).collect(Collectors.joining(", "))
							+ ") should have thrown a NullPointerException with another message");

		}
	}

}
