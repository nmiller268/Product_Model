import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class ProductWriter {

    public static void main(String[] args) {
        ArrayList<String> Recs = new ArrayList<>();
        //ID



        Scanner myID = new Scanner(System.in);
        System.out.println("Enter ID: ");

        String iD = myID.nextLine();
        //System.out.println("ID is: " + iD);
        //First Name
        Scanner myName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fname = myName.nextLine();

        //Description
        Scanner description = new Scanner(System.in);
        System.out.println("Enter the description: ");
        String pdesc = description.nextLine();

        //Year of birth
        Scanner cost = new Scanner(System.in);
        System.out.println("Enter the cost of the product: ");
        double pcost = cost.nextDouble();


        System.out.println("Record is: " + iD + ", " + pdesc + ", " + pcost +  ", " + fname);




        //Create new file

        try {
            File productTest = new File("ProductTestData.txt");
            if (productTest.createNewFile()) {
                System.out.println("File Created: " + productTest.getName());
            } else {
                System.out.println("File Already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        //Write to file

        try {
            FileWriter dataWriter = new FileWriter("ProductTestData.txt");
            dataWriter.write( fname + ", " + pdesc + ", " + iD + ", " + pcost );
            dataWriter.close();
            System.out.println("Successfully wrote! ");
        } catch (IOException e) {
            System.out.println("Error Occurred");
            e.printStackTrace();
        }



    }

}


