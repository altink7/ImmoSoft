import repoCompany.CompanyLogo;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*TestDataCompany testDataCompany = new TestDataCompany();
        String[] revenue = testDataCompany.createRevenueArray();
        testDataCompany.writeRevenueToFile(revenue);
        try {
            testDataCompany.createPDF();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");*/

        //print the company logo
        CompanyLogo companyLogo = new CompanyLogo();
        companyLogo.paint();

    }




}
