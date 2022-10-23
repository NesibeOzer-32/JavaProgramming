package day10_NestedIf_Ternaries;

public class GradeReport {
    public static void main(String[] args) {

         /*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
         */

        int s = 135;

        if(s >= 0 && s <= 100){ // if the s is valid (0 ~ 100 )
            // 5 possibilities: A, B, C, D, F
            if(s>= 90 ){ //false:  s < 90
                System.out.println("Excellent");
            }else if(s >= 80 ){ // false: s < 80
                System.out.println("Great");
            }else if(s >= 70){ // false: s < 70
                System.out.println("Good");
            }else if(s >= 60){// false: s < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the s is NOT valid
            System.out.println("Invalid Score");
        }

        System.out.println("------------------------------------------");

        String result = ""; // temporary

        if(s >= 0 &&s <= 100){ // if thes is valid (0 ~ 100 )

            if(s>= 90 ){ //false: s < 90
                result = "Excellent";
            }else if(s >= 80 ){ // false:s < 80
                result = "Great";
            }else if(s >= 70){ // false:s < 70
                result = "Good";
            }else if(s >= 60){// false:s < 60
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{ // if thes is NOT valid
            result = "Invalid Score";
        }


        System.out.println( result);



    }
}
