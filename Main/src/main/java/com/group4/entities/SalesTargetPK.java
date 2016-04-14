package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class SalesTargetPK implements Serializable {
    private int employeeId;

    @Column(name = "Employee_ID")
    @Id
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    private int productId;

    @Column(name = "Product_ID")
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    private int retailerId;

    @Column(name = "Retailer_ID")
    @Id
    public int getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(int retailerId) {
        this.retailerId = retailerId;
    }

    private Timestamp salesPeriod;

    @Column(name = "Sales_Period")
    @Id
    public Timestamp getSalesPeriod() {
        return salesPeriod;
    }

    public void setSalesPeriod(Timestamp salesPeriod) {
        this.salesPeriod = salesPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesTargetPK that = (SalesTargetPK) o;

        if (employeeId != that.employeeId) return false;
        if (productId != that.productId) return false;
        if (retailerId != that.retailerId) return false;
        if (salesPeriod != null ? !salesPeriod.equals(that.salesPeriod) : that.salesPeriod != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + productId;
        result = 31 * result + retailerId;
        result = 31 * result + (salesPeriod != null ? salesPeriod.hashCode() : 0);
        return result;
    }
}
