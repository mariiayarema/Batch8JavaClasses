package com.syntax.class36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Homework2 {
    public static void main(String[] args)  throws IOException {

        String inputPath = "/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class36/Book1.xlsx";
        String outputPath = "/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class36/Book3.xlsx";

        FileInputStream fileInputStream=new FileInputStream(inputPath);
        FileOutputStream fileOutputStream=new FileOutputStream(outputPath);

        XSSFWorkbook inputWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFWorkbook outputWorkbook=new XSSFWorkbook();

        Sheet sheet=inputWorkbook.getSheet("Page1");
        List<MembersInfo> list=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
          Row row=sheet.getRow(i);
          MembersInfo membersInfo=new MembersInfo();
          membersInfo.setFirstName(row.getCell(0).getStringCellValue());
          membersInfo.setFirstName(row.getCell(0).toString());
          membersInfo.setLastName(row.getCell(1).toString());
          membersInfo.setAge((int)row.getCell(2).getNumericCellValue());
          membersInfo.setSalary(row.getCell(3).getNumericCellValue());
         if(membersInfo.getFirstName().startsWith("M") && membersInfo.getSalary()>100.000){
             list.add(membersInfo);
          }
        }


        XSSFSheet outputSheet=outputWorkbook.createSheet("New MemberInfo");
        for (int i = 0; i <list.size() ; i++) {
            XSSFRow xssfRow=outputSheet.createRow(i);
            xssfRow.createCell(0).setCellValue(list.get(i).getFirstName());
            xssfRow.createCell(1).setCellValue(list.get(i).getLastName());
            xssfRow.createCell(2).setCellValue(list.get(i).getAge());
            xssfRow.createCell(3).setCellValue(list.get(i).getSalary());
        }
        outputWorkbook.write(fileOutputStream);
     }
    }


