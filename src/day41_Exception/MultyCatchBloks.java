package day41_Exception;

import day39_Recap.CydeoTask.Employee;

public class MultyCatchBloks {
    public static void main(String[] args) {

        Employee employee = null;

        try {

            System.out.println(employee.getSalary()); // Null Pointer Exception

        }catch (NullPointerException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }


        System.out.println("Tested Completed");
    }
}
