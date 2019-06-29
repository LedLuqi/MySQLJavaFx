package BackEnd;

import javafx.concurrent.Worker;

import java.sql.*;

public class Loggin_Register {

    private String URL = "jdbc:mysql://localhost:3306/?user=root?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String USER = "root";
    private String PASSWORD = "av23@h11";

    void createDataBase() {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            statement.execute("CREATE SCHEMA IF NOT EXISTS workbase");
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void createUserTable() {
        createDataBase();
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS `workbase`.`login_register` (login VARCHAR (200) PRIMARY KEY, password VARCHAR (200))");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void saveWorkerToDAO(BackEnd.Worker worker) {
        createDataBase();
        createUserTable();

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `workbase`.`login_register`.`login`(?,?)");
            preparedStatement.setString(0, worker.getUser());
            preparedStatement.setString(1, worker.getPassword());
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public boolean getWorkerFromDao(String login, String password) {
        createDataBase();
        createUserTable();
        Connection connection = null;
        Statement statement = null;
        String passwordFromDAO = null;
        String sqlQuery = "SELECT password FROM `workbase`.`login_register`where `login` = " + "'" + login + "'";
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if(resultSet.next()){
                passwordFromDAO = resultSet.getString(1);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (password.equals(passwordFromDAO) && password != null) {
            return true;
        }
        return false;
    }

    void createBossTable() {
        createDataBase();
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS `workbase`.`boss` (login VARCHAR (200) PRIMARY KEY, password VARCHAR (200))");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public boolean getBossFromDao(String login, String password) {
        createDataBase();
        createBossTable();
        Connection connection = null;
        Statement statement = null;
        String passwordFromDAO = null;
        String sqlQuery = "SELECT password FROM `workbase`.`boss`where `login` = " + "'" + login + "'";
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if(resultSet.next()){
                passwordFromDAO = resultSet.getString(1);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (password.equals(passwordFromDAO) && password != null) {
            return true;
        }
        return false;
    }

    public void saveBossToDAO(BackEnd.BossParameters boss) {
        createDataBase();
        createBossTable();

        Connection connection = null;
        Statement statement = null;

        String sqlOrder = "INSERT INTO `workbase`.`boss` (`login`, `password`) VALUES " + "('" + boss.getLogin() + "', '" + boss.getPassword() + "')";

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            statement.execute(sqlOrder);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
