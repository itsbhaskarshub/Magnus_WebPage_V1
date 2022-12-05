package com.testscenarios;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig  
{
    XSSFWorkbook wb;
    XSSFSheet Sheet;

    public ExcelDataConfig(String excelpath)
    {
        try
        {
            File src = new File(excelpath);
            FileInputStream fis = new FileInputStream(src);
            wb= new XSSFWorkbook(fis);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public String getData(int sheetnumber, int row, int column)
    {
        Sheet = wb.getSheetAt(sheetnumber);
        String data =Sheet.getRow(row).getCell(column).getStringCellValue();     
        return data;

    }

    public int getRowCount(int sheetindex)
    {
        int row = wb.getSheetAt(sheetindex).getLastRowNum();
        return row;
    }
    
    public int getCellCount(int Sheetindex, int row) {
    	int cell = wb.getSheetAt(Sheetindex).getRow(row).getLastCellNum();
    	return cell;
    }

}