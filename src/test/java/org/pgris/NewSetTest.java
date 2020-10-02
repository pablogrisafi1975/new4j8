package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NewSetTest {

	@Test
	void testSet() {
		Set<String> result = New.set();
		Assertions.assertEquals(Collections.emptySet(), result);
		assertUnmodifiable(result);
	}

	@Test
	void testSet1() {
		Set<String> result = New.set("element1");
		assertElements(result, 1);
		assertUnmodifiable(result);
	}

	@Test
	void testSet2() {
		Set<String> result = New.set("element1", "element2");
		assertElements(result, 2);
		assertUnmodifiable(result);
	}

	@Test
	void testSet2DoesNotAcceptRepeated() {
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
				() -> New.set("element1", "element1"));
		assertEquals("e2 repeats a previous element", iae.getMessage());
	}

	@Test
	void testSet3() {
		Set<String> result = New.set("element1", "element2", "element3");
		assertElements(result, 3);
		assertUnmodifiable(result);
	}

	@Test
	void testSet3DoesNotAcceptRepeated12() {
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
				() -> New.set("element1", "element1", "element3"));
		assertEquals("e2 repeats a previous element", iae.getMessage());
	}

	@Test
	void testSet3DoesNotAcceptRepeated13() {
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
				() -> New.set("element1", "element2", "element1"));
		assertEquals("e3 repeats a previous element", iae.getMessage());
	}

	@Test
	void testSet3DoesNotAcceptRepeated23() {
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
				() -> New.set("element1", "element2", "element2"));
		assertEquals("e3 repeats a previous element", iae.getMessage());
	}

	@Test
	void testSet4() throws NoSuchMethodException {
		Set<String> result = New.set("element1", "element2", "element3", "element4");
		assertElements(result, 4);
		assertUnmodifiable(result);
		assertNotRepeated(4);
		assertNullsNotAllowed(4);
	}

	@Test
	void testSet5() throws NoSuchMethodException {
		Set<String> result = New.set("element1", "element2", "element3", "element4", "element5");
		assertElements(result, 5);
		assertUnmodifiable(result);
		assertNotRepeated(5);
		assertNullsNotAllowed(5);
	}

	@Test
	void testSet6() throws NoSuchMethodException {
		Set<String> result = New.set("element1", "element2", "element3", "element4", "element5", "element6");
		assertElements(result, 6);
		assertUnmodifiable(result);
		assertNotRepeated(6);
		assertNullsNotAllowed(6);
	}

	@Test
	void testSet7() throws NoSuchMethodException {
		Set<String> result = New.set("element1", "element2", "element3", "element4", "element5", "element6",
				"element7");
		assertElements(result, 7);
		assertUnmodifiable(result);
		assertNotRepeated(7);
		assertNullsNotAllowed(7);
	}

	@Test
	void testSet8() throws NoSuchMethodException {
		Set<String> result = New.set("element1", "element2", "element3", "element4", "element5", "element6", "element7",
				"element8");
		assertElements(result, 8);
		assertUnmodifiable(result);
		assertNotRepeated(8);
		assertNullsNotAllowed(8);
	}

	@Test
	void testSet9() throws NoSuchMethodException {
		Set<String> result = New.set("element1", "element2", "element3", "element4", "element5", "element6", "element7",
				"element8", "element9");
		assertElements(result, 9);
		assertUnmodifiable(result);
		assertNotRepeated(9);
		assertNullsNotAllowed(9);
	}

	@Test
	void testSet10() throws NoSuchMethodException {
		Set<String> result = New.set("element1", "element2", "element3", "element4", "element5", "element6", "element7",
				"element8", "element9", "element10");
		assertElements(result, 10);
		assertUnmodifiable(result);
		assertNotRepeated(10);
		assertNullsNotAllowed(10);
	}

	@Test
	void testSet11() throws NoSuchMethodException {
		Set<String> result = New.set("element1", "element2", "element3", "element4", "element5", "element6", "element7",
				"element8", "element9", "element10", "element11");
		assertElements(result, 11);
		assertUnmodifiable(result);
		assertNotRepeated(11);
		assertNullsNotAllowed(11);
	}

	private void assertNotRepeated(int size) throws NoSuchMethodException {
		Method method;
		if (size <= 10) {
			Class<Object>[] parameterTypes = new Class[size];
			Arrays.fill(parameterTypes, Object.class);
			method = New.class.getMethod("set", parameterTypes);
		}
		else {
			method = New.class.getMethod("set", Object[].class);
		}

		for (int originalPosition = 0; originalPosition < size - 1; originalPosition++) {
			for (int repeatedPosition = originalPosition + 1; repeatedPosition < size; repeatedPosition++) {
				String[] arguments = new String[size];
				for (int i = 0; i < size; i++) {
					arguments[i] = "elem" + (i + 1);
				}
				arguments[repeatedPosition] = arguments[originalPosition];
				Executable executable;
				if (size <= 10) {
					executable = () -> method.invoke(null, arguments);
				}
				else {
					executable = () -> method.invoke(null, new Object[] { arguments });
				}
				InvocationTargetException ite = assertThrows(InvocationTargetException.class, executable,
						"The call to New.set(" + Arrays.stream(arguments).collect(Collectors.joining(","))
								+ ") should have thrown a IllegalArgumentException");
				IllegalArgumentException iae = (IllegalArgumentException) ite.getCause();
				assertEquals("e" + (repeatedPosition + 1) + " repeats a previous element", iae.getMessage(),
						"The call to New.set(" + Arrays.stream(arguments).collect(Collectors.joining(","))
								+ ") should have an exception with another message");
			}
		}
	}

	void assertNullsNotAllowed(int size) throws NoSuchMethodException {

		Method method;
		if (size <= 10) {
			Class<Object>[] parameterTypes = new Class[size];
			Arrays.fill(parameterTypes, Object.class);
			method = New.class.getMethod("set", parameterTypes);
		}
		else {
			method = New.class.getMethod("set", Object[].class);
		}
		for (int nullPosition = 0; nullPosition < size; nullPosition++) {
			String[] arguments = new String[size];
			for (int i = 0; i < size; i++) {
				arguments[i] = "elem" + (i + 1);
			}
			arguments[nullPosition] = null;

			Executable executable;
			if (size <= 10) {
				executable = () -> method.invoke(null, arguments);
			}
			else {
				executable = () -> method.invoke(null, new Object[] { arguments });
			}
			InvocationTargetException ite = assertThrows(InvocationTargetException.class, executable,
					"The call to New.set(" + Arrays.stream(arguments).collect(Collectors.joining(","))
							+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			assertEquals(NullPointerException.class, ite.getCause().getClass(), "The call to New.set("
					+ Arrays.stream(arguments).collect(Collectors.joining(","))
					+ ") should have thrown a NullPointerException (inside a InvocationTargetException because reflection)");
			NullPointerException npe = (NullPointerException) ite.getCause();
			assertEquals("e" + (nullPosition + 1) + " can not be null", npe.getMessage(),
					"The call to New.set(" + Arrays.stream(arguments).collect(Collectors.joining(","))
							+ ") should have thrown a NullPointerException with another message");

		}
	}

	private void assertElements(Set<String> result, int size) {
		for (int i = 0; i < size; i++) {
			Assertions.assertTrue(result.contains("element" + (i + 1)));
		}
		Assertions.assertEquals(size, result.size());
	}

	private void assertUnmodifiable(Set<String> result) {
		assertThrows(UnsupportedOperationException.class, () -> result.add(" a string "));
	}

}
