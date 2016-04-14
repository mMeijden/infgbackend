package com.group4.entities;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@IdClass(DiscountPK.class)
public class Discount {
    private int productId;
    private int promotionId;
    private BigDecimal discount;

    @Id
    @Column(name = "Product_ID")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "Promotion_ID")
    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
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

        Discount discount1 = (Discount) o;

        if (productId != discount1.productId) return false;
        if (promotionId != discount1.promotionId) return false;
        if (discount != null ? !discount.equals(discount1.discount) : discount1.discount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + promotionId;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }
}
