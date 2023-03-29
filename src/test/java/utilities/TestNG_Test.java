package utilities;

import org.testng.Assert;
import org.testng.annotations.Test;


import static utilities.DatabaseUtilty.*;

public class TestNG_Test {

    @Test
    public void test01(){
        //Derya Soylu database kayıtlı mı?
       createConnection();
        String sql = "select * from ogrenciler";
        Assert.assertTrue(getColumnData(sql, "ogrenci_ismi").contains("Derya Soylu"),
                "DATABASE'DE KAYIT BULUNAMADI");
        closeConnection();
    }

    @Test
    public void test02(){
        //111 numaralı kayıt var mı?
        createConnection();
        Assert.assertTrue(getColumnData(" select * from ogrenciler",
                "okul_no").contains(111), "DATABASE'DE KAYIT BULUNAMADI");
        closeConnection();

    }
}