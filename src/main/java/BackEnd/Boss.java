package BackEnd;

public class Boss {

    Loggin_Register logginRegister = new Loggin_Register();

    Worker worker = null;

    public void createWorker (typeOfWorker type, String name, String surname, String login, String password, int age) {

        switch (type){
            case BRICKLAYER:
                worker = new Bricklayer(name, surname, login, password, age);
                break;
            case CARPENTER:
                worker = new Carpenter(name, surname, login, password, age);
                break;
            case TILER:
                worker = new Tiler(name, surname, login, password, age);
        }
    }

    public void register () {
        logginRegister.saveWorkerToDAO(worker);
    }
}
