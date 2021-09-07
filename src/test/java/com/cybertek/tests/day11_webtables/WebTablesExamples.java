package com.cybertek.tests.day11_webtables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesExamples {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void printTable(){
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table.getText());
        Assert.assertTrue(table.getText().contains("jdoe@hotmail.com"));


    }

    @Test
    public void getAllHeaders(){
        //how many colums we have
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers size :"+headers.size());

        for (WebElement header : headers) {
            System.out.println(header.getText());

        }

    }
@Test
    public void printTableSize(){
    //how many columns we have ?
    List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
    System.out.println("headers.size() = " + headers.size());

    // how many rows we have

    List<WebElement> allRowsWithHeader = driver.findElements(By.xpath("//table[@id='table1']//tr"));
    System.out.println("allraes with header :"+allRowsWithHeader.size());

    //number of rows without header(we prefer this)
    List<WebElement> rowsWithotHeader = driver.findElements(By.xpath("(//table/tbody)[1]//tr"));
    System.out.println("rowswithotheader :"+rowsWithotHeader.size());


}
@Test
    public void getrow(){
    //print the second row information
    WebElement row2= driver.findElement(By.xpath("(//table/tbody)[1]//tr[2]"));
    System.out.println(row2.getText());

    //get all rows dynamically
    //1.find number of rows

    List<WebElement> numRows = driver.findElements(By.xpath("(//table/tbody)[1]//tr"));
    //2.iterate one by one

    for (int i = 1; i <=numRows.size() ; i++) {
        WebElement row= driver.findElement(By.xpath("(//table/tbody)[1]//tr["+i+"]"));
        System.out.println(i+".row :"+row.getText());


    }
}
@Test
    public void getAllCellInOneRow(){
    List<WebElement> allCelsInOneRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[3]/td"));

    for (WebElement element : allCelsInOneRow) {
        System.out.println(element.getText());

    }
}
@Test
public void getASingleCellByIndex(){

        WebElement singleCell= driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td[5]"));
    System.out.println("single cell :"+singleCell.getText());
}

@Test
    public void  printAllCellsByIndex(){

  //  int rowNumber = driver.findElements(By.xpath("(//table/tbody)[1]//tr")).size();
  //  int columnNumber = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();
  //  System.out.println(columnNumber);

    int rowNumber= getNumberOfRows();
    int columnNumber = getNumberOfColums();

    System.out.println("rownumber :"+rowNumber);
    System.out.println("columnNumber"+columnNumber);

    //iterate through each row on the table
    for (int i = 1; i <=rowNumber ; i++) {
        //iterate through each cell in the row
        for (int j = 1; j <=columnNumber ; j++) {
            String cellXpath= "(//table/tbody)[1]//tr["+i+"]/td["+j+"]";
            System.out.println(cellXpath);
            WebElement cell = driver.findElement(By.xpath(cellXpath));
            System.out.println(cell.getText());
        }
    }

    }
    @Test
    public void getCellInRelationToAnotherCellInSameRow(){

        String firstName ="Jason";
        String xpath = "//table[@id='table1']//td[.='"+firstName+"']/../td[3]";
        WebElement email = driver.findElement(By.xpath(xpath));
        System.out.println(email.getText());


}

    private int getNumberOfColums() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return  headers.size();

    }

    private int getNumberOfRows() {
       List<WebElement> allRowsWithoutHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return  allRowsWithoutHeader.size();
//return  driver.findElements(By.xpath("(//table/tbody)[1]//tr")).size();
    }


}
