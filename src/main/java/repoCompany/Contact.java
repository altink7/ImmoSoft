package repoCompany;

public class Contact {
    private String Phone;
    private String Email;
    private String Title;
    private String Address;
    private String City;
    private String State;
    private String Zip;
    private String Country;
    private String Fax;
    private String Mobile;
    private String Website;
    private String Notes;

    public Contact() {
    }
    public Contact(String phone, String email, String title,
                   String address, String city, String state, String zip,
                   String country, String fax, String mobile, String website, String notes) {
        Phone = phone;
        Email = email;
        Title = title;
        Address = address;
        City = city;
        State = state;
        Zip = zip;
        Country = country;
        Fax = fax;
        Mobile = mobile;
        Website = website;
        Notes = notes;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
