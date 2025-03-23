package org.example.string;

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * <p>
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * Example
 * s = '12:01:00PM' -> '12:01:00'.
 * s = '12:01:00AM' -> '00:01:00'.
 */
public class TimeConverter {

    public static void main(String[] args) {
        String s1 = "12:01:00AM";
        String s2 = "12:01:00PM";

        System.out.println(timeConversion("12:01:00AM"));
        System.out.println(timeConversion("02:01:00AM"));
        System.out.println(timeConversion("11:33:00AM"));
        System.out.println(timeConversion("12:01:00PM"));
        System.out.println(timeConversion("05:01:00PM"));
        System.out.println(timeConversion("10:01:00PM"));

    }

    public static String timeConversion(String s) {
        // Write your code here
        boolean pm = s.endsWith("PM");
        String[] timeArray = s.substring(0, s.length() - 2).split(":");
        String hours12h = s.substring(0, 2);
        String hours24h = "";
        if (!pm && "12".equals(hours12h)) {
            hours24h = "00";
        }
        if (!pm && !"12".equals(hours12h)){
            hours24h = hours12h;
        }
        if (pm && "12".equals(hours12h)) {
            hours24h = "12";
        }
        if (pm && !"12".equals(hours12h)){
            hours24h = String.valueOf(Integer.parseInt(hours12h) + 12);
        }
        timeArray[0] = hours24h;

        return String.join(":", timeArray);
    }
}
