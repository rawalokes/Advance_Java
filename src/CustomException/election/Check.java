package CustomException.election;

import java.util.Scanner;

public class Check {
    int age;
    public void input(){
        System.out.println("Enter your age");
        Scanner scanner=new Scanner(System.in);
        age=scanner.nextInt();

    }

    public void  verify()throws NotEligibleException{
        if (age<18){
            throw new NotEligibleException();
        }

        System.out.println("Congratulations you can vote");
    }
}
