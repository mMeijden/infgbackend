package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Customer_contact_detail", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(CustomerContactDetailPK.class)
public class CustomerContactDetail {
    private int customerId;
    private int detailId;

    @Id
    @Column(name = "Customer_ID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Id
    @Column(name = "Detail_ID")
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

        CustomerContactDetail that = (CustomerContactDetail) o;

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
