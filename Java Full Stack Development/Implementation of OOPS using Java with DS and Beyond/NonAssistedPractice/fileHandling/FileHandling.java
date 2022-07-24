package NonAssistedPractice.fileHandling;

import java.io.*;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 23/07/22
 * Time: 12:44
 */


public class FileHandling {
    public static void main(String[] args) {
        String path = "./src/NonAssistedPractice/fileHandling/File.txt";

        try {       // try block to handle error
            File FileObj = new File(path);     // creating file


            if (FileObj.createNewFile()) {
                System.out.println("File has been created successfully as " + FileObj.getName() + "\n");

                FileWriter FileWriteObj = new FileWriter(path);    // writing in the file
                FileWriteObj.write("Writing operation in the file...");
                FileWriteObj.close();

                System.out.println("Writing operation in the file is successfully done !" + "\n");

                System.out.println("Text in the file : ");
                Scanner fileReader = new Scanner(FileObj);
                while (fileReader.hasNextLine()) {
                    String data = fileReader.nextLine();
                    System.out.println(data);
                }
                fileReader.close();
            }
            else {
                System.out.println("File is already created.\n");

                String existingDataLine = "";
                String existingData = "";
                String newData = "New Line";

                Scanner fileReader = new Scanner(FileObj);
                while (fileReader.hasNextLine()) {
                    existingDataLine = fileReader.nextLine();
                    existingData += existingDataLine + "\n";


                }
                fileReader.close();
                FileWriter FileWriteObj = new FileWriter(path);    // writing in the file

                BufferedWriter FileAppendObj = new BufferedWriter(FileWriteObj);    // writing in the file

                FileAppendObj.append(existingData + newData);



                System.out.println("\nAppending new line in the file is completed successfully !\n");

                System.out.println("Now updated text in the file : ");
                FileAppendObj.close();

                fileReader = new Scanner(FileObj);
                while (fileReader.hasNextLine()) {
                    String data = fileReader.nextLine();
                    System.out.println(data);
                }
            }
        }

        catch (IOException e) {     // catch block to handle error
            System.out.println("Error occurred while creating file.");
            e.printStackTrace();
        }
    }
}
