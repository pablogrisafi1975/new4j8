package org.pgris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NewEntryTest {

	@Test
	void testEntry() {
		Map.Entry<String, String> entry = New.entry("key", "value");
		Assertions.assertEquals("key", entry.getKey());
		Assertions.assertEquals("value", entry.getValue());
	}

	@Test
	void testEntryNullKeyNotAccepted() {
		NullPointerException npe = assertThrows(NullPointerException.class, () -> New.entry(null, "value"));
		assertEquals("k can not be null", npe.getMessage());
	}

	@Test
	void testEntryNullValueNotAccepted() {
		NullPointerException npe = assertThrows(NullPointerException.class, () -> New.entry("key", null));
		assertEquals("v can not be null", npe.getMessage());
	}

	@Test
	public void testEntryUnmodifiable() {
		Map.Entry<String, String> entry = New.entry("key", "value");
		assertThrows(UnsupportedOperationException.class, () -> entry.setValue("another value"));
	}

}
