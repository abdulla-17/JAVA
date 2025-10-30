import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class schoolstore {
    public static void main(String[] args) {
        File file = new File("assignment.txt");
        char[] content = new char[100];

        try {
    
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("ℹFile already exists.");
            }

    
            FileWriter writer = new FileWriter(file);
            writer.write("Java File Handling Practice");
            writer.close();
            System.out.println(" Successfully wrote to the file.");

    
            FileReader reader = new FileReader(file);
            int charsRead = reader.read(content);
            reader.close();
            System.out.println(" Data read from the file:");
            System.out.println(new String(content, 0, charsRead));

        } catch (Exception e) {
            System.out.println(" An error occurred during file operations.");
            e.printStackTrace();
        }

        boolean deleted = file.delete();
        if (deleted) {
            System.out.println("The file was successfully deleted.");
        } else {
            System.out.println(" The file could not be deleted.");
        }
    }
}