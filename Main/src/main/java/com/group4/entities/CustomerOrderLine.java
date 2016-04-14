package com.group4.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Customer_order_line", schema = "dbo", catalog = "OutdoorParadise")
public class CustomerOrderLine {
    private int id;
    private Integer salesPrice;
    private Integer quantity;
    private Timestamp shippingdate;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Sales_price")
    public Integer getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Basic
    @Column(name = "Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "Shippingdate")
    public Timestamp getShippingdate() {
        return shippingdate;
    }

    public void setShippingdate(Timestamp shippingdate) {
        this.shippingdate = shippingdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerOrderLine that = (CustomerOrderLine) o;

        if (id != that.id) return false;
        if (salesPrice != null ? !salesPrice.equals(that.salesPrice) : that.salesPrice != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (shippingdate != null ? !shippingdate.equals(that.shippingdate) : that.shippingdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (salesPrice != null ? salesPrice.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (shippingdate != null ? shippingdate.hashCode() : 0);
        return result;
    }
}
