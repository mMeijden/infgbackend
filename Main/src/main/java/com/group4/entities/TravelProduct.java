package com.group4.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Travel_product", schema = "dbo", catalog = "OutdoorParadise")
//@IdClass(TravelProductPK.class)
public class TravelProduct implements Serializable{
    private int travelId;
    private int productId;
    private BigDecimal discount;

    @Id
    @Column(name = "Travel_ID")
    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
    }

    @Id
    @Column(name = "Product_ID")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "Discount")
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelProduct that = (TravelProduct) o;

        if (travelId != that.travelId) return false;
        if (productId != that.productId) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = travelId;
        result = 31 * result + productId;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }
}
