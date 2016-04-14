package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Returned_item_customer", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(ReturnedItemCustomerPK.class)
public class ReturnedItemCustomer {
    private int returnedItemId;
    private int customerOrderLineId;

    @Id
    @Column(name = "Returned_item_ID")
    public int getReturnedItemId() {
        return returnedItemId;
    }

    public void setReturnedItemId(int returnedItemId) {
        this.returnedItemId = returnedItemId;
    }

    @Id
    @Column(name = "Customer_order_line_ID")
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

        ReturnedItemCustomer that = (ReturnedItemCustomer) o;

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
