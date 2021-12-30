package CustomException.bank;

//class to throw calssNotFound Exception

public class AccountNoNotFoundException extends Throwable {
    public AccountNoNotFoundException() {
        System.out.println("Account Not Found please try later");
    }
}
