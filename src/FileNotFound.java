import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {


    public static void main(String args[]){
        try {
            File f = new File("F:\\Soumya\\Program");
            FileReader fr = new FileReader(f);
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found");
        }
    }
}
