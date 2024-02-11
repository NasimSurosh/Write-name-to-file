package WriteName;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileWriterExercise {
    public static void writeNamesToFile(String[] names, String fileName) throws
            IOException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\Vijap\\"+fileName);
            for (String name : names) {
                byte[] nameBytes = (name + "\n").getBytes();
                fileOutputStream.write(nameBytes);
            }
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
    public static void main(String[] args) {
        String[] names = {"Joe", "Elton", "Casie", "David", "Carlie"};
        String fileName = "names222.txt";
        try {
            writeNamesToFile(names, fileName);
            System.out.println("Names have been successfully written to " +
                    fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " +
                    e.getMessage());
        }
    }
}