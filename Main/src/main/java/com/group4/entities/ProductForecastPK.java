package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class ProductForecastPK implements Serializable {
    private int productId;
    private Date date;

    @Column(name = "Product_ID")
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(name = "Date")
    @Id
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductForecastPK that = (ProductForecastPK) o;

        if (productId != that.productId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
