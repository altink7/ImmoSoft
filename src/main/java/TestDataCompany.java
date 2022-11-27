import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import repoCompany.Company;
import repoCompany.CompanyRegister;
import repoCompany.Contact;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataCompany {
    Contact contactRandom = new Contact();
    CompanyRegister companyRegisterRandom = new CompanyRegister();
    Company altinit = new Company();


    PDDocument document = new PDDocument();


    public String[] createRevenueArray() {
        String[] revenue = new String[75];
        for (int i = 0; i < revenue.length; i++) {
            revenue[i] = String.valueOf((int) (Math.random() * 1000000));
        }
        return revenue;
    }

    public void writeRevenueToFile(String[] revenue) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("revenue.txt");
            for (String s : revenue) {
                fileOutputStream.write(s.getBytes());
                fileOutputStream.write("\r \n".getBytes());
            }
                fileOutputStream.write(("The average revenue is: " + averageRevenue(revenue)).getBytes());
                fileOutputStream.write("\r \n".getBytes());
                fileOutputStream.write(("The minimum revenue is: " + minRevenue(revenue)).getBytes());
                fileOutputStream.write("\r \n".getBytes());
                fileOutputStream.write(("The maximum revenue is: " + maxRevenue(revenue)).getBytes());
                fileOutputStream.write("\r \n".getBytes());
                fileOutputStream.write(("The median revenue is: " + medianRevenue(revenue)).getBytes());
                fileOutputStream.write("\r \n".getBytes());
                fileOutputStream.write(("The standard deviation of the revenue is: " + standardDeviationRevenue(revenue)).getBytes());
                fileOutputStream.write("\r \n".getBytes());
                fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createPDF() throws IOException {
        PDPage page = new PDPage();
        document.addPage(page);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.beginText();
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 20);
        contentStream.setLeading(47.5f);
        contentStream.newLineAtOffset(50, 700);
        altinit.setName("Altinit");
        contentStream.showText("Company Name: " + altinit.getName());
        contentStream.newLine();
        contentStream.showText("The following is the revenue for the company: ");
        contentStream.newLine();
        contentStream.showText("the average revenue is: " + averageRevenue(createRevenueArray())+ "€");
        contentStream.newLine();
        contentStream.showText("the minimum revenue is: " + minRevenue(createRevenueArray())+ "€");
        contentStream.newLine();
        contentStream.showText("the maximum revenue is: " + maxRevenue(createRevenueArray())+"€");
        contentStream.newLine();
        contentStream.showText("the median revenue is: " + medianRevenue(createRevenueArray())+ "€");
        contentStream.newLine();
        contentStream.showText("the standard deviation of the revenue is: " + standardDeviationRevenue(createRevenueArray())+"€");
        contentStream.newLine();
        contentStream.endText();
        contentStream.close();

        document.save("revenue.pdf");
        document.close();
    }


    private String standardDeviationRevenue(String[] revenue) {
        double sum = 0;
        double average = Double.parseDouble(averageRevenue(revenue));
        for (String s : revenue) {
            sum += Math.pow(Double.parseDouble(s) - average, 2);
        }
        return String.valueOf(Math.sqrt(sum / revenue.length));
    }

    private String medianRevenue(String[] revenue) {
        int[] revenueInt = new int[revenue.length];
        for (int i = 0; i < revenue.length; i++) {
            revenueInt[i] = Integer.parseInt(revenue[i]);
        }
        int temp;
        for (int i = 0; i < revenueInt.length; i++) {
            for (int j = i + 1; j < revenueInt.length; j++) {
                if (revenueInt[i] > revenueInt[j]) {
                    temp = revenueInt[i];
                    revenueInt[i] = revenueInt[j];
                    revenueInt[j] = temp;
                }
            }
        }
        int median = revenueInt[revenueInt.length / 2];
        return String.valueOf(median);
    }

    private String maxRevenue(String[] revenue) {
        int max = Integer.parseInt(revenue[0]);
        for (String s : revenue) {
            if (Integer.parseInt(s) > max) {
                max = Integer.parseInt(s);
            }
        }
        return String.valueOf(max);
    }

    private String minRevenue(String[] revenue) {
        int min = Integer.parseInt(revenue[0]);
        for (String s : revenue) {
            if (Integer.parseInt(s) < min) {
                min = Integer.parseInt(s);
            }
        }
        return String.valueOf(min);
    }

    private String averageRevenue(String[] revenue) {
        int sum = 0;
        for (String s : revenue) {
            sum += Integer.parseInt(s);
        }
        return String.valueOf(sum / revenue.length);
    }


}
