package com.group4.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Product_forecast", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(ProductForecastPK.class)
public class ProductForecast {
    private int productId;
    private Date date;
    private Integer expectedVolume;

    @Id
    @Column(name = "Product_ID")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Expected_volume")
    public Integer getExpectedVolume() {
        return expectedVolume;
    }

    public void setExpectedVolume(Integer expectedVolume) {
        this.expectedVolume = expectedVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductForecast that = (ProductForecast) o;

        if (productId != that.productId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (expectedVolume != null ? !expectedVolume.equals(that.expectedVolume) : that.expectedVolume != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (expectedVolume != null ? expectedVolume.hashCode() : 0);
        return result;
    }
}
