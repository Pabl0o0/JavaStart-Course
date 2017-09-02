import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileTester {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String tmp = null;
            while ((tmp = reader.readLine()) != null) {
                System.out.println(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        ) {
            writer.write("Bartek");
            writer.newLine();
            writer.write("Wojtek");
        } catch(IOException e) {
            System.err.println("B³¹d zapisu do pliku"); 
        }
    }
}