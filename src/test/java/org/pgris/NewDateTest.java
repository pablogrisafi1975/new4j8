package org.pgris;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewDateTest {

	private static final TimeZone TEST_TIMEZONE = TimeZone.getTimeZone("GMT-0800");

	private static final Locale TEST_LOCALE = Locale.FRANCE;

	private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");

	@Test
	public void dateYearMonth0DayHourMinuteSecondMillisTZLocale() {
		Date date = New.date(2020, 1, 2, 3, 4, 5, 6, TEST_TIMEZONE, TEST_LOCALE);
		Calendar calendar = Calendar.getInstance(TEST_TIMEZONE, TEST_LOCALE);
		calendar.setTime(date);
		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
	}

	@Test
	public void dateENYearMonth0DayHourMinuteSecondMillisTZ() {
		Date date = New.dateEN(2020, 1, 2, 3, 4, 5, 6, TEST_TIMEZONE);
		Calendar calendar = Calendar.getInstance(TEST_TIMEZONE, Locale.ENGLISH);
		calendar.setTime(date);

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
	public void dateUTCYearMonth0DayHourMinuteSecondMillisLocale() {
		Date date = New.dateUTC(2020, 1, 2, 3, 4, 5, 6, TEST_LOCALE);
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, TEST_LOCALE);
		calendar.setTime(date);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
	}

	@Test
	public void dateUTCENYearMonth0DayHourMinuteSecondMillisTZ() {
		Date date = New.dateUTCEN(2020, 1, 2, 3, 4, 5, 6);
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.setTime(date);

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
	public void dateYearMonth0DayHourMinuteSecondTZLocale() {
		Date date = New.date(2020, 1, 2, 3, 4, 5, TEST_TIMEZONE, TEST_LOCALE);
		Calendar calendar = Calendar.getInstance(TEST_TIMEZONE, TEST_LOCALE);
		calendar.setTime(date);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
	}

	@Test
	public void dateENYearMonth0DayHourMinuteSecondTZ() {
		Date date = New.dateEN(2020, 1, 2, 3, 4, 5, TEST_TIMEZONE);
		Calendar calendar = Calendar.getInstance(TEST_TIMEZONE, Locale.ENGLISH);
		calendar.setTime(date);

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
	public void dateUTCYearMonth0DayHourMinuteSecondLocale() {
		Date date = New.dateUTC(2020, 1, 2, 3, 4, 5, TEST_LOCALE);
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, TEST_LOCALE);
		calendar.setTime(date);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.FEBRUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
	}

	@Test
	public void dateUTCENYearMonth0DayHourMinuteSecondTZ() {
		Date date = New.dateUTCEN(2020, 1, 2, 3, 4, 5);
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.setTime(date);

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
	public void date1YearMonth1DayHourMinuteSecondMillisTZLocale() {
		Date date = New.date1(2020, 1, 2, 3, 4, 5, 6, TEST_TIMEZONE, TEST_LOCALE);
		Calendar calendar = Calendar.getInstance(TEST_TIMEZONE, TEST_LOCALE);
		calendar.setTime(date);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
	}

	@Test
	public void date1ENYearMonth1DayHourMinuteSecondMillisTZ() {
		Date date = New.date1EN(2020, 1, 2, 3, 4, 5, 6, TEST_TIMEZONE);
		Calendar calendar = Calendar.getInstance(TEST_TIMEZONE, Locale.ENGLISH);
		calendar.setTime(date);

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
	public void date1UTCYearMonth1DayHourMinuteSecondMillisLocale() {
		Date date = New.date1UTC(2020, 1, 2, 3, 4, 5, 6, TEST_LOCALE);
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, TEST_LOCALE);
		calendar.setTime(date);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(6, calendar.get(Calendar.MILLISECOND));
	}

	@Test
	public void date1UTCENYearMonth1DayHourMinuteSecondMillisTZ() {
		Date date = New.date1UTCEN(2020, 1, 2, 3, 4, 5, 6);
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.setTime(date);

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
	public void date1YearMonth1DayHourMinuteSecondTZLocale() {
		Date date = New.date1(2020, 1, 2, 3, 4, 5, TEST_TIMEZONE, TEST_LOCALE);
		Calendar calendar = Calendar.getInstance(TEST_TIMEZONE, TEST_LOCALE);
		calendar.setTime(date);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
	}

	@Test
	public void date1ENYearMonth1DayHourMinuteSecondTZ() {
		Date date = New.date1EN(2020, 1, 2, 3, 4, 5, TEST_TIMEZONE);
		Calendar calendar = Calendar.getInstance(TEST_TIMEZONE, Locale.ENGLISH);
		calendar.setTime(date);

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
	public void date1UTCYearMonth1DayHourMinuteSecondLocale() {
		Date date = New.date1UTC(2020, 1, 2, 3, 4, 5, TEST_LOCALE);
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, TEST_LOCALE);
		calendar.setTime(date);

		assertEquals(2020, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(2, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(3, calendar.get(Calendar.HOUR_OF_DAY));
		assertEquals(4, calendar.get(Calendar.MINUTE));
		assertEquals(5, calendar.get(Calendar.SECOND));
		assertEquals(0, calendar.get(Calendar.MILLISECOND));
	}

	@Test
	public void date1UTCENYearMonth1DayHourMinuteSecondTZ() {
		Date date = New.date1UTCEN(2020, 1, 2, 3, 4, 5);
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.setTime(date);

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
