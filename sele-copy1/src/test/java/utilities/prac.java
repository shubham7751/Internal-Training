//package utilities;
//
//import org.apache.poi.ss.usermodel.*;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class prac {
//    public void Readxlsdata() throws IOException {  //put void here
//    }
//
//    public static void main(String[] args) throws IOException {
//        Readxlsdata red=new Readxlsdata();
//       // red.getData("login");
//
//    }
//    public String[][] getData(String excelSheetName) throws IOException {
//        File f = new File("C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\selenium_frame_project\\src\\main\\resources\\testdata\\testdata.xlsx");
//        // File f = new File(System.getProperty("use.dir") + "\\src\\main\\resources\\testdata\\testdata.xlsx");
//        // C:\Users\NTS-ShubhamJawale\IdeaProjects\selenium_frame_project\src\main\resources\testdata
//        FileInputStream fis = new FileInputStream(f);
//        Workbook wb = WorkbookFactory.create(fis);
//        Sheet sheetName = wb.getSheet(excelSheetName);
//
//        int totalRows=sheetName.getLastRowNum();
//        System.out.println(totalRows);
//        Row rowCells=sheetName.getRow(0);
//        int totalCols=rowCells.getLastCellNum();
//        System.out.println(totalCols);
//
//        DataFormatter format=new DataFormatter();
//        String testData[][]=new String[totalRows][totalCols];
//        for(int i=1;i<=totalRows;i++){
//            for(int j=0;j<totalCols;j++){
//                testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
//                System.out.println(testData[i-1][j]);
//            }
//        }
//        return testData;
//    }
//}
