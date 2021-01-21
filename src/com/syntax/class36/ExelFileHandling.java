package com.syntax.class36;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelFileHandling {
    public static void main(String[] args) throws IOException {

        String path="/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class36/Book9.xlsx";

        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        //to deal with xlsx file we need Workbook interface
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=workbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        Cell cell=row.getCell(0);
        System.out.println(path);
        System.out.println(cell.toString());


    }
}
