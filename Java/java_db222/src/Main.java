import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Statement stmt = null;
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Database connector not found");
            System.exit(0);
        }


        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/java_test", "postgres", "123456");
            PhoneBookEntry phoneBookEntry = new PhoneBookEntry(5, "99","cica","kutya");
            start(connection,stmt);



        } catch (SQLException e) {
            System.err.println("Connection failed!");
        }
    }

    public static void start(Connection connection,Statement stmt) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SHOW ME WHAT YOU GOT");
        String str = scanner.nextLine();
        while (!str.equals("EXIT")) {
            String[] strSplit = str.split(" ");



            if (str.equals("GET")) {
                try {
                    System.out.println(kiiras(connection, stmt));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (strSplit[0].equals("GETBY")) {
                System.out.println("ehun van e more:");
                int num = Integer.parseInt(strSplit[1]);
                stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM phonebook WHERE id = " + num + ";");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String pn = rs.getString("pn");
                    String name = rs.getString("name");
                    String description = rs.getString("description");

                    System.out.println(id);
                    System.out.println(pn);
                    System.out.println(name);
                    System.out.println(description);

                }
            } else if (strSplit[0].equals("GETBYNAME")) {
                System.out.println("ehun van e more:");

                stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM phonebook WHERE name = '" + strSplit[1] + "';");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String pn = rs.getString("pn");
                    String name = rs.getString("name");
                    String description = rs.getString("description");

                    System.out.println(id);
                    System.out.println(pn);
                    System.out.println(name);
                    System.out.println(description);

                }
            } else if(strSplit[0].equals("ADD")){
                try {
                    PreparedStatement preparedStatement = null;
                    int num = Integer.parseInt(strSplit[1]);

                    String sql = "INSERT INTO phonebook (id,pn,name,description)"
                            + "VALUES(?,?,?,?);";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setInt(1, num);
                    preparedStatement.setString(2, strSplit[2]);
                    preparedStatement.setString(3, strSplit[3]);
                    preparedStatement.setString(4, strSplit[4]);


                    preparedStatement.executeUpdate();
                }catch (SQLException e){
                    System.err.println("hiba van more");
                }
            } else if (strSplit[0].equals("DELETE")){
                int num = Integer.parseInt(strSplit[1]);

                stmt = connection.createStatement();
                stmt.executeUpdate("DELETE FROM phonebook WHERE id = " + num + ";");

            }
            str = scanner.nextLine();
        }
    }






    public boolean beiiras(Connection connection, PhoneBookEntry phoneBookEntry) {
        try {
//            Statement stmt = connection.createStatement();  ez régi ronda kiiráshoz való
            PreparedStatement preparedStatement = null;

            String sql = "INSERT INTO phonebook (id,pn,name,description) "
//                    + "VALUES ("+phoneBookEntry.getId()+", '"+phoneBookEntry.getPn()+"', '"+phoneBookEntry.getName()+"', '"+phoneBookEntry.getDescription()+"');"; ez régi ronda kiiráshoz való
                    + "VALUES(?,?,?,?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, phoneBookEntry.getId());
            preparedStatement.setString(2, phoneBookEntry.getPn());
            preparedStatement.setString(3, phoneBookEntry.getName());
            preparedStatement.setString(4, phoneBookEntry.getDescription());


            preparedStatement.executeUpdate();
        }catch (SQLException e){
            return false;
        }
        return true;
    }

    public static ArrayList<PhoneBookEntry> kiiras(Connection connection,Statement stmt) throws SQLException {
        ArrayList<PhoneBookEntry> list = new ArrayList<>();

        stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM phonebook;");
        while (rs.next()) {
            int id = rs.getInt("id");
            String pn = rs.getString("pn");
            String name = rs.getString("name");
            String description = rs.getString("description");
            PhoneBookEntry phoneBookEntry= new PhoneBookEntry(id,pn,name,description);
            list.add(phoneBookEntry);
        }
        return  list;

    }

}
