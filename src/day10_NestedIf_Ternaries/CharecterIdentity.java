package day10_NestedIf_Ternaries;

public class CharecterIdentity {
    public static void main(String[] args) {

        char ch = 'd';
//
        if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }else if( (ch >= 'A' && ch <= 'Z')  || (ch >= 'a' && ch <= 'z')  ) {
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special character");
        }

/*        Tabloya göre üstekki harflerin karşılık geldiği sayıların eklenmiş hali:

      public static void main(String[] args) {
        char ch = 65;

        if(ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        }else if( (ch >= 65 && ch <= 90)  || (ch >= 97 && ch <= 122)  ) {
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special character");
        }





    }

}*/




    }

}

/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
		output:
			Special Character
		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */