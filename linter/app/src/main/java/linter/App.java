/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\STUDENT\\401Java\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js");
        jsLinter(path);

    }
    public  static  void jsLinter(Path path){
        File file = new File(String.valueOf(path));

        try {
            Scanner scanner = new Scanner(file);
            int lineNumber = 0;
            while(scanner.hasNextLine()){
                String line =  scanner.nextLine();
                lineNumber++;
                if( line.indexOf(';',line.length()-1) == -1){
                    if(!line.isEmpty() && !line.endsWith("}") && !line.endsWith("{") && !line.contains("if") && !line.contains("else")){
                        System.out.println("Line"+lineNumber+": Missing semicolon.");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("The provided file path/name caused a file not found exception");
        }
    }
}