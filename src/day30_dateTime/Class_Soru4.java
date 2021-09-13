package day30_dateTime;


import java.time.LocalDate;
import java.time.Month;
public class Class_Soru4 {
    public static void main(String[] args) {
        // TODO
        // What is the output of the following code?
        LocalDate date = LocalDate.of(2002, Month.MARCH, 20);
     //  date= date.plusDays(180);
        date.plusYears(3);
        System.out.println(date.getDayOfWeek());
        /*
         * A. 2018 APRIL 2 B. 2018 APRIL 30 C. 2018 MAY 2 D. 2021 APRIL 2 E. 2021 APRIL
         * 30 F. 2021 MAY 2 G. A runtime exception is thrown.
         */
    }
}