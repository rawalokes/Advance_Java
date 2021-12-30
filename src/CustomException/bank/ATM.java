package CustomException.bank;

import java.util.Scanner;

public class ATM {
    int accN = 101;
    int password = 299;

    int accountN;
    int pswd;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account No;");
        accountN = scanner.nextInt();
        System.out.println("Enter Password");
        pswd = scanner.nextInt();
    }

    public void verify()throws PasswordNotMatchException {
        if (accountN==accN){
            if (password==pswd){
                System.out.println("Collect Your Money");
            }
            else {
                throw new PasswordNotMatchException();
            }

        }


//        Handle ClassNot Found Exception

        else {
            Account account=new Account();
           try{
               account.verifyacc();
           }catch (AccountNoNotFoundException ac){

           }

        }



    }


}
