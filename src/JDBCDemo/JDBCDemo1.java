package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. creating a connection
        String user ="root";
        String pass ="root";
        String url = "jdbc:mysql://localhost:3306/seleniumclass";

        Connection con  = DriverManager.getConnection(url,user,pass);

        // 3. creating a statement
        Statement st = con.createStatement();

        // 4. execute query --> DML
        String sql ="insert into student values(1,'amol','IT',60)";
        // delete & update - Homework

        st.executeUpdate(sql);

    }
}
