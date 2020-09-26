package org.pgris;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewCalendarTest {

	private static final TimeZone TEST_TIMEZONE = TimeZone.getTimeZone("GMT-0800");

	private static final Locale TEST_LOCALE = Locale.FRANCE;

	@Test
	public void calendarYearMonth0DayHourMinuteSecondMillisTZLocale() {
		Calendar calendar = New.calendar(2020, 1, 2, 3, 4, 5, 6, TEST_TIMEZONE, TEST_LOCALE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.MONDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendarENYearMonth0DayHourMinuteSecondMillisTZ() {
		Calendar calendar = New.calendarEN(2020, 1, 2, 3, 4, 5, 6, TEST_TIMEZONE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.SUNDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendarUTCYearMonth0DayHourMinuteSecondMillisLocale() {
		Calendar calendar = New.calendarUTC(2020, 1, 2, 3, 4, 5, 6, TEST_LOCALE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.MONDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendarUTCENYearMonth0DayHourMinuteSecondMillisTZ() {
		Calendar calendar = New.calendarUTCEN(2020, 1, 2, 3, 4, 5, 6);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.SUNDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendarYearMonth0DayHourMinuteSecondTZLocale() {
		Calendar calendar = New.calendar(2020, 1, 2, 3, 4, 5, TEST_TIMEZONE, TEST_LOCALE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.MONDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendarENYearMonth0DayHourMinuteSecondTZ() {
		Calendar calendar = New.calendarEN(2020, 1, 2, 3, 4, 5, TEST_TIMEZONE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.SUNDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendarUTCYearMonth0DayHourMinuteSecondLocale() {
		Calendar calendar = New.calendarUTC(2020, 1, 2, 3, 4, 5, TEST_LOCALE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.MONDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendarUTCENYearMonth0DayHourMinuteSecondTZ() {
		Calendar calendar = New.calendarUTCEN(2020, 1, 2, 3, 4, 5);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.SUNDAY, calendar.getFirstDayOfWeek());
	}

	// month base 1

	@Test
	public void calendar1YearMonth1DayHourMinuteSecondMillisTZLocale() {
		Calendar calendar = New.calendar1(2020, 1, 2, 3, 4, 5, 6, TEST_TIMEZONE, TEST_LOCALE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.MONDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendar1ENYearMonth1DayHourMinuteSecondMillisTZ() {
		Calendar calendar = New.calendar1EN(2020, 1, 2, 3, 4, 5, 6, TEST_TIMEZONE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.SUNDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendar1UTCYearMonth1DayHourMinuteSecondMillisLocale() {
		Calendar calendar = New.calendar1UTC(2020, 1, 2, 3, 4, 5, 6, TEST_LOCALE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.MONDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendar1UTCENYearMonth1DayHourMinuteSecondMillisTZ() {
		Calendar calendar = New.calendar1UTCEN(2020, 1, 2, 3, 4, 5, 6);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.SUNDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendar1YearMonth1DayHourMinuteSecondTZLocale() {
		Calendar calendar = New.calendar1(2020, 1, 2, 3, 4, 5, TEST_TIMEZONE, TEST_LOCALE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.MONDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendar1ENYearMonth1DayHourMinuteSecondTZ() {
		Calendar calendar = New.calendar1EN(2020, 1, 2, 3, 4, 5, TEST_TIMEZONE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.SUNDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendar1UTCYearMonth1DayHourMinuteSecondLocale() {
		Calendar calendar = New.calendar1UTC(2020, 1, 2, 3, 4, 5, TEST_LOCALE);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.MONDAY, calendar.getFirstDayOfWeek());
	}

	@Test
	public void calendar1UTCENYearMonth1DayHourMinuteSecondTZ() {
		Calendar calendar = New.calendar1UTCEN(2020, 1, 2, 3, 4, 5);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
		assertEquals(Calendar.SUNDAY, calendar.getFirstDayOfWeek());
	}

}
