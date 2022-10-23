package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        System.out.println("...........................name.add(); son indexten parantez içindeki veriyi ekler................................");
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);//index:0
        numbers.add(30);//index:1
        numbers.add(40);//index:2
        numbers.add(50);//index:3
        numbers.add(60);//index:4 ****eklenen her yeni sona eklenir

        System.out.println(numbers);
        //parantez içindeki ilk sayı index ve virgül sonrası eklenecek veri
        numbers.add(1,20);//istediğin indexe de ekleme yapılabilir bu şekilde

        System.out.println(numbers);

        System.out.println("numbers.size();boyutu icindekilerin sayısı ...................................");

        System.out.println(numbers.size());
        int lastIndex= numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);
        System.out.println(".....get(); parantez içindeki sayı index ve o indexteki veriyi verir.................");
        Integer num = numbers.get(3);
        System.out.println("num = " + num);
        System.out.println("...............................example get:...........................");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("...................set(a,b);a: index b yerine ne gelecegi.---------------------------------------------------------------");
        ArrayList<String> list= new ArrayList<>();
        list.add("Java");
        list.add("C-*");
        list.add("Java");
        list.add("pHYTON");
        list.add("Rub");

        list.set(1,"JavaScript");
        list.set(3,"Java");

        System.out.println("list = " + list);
        System.out.println("......remove();.................................. ");
        ArrayList<String> employes = new ArrayList<>();
        employes.add("Ali");
        employes.add("Aliye");
        employes.add("Ayse");
        employes.add("Arzu");
        employes.add("Aleyna");
        employes.add("Arda");
        employes.add("Ahmet");
        System.out.println("employes = " + employes);
        System.out.println("..........................remove(int index):........................");
        employes.remove(2);//indexe göre
        System.out.println("employes = " + employes);
        employes.remove(0);//indexe göre
        System.out.println("employes = " + employes);
        employes.remove(employes.size()-1);
        System.out.println("employes = " + employes);
        System.out.println("..........................remove(object);........................");
        employes.remove("Aliye");
        System.out.println("employes = " + employes);
        employes.remove("Aleyna");
        System.out.println("employes = " + employes);



    }
}
