import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class readf {
    public static void main(String[] args){
        try {
            FileReader r = new FileReader("C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\sss.csv");
            CSVReader csvr = new CSVReader(r);
            String[] nextrec;
            while((nextrec=csvr.readNext())!=null){
                for(String cell:nextrec){
                    System.out.printf("%-10s",cell);
                }
                System.out.println();
            }


        }
        catch(IOException i){System.out.println(i);} catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }

    }
}
