package BackEnd;

public class BossParameters {
    private String login;
    private String password;

    public BossParameters(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
