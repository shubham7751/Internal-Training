package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\new_sele_frame\\src\\main\\resources\\config\\config.properties");


        Properties p=new Properties();
        p.load(fr);
        System.out.println(p.getProperty("browser"));
        System.out.println(p.getProperty("testurl"));
    }
}
