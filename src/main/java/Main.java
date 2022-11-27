import javax.swing.text.Document;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        TestDataCompany testDataCompany = new TestDataCompany();
        String[] revenue = testDataCompany.createRevenueArray();
        testDataCompany.writeRevenueToFile(revenue);
        try {
            testDataCompany.createPDF();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");

    }




}
