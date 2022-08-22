import java.sql.*;

import static java.lang.Class.forName;

public class Main {



    public static void main(String[] args) {

        String jdbcDriver = "jdbc:postgresql";
        String host = "localhost";
        String port = "5432";
        String targetDatabase = "first_db";
        String url = jdbcDriver + "://" + host + ":" + port + "/" + targetDatabase;
        String username = "postgres";
        String password = "123";

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement pr = connection.prepareStatement("SELECT * FROM product");
            ResultSet rs = pr.executeQuery();

            while(rs.next()) {
                int product_id = rs.getInt(1);
                String product_name = rs.getString(2);
                int product_price = rs.getInt(3);
                System.out.println(product_id + " | " + product_name + " | " + product_price);
            }
            // close all
            rs.close();
            pr.close();
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
