package Oops;

public class AccesModfiers {
    public static void main(String[] args) {
        BankAcc u1 = new BankAcc();
        u1.username= "Sky";
        u1.setPassword("sky");
    }
}
class BankAcc{
    public String username;
    private String password;
    void setPassword(String pwd){
        password = pwd;
    }
}
