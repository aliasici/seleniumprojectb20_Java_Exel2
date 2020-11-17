package com.cybertek.tests.day14_exel_io;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile2 {
    public static void main(String[] args) throws IOException {

        String filePath = "vytrack_testusers.xlsx";

        File file = new File(filePath);

        Workbook workbook = WorkbookFactory.create(file);
        
    }
}
