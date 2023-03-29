import java.sql.*;

public class Query01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1) Driver Tanimla
        Class.forName("org.postgresql.Driver");

        //2) Database'e Baglan
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "muhsin+01");


        //3) Statement
        Statement st = con.createStatement();
      //4) Resultset
        ResultSet veri = st.executeQuery("select * from ogrenciler");
        //5) Datalari Al
        while (veri.next()){
            System.out.println(veri.getInt(1)
                              + veri.getString(2)
                              +veri.getString(3)
                              +veri.getString(4));
        }
        //Baglantıları Kapatma
        con.close();
        st.close();
        veri.close();
    }
}
