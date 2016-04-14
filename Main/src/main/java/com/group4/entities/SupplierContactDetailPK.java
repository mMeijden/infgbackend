package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class SupplierContactDetailPK implements Serializable {
    private int supplierId;
    private int contactDetailId;

    @Column(name = "Supplier_ID")
    @Id
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Column(name = "Contact_detail_ID")
    @Id
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

        SupplierContactDetailPK that = (SupplierContactDetailPK) o;

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
