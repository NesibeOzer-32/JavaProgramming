package day52_Map_FunctionalInterface;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Day day = Day.MONDAY;

        System.out.println(day);

        Day[] days = Day.values();

        System.out.println("Arrays.toString(days) = " + Arrays.toString(days));

        switch (day){
            case MONDAY:
                System.out.println("Today is Monday");
            case TUESDAY:
                System.out.println("Today is Tuesday");
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
            case THURSDAY:
                System.out.println("Today is Thursday");
            case FRIDAY:
                System.out.println("Today is Friday");
            case SATURDAY:
                System.out.println("Today is Saturday");
            default:
                System.out.println("Today is Sunday");
        }
    }
}
//,
