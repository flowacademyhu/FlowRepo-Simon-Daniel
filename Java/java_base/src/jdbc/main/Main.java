package jdbc.main;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[]args){
        System.out.println("database connection app");

        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            System.err.println("Database connector not found");
            System.exit(0);
        }

        Connection connection =null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/java_test", "postgres", "123456");

            connection.prepareStatement("select id, name, value from test1 where id = ?", 1);

        }catch (SQLException e){
            System.err.println("Connection failed!");
        }

    }
}
