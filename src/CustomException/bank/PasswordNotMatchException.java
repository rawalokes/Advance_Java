package CustomException.bank;

public class PasswordNotMatchException extends Exception{
    public PasswordNotMatchException() {
        System.out.println("Password Does Not Match");
    }
}
