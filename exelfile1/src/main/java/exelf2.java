import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
public class exelf2
{
    public static void main(String[] args)
           // throws FileNotFoundException, IOException
    {
        try {
//creating an instance of Workbook class
            Workbook wb = new HSSFWorkbook();
//creates an excel file at the specified location
            OutputStream fileOut = new FileOutputStream("C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\sj.xlsx");
            System.out.println("Excel File has been created successfully.");
            wb.write(fileOut);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
