import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBlogic {

    String DB = "";
    String USER = "root";
    String PASS = "";
  // DB un PASS savs

    public void register(String password) {
        try {
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String register = "INSERT INTO password (password) VALUES('"+ password +"')";
          // password -> tabulas nosaukums, (password) -> kolonnas nosaukums

            stmt.executeUpdate(register);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
