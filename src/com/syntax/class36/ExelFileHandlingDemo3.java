package com.syntax.class36;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExelFileHandlingDemo3 {
    public static void main(String[] args) throws IOException {
        String path="/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class36/Book9.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=workbook.getSheet("Sheet1");
        Row row=sheet.getRow(3);
        Cell cell=row.getCell(2);
        cell.setCellValue("Mariia");
        System.out.println(cell);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
    }
}
