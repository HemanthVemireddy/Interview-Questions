package Challange_100_Days;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException
{
    public static void main(String[] args)
    {
        try {
            FileReader fileReader = new FileReader("Employee.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("File not found Exception "+fileNotFoundException.getMessage());
        }
        catch (IOException ioException)
        {
            System.out.println("IO Exception"+ioException.getMessage());
        }

    }
}
