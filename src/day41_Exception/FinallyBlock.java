package day41_Exception;

public class FinallyBlock {
    public static void main(String[] args) {
        /*
        finally ile hata ayıklamdan ayrılırken hata olsun veya olmasın çalışması gereken kodlar içindir.
        Hata alın veya almayın mutlaka önce finally bloguna bakılır orada ki işlemlerimiz tamamlandıktan
        sonra alt satırlara geçer….
         */
        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);
        }finally {//always get executed
            System.out.println("Finally Block");
        }

    }
}
/*
Interviev Question:
final(key word: aplicable for variable,methods, class) vs
finally(optional block for try&catch-after the last catch block ) vs
finalize(every single obj has finalize:Garbage collection)

 */