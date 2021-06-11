package managementsupermarket.com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDB {
    private static String url ="jdbc:mysql://localhost:3306/supermarket?useUnicode=true&characterEncoding=utf-8";
    private static String user="root";
    private static String pw="123456";

    static Connection connection;
    public static PreparedStatement connect(String sql) throws SQLException {
        if(connection==null || connection.isClosed()){
            connection= DriverManager.getConnection(url,user,pw);
        }
        return connection.prepareStatement(sql);
    }
}
