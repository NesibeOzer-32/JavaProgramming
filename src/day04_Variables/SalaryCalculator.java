package day04_Variables;

import java.sql.SQLOutput;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourlyRate, weeklyHours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeek = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeek;
        // we have 52 week in a year
        System.out.println("salary = " + salary);
        // System.out.println(salary); short: soutv
        System.out.println("hourlyRate = $" + hourlyRate );
        System.out.println("weeklyHours = " + weeklyHours );
        System.out.println("numberOfWeek = " + numberOfWeek );
        System.out.println("salary = $" + salary );
    }


}
