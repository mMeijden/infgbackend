package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Order_method", schema = "dbo", catalog = "OutdoorParadise")
public class OrderMethod {
    private int id;
    private String orderMethodEn;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Order_method_en")
    public String getOrderMethodEn() {
        return orderMethodEn;
    }

    public void setOrderMethodEn(String orderMethodEn) {
        this.orderMethodEn = orderMethodEn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderMethod that = (OrderMethod) o;

        if (id != that.id) return false;
        if (orderMethodEn != null ? !orderMethodEn.equals(that.orderMethodEn) : that.orderMethodEn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderMethodEn != null ? orderMethodEn.hashCode() : 0);
        return result;
    }
}
