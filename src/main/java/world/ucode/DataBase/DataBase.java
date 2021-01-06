package world.ucode.DataBase;
import java.sql.*;

public class DataBase {
    public static Connection connection;
    public static Statement statmt;
    public static ResultSet resSet;

    public static void Conn() throws ClassNotFoundException, SQLException {
        connection = null;
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:Tamagotchi.sqlite");
    }

    public static void CreateDB() throws ClassNotFoundException, SQLException {
        statmt = connection.createStatement();
        statmt.execute("CREATE TABLE if not exists 'avatar' " +
                "('type' text, 'name' text, 'health' DOUBLE , 'happiness' DOUBLE, 'hunger' DOUBLE , 'thirst' DOUBLE, 'cleanliness' DOUBLE);");
    }

    public static void DeleteDB(String name) throws SQLException {
        statmt.execute("DELETE FROM 'avatar' WHERE name = '" + name + "';");
    }

    public static void WriteDB(String type, String name, double health, double happiness, double hunger, double thirst, double cleanliness) throws SQLException {
        statmt.execute("DELETE FROM 'avatar' WHERE name = '" + name + "';");
        statmt.execute("INSERT INTO 'avatar' ('type', 'name', 'health', 'happiness', 'hunger', 'thirst', 'cleanliness') " +
                "VALUES ('"+type+"', '"+name+"', "+health+", "+happiness+", "+hunger+", "+thirst+", "+cleanliness+"); ");
    }

    public static ResultSet ReadDBNames() throws ClassNotFoundException, SQLException {
        resSet = statmt.executeQuery("SELECT name FROM avatar");
        return resSet;
    }

    public static ResultSet ReadDBAvatar(String name) throws ClassNotFoundException, SQLException {
        resSet = statmt.executeQuery("SELECT * FROM avatar WHERE name = '" + name + "'");
        return resSet;
    }

    public static void CloseDB() throws ClassNotFoundException, SQLException {
        connection.close();
        statmt.close();
        resSet.close();
    }
}