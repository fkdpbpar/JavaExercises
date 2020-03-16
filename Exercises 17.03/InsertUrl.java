/*
Create a .txt file that contains the following 5 URLs.
https://www.javatpoint.com/
https://docs.oracle.com/javase/8/docs/
https://www.baeldung.com/
https://www.vogella.com//tutorials/java.html
https://www.tutorialspoint.com/java_technology_tutorials.htm
Create a method for the following:
Read the file and print only the subdomain of each url.
For example the subdomain of https://www.javatpoint.com/ is javatpoint.
The subdomain of https://docs.oracle.com/javase/8/docs/ is docs.oracle
Also create a method that prints only the urls that contain the word java.
 */
package inserturl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 30694
 */
public class InsertUrl {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\30694\\Desktop\\Text3.txt";
        File file1 = new File(file);
        FileWriter filewriter = new FileWriter(file1, true);
        PrintWriter printWriter = new PrintWriter(filewriter);
        printSubdomain("https://www.javatpoint.com/", 12, 22);

        printSubdomain("https://docs.oracle.com/javase/8/docs/", 8, 19);

        printSubdomain("https://www.baeldung.com/", 12, 19);

        printSubdomain("https://www.vogella.com//tutorials/java.html", 12, 19);

        printSubdomain("https://www.tutorialspoint.com/java_technology_tutorials.htm", 12, 26);

    }

    public static void printSubdomain(String message, int x, int y) {
        String javapoint = (message);
        String javapoint1 = javapoint.substring(x, y);
        printWriter.println(javapoint1);
        String docsOracle = (message);
        String docsOracle1 = docsOracle.substring(x, y);
        printWriter.println(docsOracle1);
        String baeldung = (message);
        String baeldung1 = baeldung.substring(x, y);
        printWriter.println(baeldung1);
        String vogella = (message);
        String vogella1 = vogella.substring(x, y);
        printWriter.println(vogella1);
        String tutorialspoint = (message);
        String tutorialspoint1 = tutorialspoint.substring(x, y);
        printWriter.println(tutorialspoint1);
        printWriter.close();
        filewriter.close();
    }
}
