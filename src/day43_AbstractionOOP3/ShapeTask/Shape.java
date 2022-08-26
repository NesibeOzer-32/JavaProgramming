package day43_AbstractionOOP3.ShapeTask;

public abstract class Shape {
    //Küçük detaylarla uğraşmıyoruz. neyin alanı hangi formul? önemli değil
    //Aşağıdaki gibi Abstract methodu için yuarıdaki class'a abstract ekliyoruz. Abstract class olması lazım.
    //Method doesnt have body.....
    //method can not be; final,static,private....

    public abstract double area();
}
