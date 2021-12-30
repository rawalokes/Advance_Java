package CustomException.bank;

public class Account {
    public void verifyacc () throws AccountNoNotFoundException {
        throw new AccountNoNotFoundException();

    }

}
