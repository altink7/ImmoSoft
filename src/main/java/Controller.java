import org.checkerframework.common.reflection.qual.GetClass;
import org.springframework.web.bind.annotation.*;
import repoCompany.Company;
import repoCompany.CompanyRegister;
import repoCompany.Contact;

@RestController
@RequestMapping("/api")
public class Controller {


    @RequestMapping("/getCompany")
    public Company getCompany() {
        return new Company("Company Name", "Address", "City", "State", "Zip", "Phone", "Email", "Website", new Contact(), new CompanyRegister());
    }

    @RequestMapping("/getContact")
    public Contact getContact() {
        return new Contact();
    }

    @RequestMapping("/getCompanyRegister")
    public CompanyRegister getCompanyRegister() {
        return new CompanyRegister();
    }

    @GetMapping("/getCompanyLogo")
    public String getCompanyLogo() {
        return "Company Logo";
    }

    @PutMapping("/putRevenue")
    public String putRevenue() {
        return "Revenue";
    }


}
