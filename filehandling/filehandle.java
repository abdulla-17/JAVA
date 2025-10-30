import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

class FileHandle {
    public static void main(String[] args) {
        File file = new File("log.txt");
        char array[] = new char[50];
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created: " + file.getName());
            }
            else {
                System.out.println("File already exists.");
            }
            
          

            // Write to the file
            FileWriter writer = new FileWriter("log.txt");
            writer.write("Hello, World!\nThis is a sample file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // Read from the file
            FileReader reader = new FileReader("log.txt");
            reader.read(array);
            System.out.println("Data read from the file:");
            System.out.println(array);
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}