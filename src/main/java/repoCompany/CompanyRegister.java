package repoCompany;

public class CompanyRegister {
    private String notes;
    private String dateCreated;
    private String dateModified;
    private String createdBy;
    private String modifiedBy;
    private String id;
    private String status;
    private String type;
    private String industry;
    private String size;
    private String[] revenue;
    private String rating;
    private String fax;
    private String mobile;
    private String country;

    public CompanyRegister() {
    }

    public CompanyRegister(String notes, String dateCreated, String dateModified,
                           String createdBy, String modifiedBy, String id, String status,
                           String type, String industry, String size, String[] revenue, String rating,
                           String fax, String mobile, String country) {
        this.notes = notes;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.id = id;
        this.status = status;
        this.type = type;
        this.industry = industry;
        this.size = size;
        this.revenue = revenue;
        this.rating = rating;
        this.fax = fax;
        this.mobile = mobile;
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Object[] getRevenue() {
        return revenue;
    }

    public void setRevenue(String[] revenue) {
        this.revenue = revenue;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
