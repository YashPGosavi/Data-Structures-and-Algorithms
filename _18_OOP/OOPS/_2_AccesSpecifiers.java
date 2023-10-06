/*

   Access Modifier      within class    within package      outside package by subclass          only outside package

1. Private                  Y                  N                        N                                   N

2. Default                  Y                  Y                        N                                   N

3. Protected                Y                  Y                        Y                                   N

4. Public                   Y                  Y                        Y                                   Y





   Access Modifier          Private         Default          Protected         Public

1. Class                       N                Y                N                Y

2. Nested Class                Y                Y                Y                Y

3. Constructor                 Y                Y                Y                Y

4. Method                      Y                Y                Y                Y

5. Feild                       Y                Y                Y                Y                

 */
public class _2_AccesSpecifiers {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.username="Yash";
        myBank.setPassword("abcdefghi");

        myBank.transaction("sd");
    }
    
}

class Bank{
    public String username;
    private String password;

    public void setPassword(String pwd){
        this.password=pwd;
    }

    public void transaction(String pwd){
        if(pwd == password){
            System.out.println("Password is correct");
        }else{
            System.out.println("Incorrect Password");
        }
    }

}