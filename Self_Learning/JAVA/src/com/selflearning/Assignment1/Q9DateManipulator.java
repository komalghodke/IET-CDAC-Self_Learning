package com.selflearning.Assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Q9.
DateManipulator class to convert String→Date, Date→String,
and find number of days between two dates.
*/
public class Q9DateManipulator {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	public static Date stringToDate(String str) throws ParseException {
		return sdf.parse(str);
	}

	public static String dateToString(Date date) {
		return sdf.format(date);
	}

	public static long daysBetween(Date d1, Date d2) {
		long diff = d2.getTime() - d1.getTime();
		return diff / (1000 * 60 * 60 * 24);
	}

	public static void main(String[] args) throws Exception {
		Date d1 = stringToDate("01-04-2026");
		Date d2 = stringToDate("09-04-2026");

		System.out.println("Date to String: " + dateToString(d1));
		System.out.println("Days between: " + daysBetween(d1, d2));
	}
}
