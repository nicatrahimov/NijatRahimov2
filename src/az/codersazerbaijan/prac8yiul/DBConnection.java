package az.codersazerbaijan.prac8yiul;
import java.sql.*;

public class DBConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";

      Connection c = DriverManager.getConnection(url,"postgres","1312");

        Statement st = c.createStatement();
        st.execute("UPDATE ");
        ResultSet rs = st.getResultSet();

        while (rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("surname"));
            System.out.println(rs.getString("ixtisas"));
        }
        c.close();
        }
            }