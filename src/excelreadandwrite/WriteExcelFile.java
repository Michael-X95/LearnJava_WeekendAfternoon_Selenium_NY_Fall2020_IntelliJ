package excelreadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExcelFile {

    //Write: want to create Excel file using Java
    //Insert data to the created Excel file
    //File Path
    public static final String FILE_PATH="DataTest/SampleExcelFile.xlsx";

    public static void main(String[] args)throws IOException {
        Object[][] stDetails = {
                {"sl", "FirstName", "LastName", "Phone", "Address"},
                {"101", "Apples", "Green", "123456789", "Tree"},
                {"102", "Banana", "Yellow", "123456789", "Tree"},
                {"103", "Cherry", "Red", "123456789", "Tree"}};

                WriteExcelFile.writeExcel(FILE_PATH, "pnt",stDetails);

    }

        public static void writeExcel (String filePath, String sheetName, Object[][]data)throws IOException {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet(sheetName);
            int rowNum = 0;
            System.out.println("Excel file Created");

            for (Object[] dt : data) {
                Row row = sheet.createRow(rowNum++);
                int colNum = 0;
                for (Object field : dt) {
                    Cell cell = row.createCell(colNum++);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }

                }
            }
            try {
                FileOutputStream outputStream = new FileOutputStream(filePath);
                workbook.write(outputStream);
                workbook.close();

            } catch (FileNotFoundException fn) {
                System.out.println("File not found Exception");
            } catch (IOException io) {
                System.out.println("Done");
            }
        }
    }
