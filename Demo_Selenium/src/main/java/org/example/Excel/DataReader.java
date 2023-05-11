package org.example.Excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.example.DriverManager;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class DataReader
{
    private final DataFormatter formatter=new DataFormatter();

    public void DataReadTest() throws IOException  {
        File src=new File("C:\\Users\\LENOVO\\Desktop\\Book1.xlsx");
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        Sheet sheet=wb.getSheet("Sheet1");
        //XSSFSheet sheet=wb.getSheetAt(0);

        Cell entry1=sheet.getRow(2).getCell(2);
        String entry2=formatter.formatCellValue(entry1);
        System.out.println("Value of cell 2 under Row 2: " +entry1);

        //Printing the entire table
        int lastrow= sheet.getLastRowNum();
        System.out.println("last row is : " +lastrow);
        int celll=sheet.getRow(1).getPhysicalNumberOfCells();  ///Need to ask
        System.out.println("Cell is :" + celll);

        for(int r=0; r<sheet.getLastRowNum(); r++){
            Row row=sheet.getRow(r);
            for(int c=0; c<sheet.getRow(r).getLastCellNum(); c++) //
            {
                if (row != null) {
                    Cell cell = row.getCell(c);
                    if (cell != null) {
                        String value = formatter.formatCellValue(cell);  //with data formatter we can print any type of value
                        System.out.print(value + "    |    ");
                        //System.out.print(cell.getStringCellValue() + "    |    ");  //use to print only string values
                    }
                }
            }
            System.out.println("  ");
        }
        System.out.println("Read all columns and print their values :");
        // coloum 0
        for(int c=0; c<sheet.getRow(0).getLastCellNum();c++)
        {
            for(int r=0;r<sheet.getLastRowNum();r++)
            {
                Row row=sheet.getRow(r);
                Cell cell= row.getCell(c);
                if (cell != null) {
                    String value = formatter.formatCellValue(cell);  //with data formatter we can print any type of value
                    System.out.print(value + "    |    ");
                    //System.out.print(cell.getStringCellValue() + "    |    ");  //use to print only string values
                }
            }
        }
        System.out.println("  ");


        System.out.println("Read data for Column 2, Column 4 and Column 7 and print values");
        for ( int r=0; r<sheet.getLastRowNum(); r++)
        {
            Row row=sheet.getRow(r);
            Cell cell=row.getCell(2);
            if (cell != null) {
                String value = formatter.formatCellValue(cell);  //with data formatter we can print any type of value
                System.out.print(value + "    |    ");
                //System.out.print(cell.getStringCellValue() + "    |    ");  //use to print only string values
            }


        }
        System.out.println(" ");


        for ( int r=0; r<sheet.getLastRowNum(); r++)
        {
            Row row=sheet.getRow(r);
            Cell cell=row.getCell(4);
            if (cell != null) {
                String value = formatter.formatCellValue(cell);  //with data formatter we can print any type of value
                System.out.print(value + "    |    ");
                //System.out.print(cell.getStringCellValue() + "    |    ");  //use to print only string values
            }


        }
        System.out.println(" ");


        for ( int r=0; r<sheet.getLastRowNum(); r++)
        {
            Row row=sheet.getRow(r);
            Cell cell=row.getCell(7);
            if (cell != null) {
                String value = formatter.formatCellValue(cell);  //with data formatter we can print any type of value
                System.out.print(value + "    |    ");
                //System.out.print(cell.getStringCellValue() + "    |    ");  //use to print only string values
            }
        }
        System.out.println(" ");

        wb.close();
    }
}
