package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class GarbageCreator {
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
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b; 
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time with String concatenation: " + (endTime - startTime) + " ms");
    }
}
