package day20_Arrays;

public class Months {
    public static void main(String[] args) {
        String[] months={"January","February","March","April","May","June","july","Agustus","September","October","November","December"};
        //index numbers:      0         1         2        3     4      5     6        7          8         9          10        11
    int number = 1;
        if(number<1|| number>11){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(months[number-1]);

    }
}
