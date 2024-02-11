package cSVFileWriter;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFileReader {
 public static void readAndDisplayFile(String fileName) throws IOException {
 FileInputStream fileInputStream = null;
 try {
 fileInputStream = new FileInputStream("C:\\Users\\Desktop\\student_records.csv");
 int currentByte;
 while ((currentByte = fileInputStream.read()) != -1) {
 System.out.print((char) currentByte);
 }
 } finally {
 if (fileInputStream != null) {
 fileInputStream.close();
 }
 }
 }
 public static void main(String[] args) {
 String fileName = "sample.txt";
 try {
 readAndDisplayFile(fileName);
 System.out.println("\nOperation was successful.");
 } catch (IOException e) {
 System.err.println("An error occurred during the operation: " + 
e.getMessage());
 }
 }
}