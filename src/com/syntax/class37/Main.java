package com.syntax.class37;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try{
         int fifthElement= arr[4];
         throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException ex){
          System.out.println(ex);
        }
    }
}