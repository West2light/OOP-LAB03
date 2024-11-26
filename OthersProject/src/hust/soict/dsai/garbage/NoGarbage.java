package hust.soict.dsai.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "src/file1.txt"; 
        byte[] inputBytes = {};
        long startTime, endTime;

        try {
           
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }


        startTime = System.currentTimeMillis();
        StringBuilder outputString = new StringBuilder();
        for (byte b : inputBytes) {
            outputString.append((char) b); 
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (endTime - startTime) + " ms");
    }
}
