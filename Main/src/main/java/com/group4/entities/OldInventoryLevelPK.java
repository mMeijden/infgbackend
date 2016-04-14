package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class OldInventoryLevelPK implements Serializable {
    private int year;
    private int month;
    private int productNumber;

    @Column(name = "YEAR")
    @Id
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Column(name = "MONTH")
    @Id
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Column(name = "PRODUCT_NUMBER")
    @Id
    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OldInventoryLevelPK that = (OldInventoryLevelPK) o;

        if (year != that.year) return false;
        if (month != that.month) return false;
        if (productNumber != that.productNumber) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + month;
        result = 31 * result + productNumber;
        return result;
    }
}
