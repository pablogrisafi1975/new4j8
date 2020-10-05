package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NewMapTest {

	@Test
	void testMap() {
		Map<String, Integer> result = New.map();
		Assertions.assertEquals(Collections.emptyMap(), result);
		assertUnmodifiable(result);
	}

	@Test
	void testMap1() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1);
		assertElements(result, 1);
		assertUnmodifiable(result);
		assertNullsNotAllowed(1);
	}

	@Test
	void testMap2() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1, "k2", 2);
		assertElements(result, 2);
		assertUnmodifiable(result);
		assertNullsNotAllowed(2);
		assertNoKeyRepeated(2);
	}

	@Test
	void testMap3() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1, "k2", 2, "k3", 3);
		assertElements(result, 3);
		assertUnmodifiable(result);
		assertNullsNotAllowed(3);
		assertNoKeyRepeated(3);

	}

	@Test
	void testMap4() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1, "k2", 2, "k3", 3, "k4", 4);
		assertElements(result, 4);
		assertUnmodifiable(result);
		assertNullsNotAllowed(4);
		assertNoKeyRepeated(4);

	}

	@Test
	void testMap5() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1, "k2", 2, "k3", 3, "k4", 4, "k5", 5);
		assertElements(result, 5);
		assertUnmodifiable(result);
		assertNullsNotAllowed(5);
		assertNoKeyRepeated(5);

	}

	@Test
	void testMap6() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1, "k2", 2, "k3", 3, "k4", 4, "k5", 5, "k6", 6);
		assertElements(result, 6);
		assertUnmodifiable(result);
		assertNullsNotAllowed(6);
		assertNoKeyRepeated(6);

	}

	@Test
	void testMap7() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1, "k2", 2, "k3", 3, "k4", 4, "k5", 5, "k6", 6, "k7", 7);
		assertElements(result, 7);
		assertUnmodifiable(result);
		assertNullsNotAllowed(7);
		assertNoKeyRepeated(7);

	}

	@Test
	void testMap8() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1, "k2", 2, "k3", 3, "k4", 4, "k5", 5, "k6", 6, "k7", 7, "k8", 8);
		assertElements(result, 8);
		assertUnmodifiable(result);
		assertNullsNotAllowed(8);
		assertNoKeyRepeated(8);

	}

	@Test
	void testMap9() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1, "k2", 2, "k3", 3, "k4", 4, "k5", 5, "k6", 6, "k7", 7, "k8", 8,
				"k9", 9);
		assertElements(result, 9);
		assertUnmodifiable(result);
		assertNullsNotAllowed(9);
		assertNoKeyRepeated(9);

	}

	@Test
	void testMap10() throws NoSuchMethodException {
		Map<String, Integer> result = New.map("k1", 1, "k2", 2, "k3", 3, "k4", 4, "k5", 5, "k6", 6, "k7", 7, "k8", 8,
				"k9", 9, "k10", 10);
		assertElements(result, 10);
		assertUnmodifiable(result);
		assertNullsNotAllowed(10);
		assertNoKeyRepeated(10);

	}

	private void assertElements(Map<String, Integer> result, int size) {
		for (int i = 0; i < size; i++) {
			Assertions.assertEquals(i + 1, result.get("k" + (i + 1)));
		}
		Assertions.assertEquals(size, result.size());
	}

	private void assertUnmodifiable(Map<String, Integer> result) {
		Assertions.assertThrows(UnsupportedOperationException.class, () -> result.put(" a string ", 33));
	}

	void assertNullsNotAllowed(int size) throws NoSuchMethodException {
		Class[] parameterTypes = new Class[size * 2];
		Arrays.fill(parameterTypes, Object.class);
		Method method = New.class.getMethod("map", parameterTypes);

		for (int nullPosition = 0; nullPosition < size * 2; nullPosition++) {
			String[] arguments = new String[size * 2];
			for (int i = 0; i < size * 2; i++) {
				if (i % 2 == 0) {
					arguments[i] = "key" + (i / 2 + 1);
				}
				if (i % 2 == 1) {
					arguments[i] = "value" + ((i + 1) / 2);
				}
			}
			arguments[nullPosition] = null;

			Executable executable = () -> method.invoke(null, arguments);

			InvocationTargetException ite = assertThrows(InvocationTargetException.class, executable,
					"The call to New.map(" + Arrays.stream(arguments).collect(Collectors.joining(", "))
							+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			assertEquals(NullPointerException.class, ite.getCause().getClass(), "The call to New.map("
					+ Arrays.stream(arguments).collect(Collectors.joining(","))
					+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			NullPointerException npe = (NullPointerException) ite.getCause();
			String prefix = nullPosition % 2 == 0 ? "k" + (nullPosition / 2 + 1) : "v" + ((nullPosition + 1) / 2);
			assertEquals(prefix + " can not be null", npe.getMessage(),
					"The call to New.set(" + Arrays.stream(arguments).collect(Collectors.joining(", "))
							+ ") should have thrown a NullPointerException with another message");

		}
	}

	private void assertNoKeyRepeated(int size) throws NoSuchMethodException {

		Class<Object>[] parameterTypes = new Class[size * 2];
		Arrays.fill(parameterTypes, Object.class);
		Method method = New.class.getMethod("map", parameterTypes);

		for (int originalPosition = 0; originalPosition < size - 1; originalPosition++) {
			for (int repeatedPosition = originalPosition + 1; repeatedPosition < size; repeatedPosition++) {
				String[] arguments = new String[size * 2];
				for (int i = 0; i < size; i++) {
					arguments[i * 2] = "key" + (i + 1);
					arguments[i * 2 + 1] = "value" + (i + 1);
				}
				arguments[repeatedPosition * 2] = arguments[originalPosition * 2];
				Executable executable = () -> method.invoke(null, arguments);

				InvocationTargetException ite = assertThrows(InvocationTargetException.class, executable,
						"The call to New.map(" + Arrays.stream(arguments).collect(Collectors.joining(", "))
								+ ") should have thrown a IllegalArgumentException");
				IllegalArgumentException iae = (IllegalArgumentException) ite.getCause();
				assertEquals("k" + (repeatedPosition + 1) + " repeats a previous key", iae.getMessage(),
						"The call to New.map(" + Arrays.stream(arguments).collect(Collectors.joining(", "))
								+ ") should have an exception with another message");
			}
		}
	}

}
