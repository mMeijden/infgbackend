package com.group4.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
public class Retailer {
    private int id;
    private String companyName;
    private int retailerType;
    private int oldId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "Retailer_type")
    public int getRetailerType() {
        return retailerType;
    }

    public void setRetailerType(int retailerType) {
        this.retailerType = retailerType;
    }

    @Basic
    @Column(name = "OLD_ID")
    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Retailer retailer = (Retailer) o;

        if (id != retailer.id) return false;
        if (retailerType != retailer.retailerType) return false;
        if (oldId != retailer.oldId) return false;
        if (companyName != null ? !companyName.equals(retailer.companyName) : retailer.companyName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + retailerType;
        result = 31 * result + oldId;
        return result;
    }
}
