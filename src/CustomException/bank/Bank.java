package CustomException.bank;

public class Bank {

    public void start() {
        ATM atm = new ATM();
        atm.input();
        try {
            atm.verify();
        } catch (PasswordNotMatchException e) {
            atm.input();
            try {
                atm.verify();
            } catch (PasswordNotMatchException ex) {
                atm.input();

                try {
                    atm.verify();
                }catch (PasswordNotMatchException exc){
                    System.out.println("Atm Bloked ");

                }
            }
        }
    }


}
