import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Query06 {



        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jdbc",
                    "postgres",
                    "muhsin+01");

            //Statement st = con.createStatement();
            //st.executeUpdate("insert into ogrenciler values (850, 'Ali Can', 11, 'E')");
           //Ayni SQL kodlarini kullanacaksak statement degil preparedstatement kullaniriz.
            //Statement kullandigimizdda her seferin kodu database iletir.
            //Preparedstatement kullandigimizda ornegi saklar sadece datalari iletir
            PreparedStatement ps = con.prepareStatement("insert into ogrenciler values (?, ?, ?, ?)");
            ps.setInt(1, 951);
            ps.setString(2, "Ali Can");
            ps.setInt(3, 11);
            ps.setString(4, "E");

            ps.executeUpdate();

            ps.close();

        }
    }

