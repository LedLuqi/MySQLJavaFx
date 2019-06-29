package BackEnd;

public class Bricklayer extends Worker {

    public Bricklayer(String name, String surname, String user, String password, int age) {
        super(name, surname, user, password, age, typeOfWorker.BRICKLAYER);
    }
}
