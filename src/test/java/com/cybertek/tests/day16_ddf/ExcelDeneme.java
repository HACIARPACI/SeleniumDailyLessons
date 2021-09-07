package com.cybertek.tests.day16_ddf;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelDeneme {

    @DataProvider
    public Object[][] alfa(){
        ExcelUtil ex= new ExcelUtil("src/test/resources/Vytracktestdata (1).xlsx","QA3-short");
        String[][]info=ex.getDataArrayWithoutFirstRow();
        return info;
   }
   @Test(dataProvider ="data" )
    public void test1(String user,String pass,String name,String surnama){







   }


}