package com.group4.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Sales_target", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(SalesTargetPK.class)
public class SalesTarget {
    private int employeeId;
    private int productId;
    private int retailerId;
    private Timestamp salesPeriod;
    private Integer salesTarget;
    private Boolean targetAchieved;

    @Id
    @Column(name = "Employee_ID")
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Id
    @Column(name = "Product_ID")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "Retailer_ID")
    public int getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(int retailerId) {
        this.retailerId = retailerId;
    }

    @Id
    @Column(name = "Sales_Period")
    public Timestamp getSalesPeriod() {
        return salesPeriod;
    }

    public void setSalesPeriod(Timestamp salesPeriod) {
        this.salesPeriod = salesPeriod;
    }

    @Basic
    @Column(name = "Sales_target")
    public Integer getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(Integer salesTarget) {
        this.salesTarget = salesTarget;
    }

    @Basic
    @Column(name = "Target_achieved")
    public Boolean getTargetAchieved() {
        return targetAchieved;
    }

    public void setTargetAchieved(Boolean targetAchieved) {
        this.targetAchieved = targetAchieved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesTarget that = (SalesTarget) o;

        if (employeeId != that.employeeId) return false;
        if (productId != that.productId) return false;
        if (retailerId != that.retailerId) return false;
        if (salesPeriod != null ? !salesPeriod.equals(that.salesPeriod) : that.salesPeriod != null) return false;
        if (salesTarget != null ? !salesTarget.equals(that.salesTarget) : that.salesTarget != null) return false;
        if (targetAchieved != null ? !targetAchieved.equals(that.targetAchieved) : that.targetAchieved != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + productId;
        result = 31 * result + retailerId;
        result = 31 * result + (salesPeriod != null ? salesPeriod.hashCode() : 0);
        result = 31 * result + (salesTarget != null ? salesTarget.hashCode() : 0);
        result = 31 * result + (targetAchieved != null ? targetAchieved.hashCode() : 0);
        return result;
    }
}
