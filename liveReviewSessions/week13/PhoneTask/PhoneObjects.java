package week13.PhoneTask;


import week13.PhoneTask.Phone;
import week13.PhoneTask.CameraPhoneClass;


public class PhoneObjects {
    public static void main(String[] args) {

        CameraPhoneClass phone1 = new CameraPhoneClass("Iphone 12", "6.7 inches", "medium", 100000,"black",100,72);
        CameraPhoneClass phone2 = new CameraPhoneClass("galaxy S19", "6 inches", "medium",900, "White",75,80);
        CameraPhoneClass phone3 = new CameraPhoneClass("Brick", "4 inches","Small" ,50, "Gray",70,100);

        System.out.println("phone1 = " + phone1);
        System.out.println("phone2 = " + phone2);
        System.out.println("phone3 = " + phone3);


        System.out.println(phone1.getNumPicture());
        System.out.println(phone2.getNumPicture());
        System.out.println(phone3.getNumPicture());



    }
}
