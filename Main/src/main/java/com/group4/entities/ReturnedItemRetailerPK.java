package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class ReturnedItemRetailerPK implements Serializable {
    private int returnedItemId;
    private int retailerOrderLineId;

    @Column(name = "Returned_item_ID")
    @Id
    public int getReturnedItemId() {
        return returnedItemId;
    }

    public void setReturnedItemId(int returnedItemId) {
        this.returnedItemId = returnedItemId;
    }

    @Column(name = "Retailer_order_line_ID")
    @Id
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

        ReturnedItemRetailerPK that = (ReturnedItemRetailerPK) o;

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
