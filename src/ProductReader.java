import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ProductReader {

    public static void main(String[] args) {

        try {

            File personTest = new File("ProductTestData.txt");

            Scanner myReader = new Scanner(personTest);

            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                System.out.printf("%-6s%-20s%6s%6s \n", "ID ", "First ", "Description",  "Cost");
                System.out.println(data);

            }

            myReader.close();

        } catch (FileNotFoundException e) {

            System.out.println("An error occurred.");

            e.printStackTrace();

        }

    }

}