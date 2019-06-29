package BackEnd;

public abstract class Worker {
    private String name;
    private String surname;
    private String user;
    private String password;
    private int age;
    private typeOfWorker type;

    public Worker(String name, String surname, String user, String password, int age, typeOfWorker type) {
        this.name = name;
        this.surname = surname;
        this.user = user;
        this.password = password;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public typeOfWorker getType() {
        return type;
    }

    public void setType(typeOfWorker type) {
        this.type = type;
    }
}
