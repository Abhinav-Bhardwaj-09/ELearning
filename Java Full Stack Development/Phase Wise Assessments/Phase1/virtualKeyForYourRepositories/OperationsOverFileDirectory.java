package virtualKeyForYourRepositories;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 29/07/22
 * Time: 20:56
 */


public class OperationsOverFileDirectory {

    ArrayList<String> filesList =  new ArrayList <> ();
    Scanner SC = new Scanner(System.in);

    public OperationsOverFileDirectory (String path) {
        File directoryPath = new File(path);
        String preExistingFiles [] = directoryPath.list();

        if(preExistingFiles != null) {
            for (String file : preExistingFiles) {
                filesList.add(file);
            }
        }
    }

    // To create new file
    public  void createNewFile(String path) {
        System.out.print("Enter the name for the new file: ");
        String fileName  = SC.next();
        System.out.println();

        String filePath = path + fileName;

        File obj  =  new File(filePath);

        try {
            if(obj.createNewFile()) {
                filesList.add(obj.getName());
                System.out.println("Your new file has been created as: " + obj.getName() + "\n\n");
            }
            else {
                System.out.println("File name already exists.");
            }
        }

        catch(Exception err) {
            System.out.println("Facing issue while trying to create new file as " + err);
        }
    }

    // To delete a file
    void deleteFiles(String path) {
        System.out.print("Enter the file name you want to delete: ");
        String fileName  = SC.next();

        String filePath = path + fileName;

        File obj2  =  new File(filePath);

        if (obj2.delete()) {
            System.out.print("\n" + obj2.getName() + " is deleted from the directory.\n");


            for (String E: filesList) {
                if(E.equalsIgnoreCase(fileName)) {
                    filesList.remove(E);
                    showFiles();
                    return;
                }
            }

        }
        else {
            System.out.println("File does not exists !!!\n");
        }
    }

    // To search any file
    ArrayList<String> searchFile() {
        System.out.print("Enter the file name you want to search for: ");
        String fileName = SC.next();

        ArrayList<String > matchingFiles =  new ArrayList<>();

        for (int index = 0; index < filesList.size(); index++) {
            if (filesList.get(index).equalsIgnoreCase(fileName)) {
                matchingFiles.add(filesList.get(index));
            }
        }

        return matchingFiles;
    }


    // To show
    void showFiles() {
        if(filesList.size() == 0) {
            System.out.println("Oops..your directory is empty.\n");
            return;
        }

        System.out.println("Files present in your directory are: ");
        for(int file1 = 0; file1 < filesList.size(); file1++) {
            for(int file2 = 0; file2 < filesList.size() - 1; file2++) {
                if (filesList.get(file2).compareTo(filesList.get(file2 + 1)) > 0) {
                    String temp = filesList.get(file2);
                    filesList.set(file2, filesList.get(file2 + 1));
                    filesList.set(file2 + 1, temp);

                }
            }
        }

        for (String fileName: filesList) {
            System.out.println("\t\t\t" + fileName);
        }
        System.out.println();
    }
}