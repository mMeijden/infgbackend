package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Returned_item_retailer", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(ReturnedItemRetailerPK.class)
public class ReturnedItemRetailer {
    private int returnedItemId;
    private int retailerOrderLineId;

    @Id
    @Column(name = "Returned_item_ID")
    public int getReturnedItemId() {
        return returnedItemId;
    }

    public void setReturnedItemId(int returnedItemId) {
        this.returnedItemId = returnedItemId;
    }

    @Id
    @Column(name = "Retailer_order_line_ID")
    public int getRetailerOrderLineId() {
        return retailerOrderLineId;
    }

    public void setRetailerOrderLineId(int retailerOrderLineId) {
        this.retailerOrderLineId = retailerOrderLineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReturnedItemRetailer that = (ReturnedItemRetailer) o;

        if (returnedItemId != that.returnedItemId) return false;
        if (retailerOrderLineId != that.retailerOrderLineId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = returnedItemId;
        result = 31 * result + retailerOrderLineId;
        return result;
    }
}
