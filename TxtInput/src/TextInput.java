import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextInput {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(
                "C:\\Users\\DANSON ABUYA\\Documents\\myfile.txt");


        int i;
        // Holds true till there is nothing to read
        while ((i = fileReader.read()) != -1)

            // Print all the content of a file
            System.out.print((char)i);

    }


    }

