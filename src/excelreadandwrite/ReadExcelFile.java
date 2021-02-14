package excelreadandwrite;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile {
    // File location
    public static String filePath = "C:/Users/ExTraxex/Desktop/WEA_SELENIUM_NY21.xlsx";


    public static void main(String[] args) {
        ReadExcelFile.readExcelFile(filePath,0);
        System.out.println("************************************");
        ReadExcelFile.readExcelFile(filePath,1);
        System.out.println("************************************");
        ReadExcelFile.readExcelFile(filePath,2);

    }


    public static void readExcelFile(String filePath, int sheetNumber) {
        try {
            // For InputSteam
            FileInputStream inputStream = new FileInputStream(filePath);

            Workbook workbook = new XSSFWorkbook(inputStream);
            // Which sheet it will read?
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);

            Iterator<Row> rowIterator = dataTypeSheet.iterator();

            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();

                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + "   ");
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "   ");
                    }
                }
                System.out.println();
            }

        } catch (FileNotFoundException fn) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("Reading done");
        }


    }


}