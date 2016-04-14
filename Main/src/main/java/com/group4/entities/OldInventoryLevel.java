package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Old_inventory_level", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(OldInventoryLevelPK.class)
public class OldInventoryLevel {
    private int year;
    private int month;
    private int productNumber;
    private Integer inventoryCount;
    private Integer oldProductNumber;

    @Id
    @Column(name = "YEAR")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Id
    @Column(name = "MONTH")
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Id
    @Column(name = "PRODUCT_NUMBER")
    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Basic
    @Column(name = "INVENTORY_COUNT")
    public Integer getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(Integer inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    @Basic
    @Column(name = "OLD_PRODUCT_NUMBER")
    public Integer getOldProductNumber() {
        return oldProductNumber;
    }

    public void setOldProductNumber(Integer oldProductNumber) {
        this.oldProductNumber = oldProductNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OldInventoryLevel that = (OldInventoryLevel) o;

        if (year != that.year) return false;
        if (month != that.month) return false;
        if (productNumber != that.productNumber) return false;
        if (inventoryCount != null ? !inventoryCount.equals(that.inventoryCount) : that.inventoryCount != null)
            return false;
        if (oldProductNumber != null ? !oldProductNumber.equals(that.oldProductNumber) : that.oldProductNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + month;
        result = 31 * result + productNumber;
        result = 31 * result + (inventoryCount != null ? inventoryCount.hashCode() : 0);
        result = 31 * result + (oldProductNumber != null ? oldProductNumber.hashCode() : 0);
        return result;
    }
}
