import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("/home/hirwa/NetBeansProjects/MYJAVAJOURNEY/JavaInputOutput/fileOne.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
