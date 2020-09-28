package org.pgris;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NewListTest {

	@Test
	void testList() {
		List<String> result = New.list();
		assertEquals(Collections.emptyList(), result);
		assertUnmodifiable(result);
	}

	@Test
	void testList1() {
		List<String> result = New.list("element1");
		assertElements(result, 1);
		assertUnmodifiable(result);
	}

	@Test
	void testList1NotNulls() {
		NullPointerException npe = assertThrows(NullPointerException.class, () -> New.list((Object) null));
		assertEquals("e1 can not be null", npe.getMessage());
	}

	@Test
	void testList2() {
		List<String> result = New.list("element1", "element2");
		assertElements(result, 2);
		assertUnmodifiable(result);
	}

	@Test
	void testList2NotNulls1() {
		NullPointerException npe = assertThrows(NullPointerException.class, () -> New.list(null, "2"));
		assertEquals("e1 can not be null", npe.getMessage());
	}

	@Test
	void testList2NotNulls2() {
		NullPointerException npe = assertThrows(NullPointerException.class, () -> New.list("1", null));
		assertEquals("e2 can not be null", npe.getMessage());
	}

	@Test
	void testList3() {
		List<String> result = New.list("element1", "element2", "element3");
		assertElements(result, 3);
		assertUnmodifiable(result);
	}

	@Test
	void testList3NotNulls1() {
		NullPointerException npe = assertThrows(NullPointerException.class, () -> New.list(null, "2", "3"));
		assertEquals("e1 can not be null", npe.getMessage());
	}

	@Test
	void testList3NotNulls2() {
		NullPointerException npe = assertThrows(NullPointerException.class, () -> New.list("1", null, "3"));
		assertEquals("e2 can not be null", npe.getMessage());
	}

	@Test
	void testList3NotNulls3() {
		NullPointerException npe = assertThrows(NullPointerException.class, () -> New.list("1", "2", null));
		assertEquals("e3 can not be null", npe.getMessage());
	}

	@Test
	void testList4() throws NoSuchMethodException {
		List<String> result = New.list("element1", "element2", "element3", "element4");
		assertElements(result, 4);
		assertUnmodifiable(result);
		assertNullsNotAllowed(4);
	}

	@Test
	void testList5() throws NoSuchMethodException {
		List<String> result = New.list("element1", "element2", "element3", "element4", "element5");
		assertElements(result, 5);
		assertUnmodifiable(result);
		assertNullsNotAllowed(5);
	}

	@Test
	void testList6() throws NoSuchMethodException {
		List<String> result = New.list("element1", "element2", "element3", "element4", "element5", "element6");
		assertElements(result, 6);
		assertUnmodifiable(result);
		assertNullsNotAllowed(6);
	}

	@Test
	void testList7() throws NoSuchMethodException {
		List<String> result = New.list("element1", "element2", "element3", "element4", "element5", "element6",
				"element7");
		assertElements(result, 7);
		assertUnmodifiable(result);
		assertNullsNotAllowed(7);
	}

	@Test
	void testList8() throws NoSuchMethodException {
		List<String> result = New.list("element1", "element2", "element3", "element4", "element5", "element6",
				"element7", "element8");
		assertElements(result, 8);
		assertUnmodifiable(result);
		assertNullsNotAllowed(8);
	}

	@Test
	void testList9() throws NoSuchMethodException {
		List<String> result = New.list("element1", "element2", "element3", "element4", "element5", "element6",
				"element7", "element8", "element9");
		assertElements(result, 9);
		assertUnmodifiable(result);
		assertNullsNotAllowed(9);
	}

	@Test
	void testList10() throws NoSuchMethodException {
		List<String> result = New.list("element1", "element2", "element3", "element4", "element5", "element6",
				"element7", "element8", "element9", "element10");
		assertElements(result, 10);
		assertUnmodifiable(result);
		assertNullsNotAllowed(10);
	}

	@Test
	void testList11() throws NoSuchMethodException {
		List<String> result = New.list("element1", "element2", "element3", "element4", "element5", "element6",
				"element7", "element8", "element9", "element10", "element11");
		assertElements(result, 11);
		assertUnmodifiable(result);
		assertNullsNotAllowed(11);
	}

	@Test
	void testList11WithAnArrayAsInput() throws NoSuchMethodException {
		String[] strings = { "element1", "element2", "element3", "element4", "element5", "element6", "element7",
				"element8", "element9", "element10", "element11" };
		List<String> result = New.list(strings);
		assertElements(result, 11);
		assertUnmodifiable(result);
		assertNullsNotAllowed(11);
	}

	@Test
	void testList11WithAnArrayAsInputAndASingleElementListAsOutput() throws NoSuchMethodException {
		String[] strings = { "element1", "element2", "element3", "element4", "element5", "element6", "element7",
				"element8", "element9", "element10", "element11" };
		List<String[]> result = New.<String[]>list(strings);
		assertEquals(1, result.size());
		assertEquals(strings, result.get(0));

	}

	private void assertElements(List<String> result, int size) {
		for (int i = 0; i < size; i++) {
			assertEquals("element" + (i + 1), result.get(i));
		}
		assertEquals(size, result.size());
	}

	private void assertUnmodifiable(List<String> result) {
		assertThrows(UnsupportedOperationException.class, () -> result.add(" a string "));
	}

	void assertNullsNotAllowed(int size) throws NoSuchMethodException {

		Method method;
		if (size <= 10) {
			Class<Object>[] parameterTypes = new Class[size];
			Arrays.fill(parameterTypes, Object.class);
			method = New.class.getMethod("list", parameterTypes);
		}
		else {
			method = New.class.getMethod("list", Object[].class);
		}
		for (int nullPosition = 0; nullPosition < size; nullPosition++) {
			String[] arguments = new String[size];
			Arrays.fill(arguments, "something");
			arguments[nullPosition] = null;

			Executable executable;
			if (size <= 10) {
				executable = () -> method.invoke(null, arguments);
			}
			else {
				executable = () -> method.invoke(null, new Object[] { arguments });
			}
			InvocationTargetException ite = assertThrows(InvocationTargetException.class, executable);
			NullPointerException npe = (NullPointerException) ite.getCause();
			assertEquals("e" + (nullPosition + 1) + " can not be null", npe.getMessage());

		}
	}

}
