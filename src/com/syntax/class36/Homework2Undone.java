package com.syntax.class36;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Homework2Undone {
//    public static void main(String[] args) throws IOException {
//​
//        String inputPath = "C:\\Users\\Blazed\\Desktop\\GenderTest.xlsx";
//        String maleOutputPath = "C:\\Users\\Blazed\\Desktop\\SortedTask.xlsx";
//        String femaleOutputPath = "C:\\Users\\Blazed\\Desktop\\SortedTask.xlsx";
//        FileInputStream fileInputStream = new FileInputStream(inputPath);
//        FileOutputStream maleFileOutputStream = new FileOutputStream(maleOutputPath);
//        FileOutputStream femaleFileOutputStream = new FileOutputStream(femaleOutputPath);
//​
//​
//        XSSFWorkbook inputXSSFWorkbook = new XSSFWorkbook(fileInputStream);
//        XSSFWorkbook outputXSSFWorkbook = new XSSFWorkbook();
//​
//        Sheet sheet = inputXSSFWorkbook.getSheet("ReadData");
//​
//        List<MixedIndividuals> maleIndividualsList = new ArrayList<>();
//        List<MixedIndividuals> femaleIndividualsList = new ArrayList<>();
//        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
//            Row rowData = sheet.getRow(i);
//            MixedIndividuals mixedIndividuals = new MixedIndividuals();
//            mixedIndividuals.setFirstName(rowData.getCell(0).getStringCellValue());
//            mixedIndividuals.setLastName(rowData.getCell(1).getStringCellValue());
//            mixedIndividuals.setAge((int) rowData.getCell(2).getNumericCellValue());
//            mixedIndividuals.setGender(rowData.getCell(3).getStringCellValue().charAt(0));
//            mixedIndividuals.setSalary(rowData.getCell(4).getNumericCellValue());
//​
//            if (mixedIndividuals.getGender() == 'M') {
//                maleIndividualsList.add(mixedIndividuals);
//            } else {
//                femaleIndividualsList.add(mixedIndividuals);
//            }
//        }
//​
//        System.out.println(femaleIndividualsList);
//        System.out.println(maleIndividualsList);
//​
//        XSSFSheet outputMaleSheet = outputXSSFWorkbook.createSheet("Males");
//        for (int i = 0; i < maleIndividualsList.size(); i++) {
//            XSSFRow row = outputMaleSheet.createRow(i);
//            row.createCell(0).setCellValue(maleIndividualsList.get(i).getFirstName());
//            row.createCell(1).setCellValue(maleIndividualsList.get(1).getLastName());
//            row.createCell(2).setCellValue(maleIndividualsList.get(i).getAge());
//            row.createCell(3).setCellValue(maleIndividualsList.get(i).getGender());
//            row.createCell(4).setCellValue(maleIndividualsList.get(i).getSalary());
//        }
//        outputXSSFWorkbook.write(maleFileOutputStream);
//​
//        XSSFSheet outputFemaleSheet = outputXSSFWorkbook.createSheet("Females");
//        for (int i = 0; i < femaleIndividualsList.size(); i++) {
//            XSSFRow row = outputFemaleSheet.createRow(i);
//            row.createCell(0).setCellValue(femaleIndividualsList.get(i).getFirstName());
//            row.createCell(1).setCellValue(femaleIndividualsList.get(i).getLastName());
//            row.createCell(2).setCellValue(femaleIndividualsList.get(i).getAge());
//            row.createCell(3).setCellValue(femaleIndividualsList.get(i).getGender());
//            row.createCell(4).setCellValue(femaleIndividualsList.get(i).getSalary());
//        }
//        outputXSSFWorkbook.write(femaleFileOutputStream);
//​
//    }
//}
//Collapse
//
//
//
//        10:22
//        MixedIndividuals.java
//        package com.syntax.class36;
//        ​
//public class MixedIndividuals {
//    private String firstName;
//    private String lastName;
//    private int age;
//    private char gender;
//    private double salary;
//​
//    public MixedIndividuals(){}
//​
//    public MixedIndividuals(String firstName, String lastName, int age, char gender, double salary) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.gender = gender;
//        this.salary = salary;
//    }
//​
//    public String getFirstName() {
//        return firstName;
//    }
//​
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//​
//    public String getLastName() {
//        return lastName;
//    }
//​
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//​
//    public int getAge() {
//        return age;
//    }
//​
//    public void setAge(int age) {
//        this.age = age;
//    }
//​
//    public char getGender() {
//        return gender;
//    }
//​
//    public void setGender(char gender) {
//        this.gender = gender;
//    }
//​
//    public double getSalary() {
//        return salary;
//    }
//​
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//​
//    @Override
//    public String toString() {
//        return "MixedIndividuals{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                ", salary=" + salary +
//                '}' + "\n" ;
//    }
}
