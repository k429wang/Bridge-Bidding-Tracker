import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_readwrite {
    public static void main(String[] args) throws IOException {
        System.out.println("Start!");
        try {
            // CREATE FILE
            File data = new File("data.txt");
            if (data.createNewFile()) {
                System.out.println("File created: " + data.getName());
            } else {
                System.out.println("File already exists.");
            }

            // READ FILE
            Scanner reader = new Scanner(data);
            String[] file;
            while (reader.hasNextLine()) {
                String text = reader.nextLine();
                System.out.println(text);
            }
            reader.close();

            // WRITE TO FILE
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Replaced!");
            writer.close();
            System.out.println("Successfully wrote to file.");

        } catch (Exception e) {
            System.out.println("An error occurred. ");
            e.printStackTrace();
            System.out.println("End!");
        }
    }
}
