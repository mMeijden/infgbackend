package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Supplier_contact_detail", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(SupplierContactDetailPK.class)
public class SupplierContactDetail {
    private int supplierId;
    private int contactDetailId;

    @Id
    @Column(name = "Supplier_ID")
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Id
    @Column(name = "Contact_detail_ID")
    public int getContactDetailId() {
        return contactDetailId;
    }

    public void setContactDetailId(int contactDetailId) {
        this.contactDetailId = contactDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplierContactDetail that = (SupplierContactDetail) o;

        if (supplierId != that.supplierId) return false;
        if (contactDetailId != that.contactDetailId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = supplierId;
        result = 31 * result + contactDetailId;
        return result;
    }
}
