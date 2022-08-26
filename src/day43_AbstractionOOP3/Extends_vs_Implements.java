package day43_AbstractionOOP3;

interface H{

}
interface N{

}
//one interface  can extends MULTİPLY interfaces
interface T extends N,H{

}

abstract class M{

}
//one class extends only one class
class Y extends M{

}
class Z implements N,H{

}
//BERABER KULLANILDIĞINDA: ilk extends geliyor
public class Extends_vs_Implements extends M implements N,H{
    public static void main(String[] args) {

    }
}
