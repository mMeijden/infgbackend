package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class CustomerContactDetailPK implements Serializable {
    private int customerId;
    private int detailId;

    @Column(name = "Customer_ID")
    @Id
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Column(name = "Detail_ID")
    @Id
    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerContactDetailPK that = (CustomerContactDetailPK) o;

        if (customerId != that.customerId) return false;
        if (detailId != that.detailId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + detailId;
        return result;
    }
}
