package com.group4.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Retailer_order", schema = "dbo", catalog = "OutdoorParadise")
public class RetailerOrder {
    private int id;
    private Timestamp orderDate;
    private Integer oldOrderNumber;
    private Integer oldRetailerSiteCode;
    private Integer oldSalesStaffCode;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Order_date")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "OLD_ORDER_NUMBER")
    public Integer getOldOrderNumber() {
        return oldOrderNumber;
    }

    public void setOldOrderNumber(Integer oldOrderNumber) {
        this.oldOrderNumber = oldOrderNumber;
    }

    @Basic
    @Column(name = "OLD_RETAILER_SITE_CODE")
    public Integer getOldRetailerSiteCode() {
        return oldRetailerSiteCode;
    }

    public void setOldRetailerSiteCode(Integer oldRetailerSiteCode) {
        this.oldRetailerSiteCode = oldRetailerSiteCode;
    }

    @Basic
    @Column(name = "OLD_SALES_STAFF_CODE")
    public Integer getOldSalesStaffCode() {
        return oldSalesStaffCode;
    }

    public void setOldSalesStaffCode(Integer oldSalesStaffCode) {
        this.oldSalesStaffCode = oldSalesStaffCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RetailerOrder that = (RetailerOrder) o;

        if (id != that.id) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (oldOrderNumber != null ? !oldOrderNumber.equals(that.oldOrderNumber) : that.oldOrderNumber != null)
            return false;
        if (oldRetailerSiteCode != null ? !oldRetailerSiteCode.equals(that.oldRetailerSiteCode) : that.oldRetailerSiteCode != null)
            return false;
        if (oldSalesStaffCode != null ? !oldSalesStaffCode.equals(that.oldSalesStaffCode) : that.oldSalesStaffCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (oldOrderNumber != null ? oldOrderNumber.hashCode() : 0);
        result = 31 * result + (oldRetailerSiteCode != null ? oldRetailerSiteCode.hashCode() : 0);
        result = 31 * result + (oldSalesStaffCode != null ? oldSalesStaffCode.hashCode() : 0);
        return result;
    }
}
