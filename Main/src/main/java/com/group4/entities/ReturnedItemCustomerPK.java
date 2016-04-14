package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class ReturnedItemCustomerPK implements Serializable {
    private int returnedItemId;
    private int customerOrderLineId;

    @Column(name = "Returned_item_ID")
    @Id
    public int getReturnedItemId() {
        return returnedItemId;
    }

    public void setReturnedItemId(int returnedItemId) {
        this.returnedItemId = returnedItemId;
    }

    @Column(name = "Customer_order_line_ID")
    @Id
    public int getCustomerOrderLineId() {
        return customerOrderLineId;
    }

    public void setCustomerOrderLineId(int customerOrderLineId) {
        this.customerOrderLineId = customerOrderLineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReturnedItemCustomerPK that = (ReturnedItemCustomerPK) o;

        if (returnedItemId != that.returnedItemId) return false;
        if (customerOrderLineId != that.customerOrderLineId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = returnedItemId;
        result = 31 * result + customerOrderLineId;
        return result;
    }
}
