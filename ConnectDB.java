import javax.swing.*;
import java.sql.*;

public class ConnectDB {


    public static void main(String[] args) {

        int ID = 2;
        String name = "Tufael";


        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myStudent?serverTimezone=America/New_York", "root", "");
            String query = "INSERT INTO Student values('" + ID + "','" + name+"')";



            Statement sta = connection.createStatement();


            int x = sta.executeUpdate(query);

            if(x != 0) {
                System.out.println("It Worked");
            }

            connection.close();
        } catch (Exception var14) {
            var14.printStackTrace();
        }



    }
}
