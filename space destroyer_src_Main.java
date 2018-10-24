import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static Random generator(){
        Random randomizer = new Random(2);
        return randomizer;
    }
    public static void file_managment(){
        boolean tr = true;
        try (PrintWriter just_delete_this = new PrintWriter("space_destroyer.txt")) {
            while (tr != false){
                just_delete_this.print(generator());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }

    public static void main(String[] args) {
        file_managment();
    }
}
