/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppTest {

    @Test public void testLinterOneError(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        Path pathOneError = Paths.get("C:\\Users\\STUDENT\\401Java\\java-fundamentals\\linter\\app\\src\\test\\resources\\oneError.js");
        App.jsLinter(pathOneError);
        String expectedOneError  = "Line91: Missing semicolon.\r\n";
        assertEquals(expectedOneError, outContent.toString());
    }
    @Test public void testLinterNoErrors(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Path pathNoErrors = Paths.get("C:\\Users\\STUDENT\\401Java\\java-fundamentals\\linter\\app\\src\\test\\resources\\noErrors.js");
        App.jsLinter(pathNoErrors);
        String expectedNoError  = "";
        assertEquals(expectedNoError, outContent.toString());

    }
    @Test public void testLinterFewErrors(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Path pathFewErrors = Paths.get("C:\\Users\\STUDENT\\401Java\\java-fundamentals\\linter\\app\\src\\test\\resources\\fewErrors.js");
        App.jsLinter(pathFewErrors);
        String expectedFewErrors  = "Line5: Missing semicolon.\r\n"
                +"Line91: Missing semicolon.\r\n"+"Line94: Missing semicolon.\r\n"+"Line95: Missing semicolon.\r\n"+"Line96: Missing semicolon.\r\n";

        assertEquals(expectedFewErrors, outContent.toString());

    }

    @Test public void testLinterManyErrors(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Path pathManyErrors = Paths.get("C:\\Users\\STUDENT\\401Java\\java-fundamentals\\linter\\app\\src\\test\\resources\\manyErrors.js");
        App.jsLinter(pathManyErrors);
        String expectedManyErrors  = "Line3: Missing semicolon.\r\n"+"Line5: Missing semicolon.\r\n"+"Line11: Missing semicolon.\r\n"+"Line13: Missing semicolon.\r\n"+
                "Line15: Missing semicolon.\r\n"+"Line26: Missing semicolon.\r\n"+"Line28: Missing semicolon.\r\n"
                +"Line91: Missing semicolon.\r\n"+"Line94: Missing semicolon.\r\n"+"Line95: Missing semicolon.\r\n"+"Line96: Missing semicolon.\r\n";

        assertEquals(expectedManyErrors, outContent.toString());

    }

    @Test public void testLinterEmptyFile(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Path emptyFile = Paths.get("C:\\Users\\STUDENT\\401Java\\java-fundamentals\\linter\\app\\src\\test\\resources\\emptyFile.js");
        App.jsLinter(emptyFile);
        String expectedEmptyFile  = "";

        assertEquals(expectedEmptyFile, outContent.toString());

    }
}