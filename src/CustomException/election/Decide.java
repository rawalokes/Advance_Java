package CustomException.election;

public class Decide {

    public void start(){
        Check check= new Check();
        check.input();
        try {
            check.verify();
        } catch (Exception e) {

        }
    }



}
