package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class DiscountPK implements Serializable {
    private int productId;
    private int promotionId;

    @Column(name = "Product_ID")
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(name = "Promotion_ID")
    @Id
    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiscountPK that = (DiscountPK) o;

        if (productId != that.productId) return false;
        if (promotionId != that.promotionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + promotionId;
        return result;
    }
}
