package day10_NestedIf_Ternaries;

public class MyExamples {
    public static void main(String[] args) {
        //1. Which days of the week are sunnah to fast? ternaries with if
        int day = 4;
        String fastinOfNot = (day==1)? "Fasting" :(day==2)? "Not Fasting" :(day == 3)? "Not Fasting" :(day == 4)?
                "Fasting" :(day == 5)? "Not Fasting":(day == 6)? "Not Fasting" : "Not Fasting";
        System.out.println("fastinOfNot = " + fastinOfNot);
        System.out.println("..................................");
        //2. What time which meal....ternaries with  nested if
        int hour = 13;
        String WhichMeal = (hour>=1 && hour<=24)? (hour==9)? "Breakfast" :(hour==13)?
                "Lunch" :(hour==18)? "Dinner" : "Free Meals":"Invalid";
        System.out.println("WhichMeal = " + WhichMeal);

    }
}

