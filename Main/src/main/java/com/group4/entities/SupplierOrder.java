package com.group4.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Supplier_order", schema = "dbo", catalog = "OutdoorParadise")
public class SupplierOrder {
    private int id;
    private Timestamp orderDate;
    private Timestamp requiredDate;
    private Timestamp shippedDate;
    private Integer oldWarehouseId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Order_date")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "Required_date")
    public Timestamp getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Timestamp requiredDate) {
        this.requiredDate = requiredDate;
    }

    @Basic
    @Column(name = "Shipped_date")
    public Timestamp getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Timestamp shippedDate) {
        this.shippedDate = shippedDate;
    }

    @Basic
    @Column(name = "Old_warehouse_ID")
    public Integer getOldWarehouseId() {
        return oldWarehouseId;
    }

    public void setOldWarehouseId(Integer oldWarehouseId) {
        this.oldWarehouseId = oldWarehouseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplierOrder that = (SupplierOrder) o;

        if (id != that.id) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (requiredDate != null ? !requiredDate.equals(that.requiredDate) : that.requiredDate != null) return false;
        if (shippedDate != null ? !shippedDate.equals(that.shippedDate) : that.shippedDate != null) return false;
        if (oldWarehouseId != null ? !oldWarehouseId.equals(that.oldWarehouseId) : that.oldWarehouseId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (requiredDate != null ? requiredDate.hashCode() : 0);
        result = 31 * result + (shippedDate != null ? shippedDate.hashCode() : 0);
        result = 31 * result + (oldWarehouseId != null ? oldWarehouseId.hashCode() : 0);
        return result;
    }
}
