package week13.LoginTask;

import week13.LoginTask.Login;

public class LoginObjects {
    public static void main(String[] args) {
        Login user= new Login();//new keyword using the default constructor

        System.out.println(user.email);
        //System.out.println(user.userName);....NOT reachable
        //System.out.println(user.password);....NOT reachable

        System.out.println(user.getUserName("kosucunesibe@gmail.com"));
        System.out.println(user.getPassword("kosucunesibe@gmail.com","Nesibe"));

        user.setPassword("newPasswordForNesibe");
        System.out.println(user.getPassword("kosucunesibe@gmail.com","Nesibe"));
    }
}
