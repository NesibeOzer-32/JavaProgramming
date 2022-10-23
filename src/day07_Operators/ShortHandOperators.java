package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assignment : = update the deta: bilgiyi tekrar değiştirebiliriz. son yazılan bilgi işleme alınacak
        int number = 100;
        System.out.println("number = " + number);// number:100

        number = 200;
        System.out.println("number = " + number);// number:200

        String word = "Java Programming";
        System.out.println("word = " + word);
        word = "Wooden Spoon";
        System.out.println("word = " + word);
        word = "Cydeo";
        System.out.println("word = " + word);

        System.out.println("........................................................");

        //Adition Assignment

        int x = 100;
        System.out.println("x = " + x);
        // x = x + 200 ;
        x += 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += "Spoon";
        System.out.println("str = " + str);
        double num1 = 2.5;
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.05;
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("......................................." );

        double salary = 50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);
        double doge = 0.00001;
        doge *= 100000;
        System.out.println("doge = " + doge);

        System.out.println(".................................");

        double num2 = 2500.0;
                num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println(".................................");

        double num3 = 100;
        num3 %=3;
        System.out.println("num3 = " + num3);

        int y = 300;
        y %= 16;
        System.out.println("y = " + y);





    }
}
