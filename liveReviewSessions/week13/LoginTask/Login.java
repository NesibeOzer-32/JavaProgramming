package week13.LoginTask;

public class Login {
    public String email="kosucunesibe@gmail.com";
    private String userName="Nesibe";
    private String password="Nesibe1991";

    public String getUserName(String emailInput){
        if(emailInput.equalsIgnoreCase(email)){
            return  this.userName;
        }
        return "condition has NOT been satisfied";
    }
    public String getPassword(String emailInput,String userNameInput){
        if(emailInput.equalsIgnoreCase(email)&&userNameInput.equalsIgnoreCase(userName)){
            return  this.password;
        }
        return "condition has NOT been satisfied";
    }
    public void setPassword(String newPassword){
        if(true){//you might have some kind of password condition
            this.password=newPassword;

        }
        System.exit(-1);
    }

}
