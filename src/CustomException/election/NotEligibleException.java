package CustomException.election;

public class NotEligibleException extends Exception{
    public NotEligibleException() {
        System.out.println("You are not Eligible to vote");
    }
}
