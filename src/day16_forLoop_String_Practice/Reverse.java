package day16_forLoop_String_Practice;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        //index:      0123456789

        String result = "";  // contain the reversed version of str
        //noopS nedooW

        /*
        result += str.charAt(11); //n
        result += str.charAt(10); //o
        result += str.charAt(9); //o
        result += str.charAt(8); //p
        result += str.charAt(7); //S
        result += str.charAt(6); //' '
        result += str.charAt(5); //n
        result += str.charAt(4); //e
        result += str.charAt(3); //d
        result += str.charAt(2); //o
        result += str.charAt(1); //o
        result += str.charAt(0); //W
*/
        //son sayının indexi: str.length() - 1
        for (int i = str.length()  - 1; i >= 0; i--) { //i: index numbers of str (starting last index to index 0 )
            result += str.charAt(i); // adding each character to result
        }   // += herbir işlemde çıkan harfi birbirine ekliyor. n+o+o+p+S.....
        //str.charAt(i) İ değiştikçe o sayının karşılığı index lazım old için kullandık.
        //reverse: tersi.. yazıyı tersten tekrar yazma: kitap->patik
        System.out.println(result);

    }
}
/*
1. Write a program that can reverse a String
        Ex:
        input:
        Wooden Spoon
        output:
        noopS nedooW
        */