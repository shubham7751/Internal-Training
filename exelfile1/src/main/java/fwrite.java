import  java.io.*;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;
public class fwrite
{
    public static void main(String[]args)
    {

        try
        {

            String filename = "C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\sj.xlsx";

            HSSFWorkbook workbook = new HSSFWorkbook();

            HSSFSheet sheet = workbook.createSheet("emp_details");

            HSSFRow rowhead = sheet.createRow((short)0);
// creat heading
            rowhead.createCell(0).setCellValue("Sr.no");
            rowhead.createCell(1).setCellValue("Name");
            rowhead.createCell(2).setCellValue("id");
            rowhead.createCell(3).setCellValue("name2");
            rowhead.createCell(4).setCellValue("code");
//creating the 1st row
            HSSFRow row = sheet.createRow((short)1);
//inserting data in the first row
            row.createCell(0).setCellValue("1");
            row.createCell(1).setCellValue("a");
            row.createCell(2).setCellValue("11");
            row.createCell(3).setCellValue("aa");
            row.createCell(4).setCellValue("111");
//creating the 2nd row
            HSSFRow row1 = sheet.createRow((short)2);
//inserting data in the second row
            row1.createCell(0).setCellValue("2");
            row1.createCell(1).setCellValue("br");
            row1.createCell(2).setCellValue("22");
            row1.createCell(3).setCellValue("bb");
            row1.createCell(4).setCellValue("222");
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
//closing the Stream
            fileOut.close();
//closing the workbook
            workbook.close();
//prints the message on the console
            System.out.println("Excel file has been generated successfully.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}