import com.opencsv.CSVWriter;

import java.io.*;
public class file1
{
    public static void main(String[]args)
    {
        try
        {
            FileWriter f=new FileWriter("C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\sss.csv");
           CSVWriter csv=new CSVWriter(f);
           String[] data={"Name","Dep","Empid","Contact"};
           csv.writeNext(data);
            String[] data1={"shubh","it","777","5555"};
            csv.writeNext(data1);
            String[] data2={"aaaa","com","888","6666"};
            csv.writeNext(data2);
            System.out.println("data enter successfully");

            csv.close();
//
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}