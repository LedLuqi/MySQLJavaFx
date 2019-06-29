package BackEnd;

public class Carpenter extends Worker {
    public Carpenter(String name, String surname, String user, String password, int age) {
        super(name, surname, user, password, age, typeOfWorker.CARPENTER);
    }
}
