import java.util.*;

public class Solution {

    public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();

        // Calendar months start from 0, so subtract 1
        c.set(year, month - 1, day);

        day = c.get(Calendar.DAY_OF_WEEK);

        if (day == Calendar.SUNDAY)
            return "SUNDAY";
        else if (day == Calendar.MONDAY)
            return "MONDAY";
        else if (day == Calendar.TUESDAY)
            return "TUESDAY";
        else if (day == Calendar.WEDNESDAY)
            return "WEDNESDAY";
        else if (day == Calendar.THURSDAY)
            return "THURSDAY";
        else if (day == Calendar.FRIDAY)
            return "FRIDAY";
        else
            return "SATURDAY";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int date = sc.nextInt();
        int year = sc.nextInt();

        String result = findDay(month, date, year);

        System.out.println(result);

        sc.close();
    }
}
