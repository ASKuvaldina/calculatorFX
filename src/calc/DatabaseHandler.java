package calc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {

//    Connection con;
//    public Connection getConnection() throws ClassNotFoundException, SQLException {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(
//                    "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName, dbUser, dbPass);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return con;
//    }

    public void addHistoryDB(String res){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/calc?useUnicode=yes&characterEncoding=UTF-8&serverTimezone=UTC", "root", "vitaly");
            Statement stmt = con.createStatement();



        stmt.execute("INSERT INTO `historydb` (`operation`) VALUES ('"+res+"')\n");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
