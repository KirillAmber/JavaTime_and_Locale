import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Locale;

public class Birthday {
    public static void main(String[] args) {
        LocalDate mybirthday = LocalDate.of(2020, 6, 17);
        System.out.println("My birthday: ");
        System.out.println(mybirthday.getDayOfWeek() + " " +
                mybirthday.getDayOfYear() + " " +
                mybirthday.getMonth() + " " + mybirthday.getYear());
        LocalDate now = LocalDate.now();
        System.out.println("Before: " + now.isAfter(mybirthday));
        System.out.println("After: " + now.isBefore(mybirthday));
    }
}
