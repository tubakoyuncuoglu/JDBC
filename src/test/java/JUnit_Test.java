import org.junit.Assert;
import org.junit.Test;

import static utilities.DatabaseUtilty.*;

public class JUnit_Test {

    @Test
    public void test01() {
        //Nil Naz ve Ali Can isimli öğrencilerin DataBase'de kayıtlı olduğunu doğrula
        createConnection();

        String sql = "select * from ogrenciler";
        System.out.println("Ogrenci isimleri: " + getColumnData(sql, "ogrenci_ismi"));
        Assert.assertTrue("DATABASE'DE KAYIT BULUNAMADI",
                getColumnData(sql, "ogrenci_ismi").contains("Nil Naz"));

        // getColumnData(sql, "ogrenci_ismi") tablodaki ogrenci isimlerini verir

        closeConnection();
    }
        @Test
        public void test02(){
        //120 numarali kayit var mi?
            createConnection();
            Assert.assertTrue("DATABASE'DE KAYİT BULUNAMADİ",
            getColumnData("select * from ogrenciler","okul_no").contains(1200));


            closeConnection();
        }

}