package repoCompany;

public class Company {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private String website;
    private Contact contact = new Contact();
    private CompanyRegister companyRegister = new CompanyRegister();

    public Company(String name, String address, String city,
                   String state, String zip, String phone, String email,
                   String website, Contact contact, CompanyRegister companyRegister) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.contact = contact;
        this.companyRegister = companyRegister;
    }

    public Company() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public CompanyRegister getCompanyRegister() {
        return companyRegister;
    }

    public void setCompanyRegister(CompanyRegister companyRegister) {
        this.companyRegister = companyRegister;
    }
}
