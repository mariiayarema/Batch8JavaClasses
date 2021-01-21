package com.syntax.class36;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WritingExcelData {
    public static void main(String[] args) throws IOException {
        String inputFilePath="/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class36/Book7.xlsx";
        String outputFilePath="/Users/mariiayarema/eclipse-workspace/JavaBatch8Yarema/src/com/syntax/class36/Book8.xlsx";
//getting path for two different sheets (InputFile and OutputFile)
        System.out.println(inputFilePath);
        System.out.println(outputFilePath);
        FileInputStream fileInputStream=new FileInputStream(inputFilePath);
        FileOutputStream fileOutputStream=new FileOutputStream(outputFilePath);
// creating input stream first to read data
//creating output stream second to write data



       XSSFWorkbook inputXSSFWorkbook=new XSSFWorkbook(fileInputStream);
       XSSFWorkbook outputXSSFWorkbook=new XSSFWorkbook();//we don't need to specify  stream in constructor
        //to manipulate data in exel file

       Sheet sheet=inputXSSFWorkbook.getSheet("Sheet1");

        List<PersonInfo> personInfoList=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            Row row=sheet.getRow(i);
            PersonInfo personInfo=new PersonInfo();
            personInfo.setFirstName(row.getCell(0).toString());
            personInfo.setLastName(row.getCell(1).toString());
            personInfo.setAge((int)row.getCell(2).getNumericCellValue());
            personInfo.setSalary(row.getCell(3).getNumericCellValue());
            if(personInfo.getSalary()>100000){
                personInfoList.add(personInfo);
                //adding to list only object with salary > 100 000
                
            }
        }


        XSSFSheet outputSheet=outputXSSFWorkbook.createSheet("OutputSheet");
        //creating new sheet with name "OutputSheet"
        for (int i = 0; i <personInfoList.size() ; i++) {
            //looping through list
            XSSFRow row=outputSheet.createRow(i);
            row.createCell(0).setCellValue(personInfoList.get(i).getFirstName());
            //how many rows i need?--> i need personInfoList.size() rows
            //but we want to create 1 row at a time and feel it up with info
            //so we will create createRow(i)
            row.createCell(1).setCellValue(personInfoList.get(i).getLastName());
            row.createCell(2).setCellValue(personInfoList.get(i).getAge());
            row.createCell(3).setCellValue(personInfoList.get(i).getSalary());

        }
        outputXSSFWorkbook.write(fileOutputStream);
        }


    }
