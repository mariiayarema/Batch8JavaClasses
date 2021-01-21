package com.syntax.class36;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExelFileHandlingDemo4 {
    public static void main(String[] args) throws IOException {

        String path="/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class36/Book9.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=workbook.getSheet("Sheet1");
        for (int row = 1; row <sheet.getPhysicalNumberOfRows() ; row++) {
            Row rowData=sheet.getRow(row);
            for (int cell = 0; cell <rowData.getPhysicalNumberOfCells() ; cell++) {
                System.out.print((rowData.getCell(cell)+" "));
            }
            System.out.println();

        }
//        String firstName=row.getCell(0).getStringCellValue();
//        String lastName=row.getCell(1).getStringCellValue();
//        String hobby=row.getCell(2).getStringCellValue();
//        int age=(int)row.getCell(3).getNumericCellValue();

    }
}
