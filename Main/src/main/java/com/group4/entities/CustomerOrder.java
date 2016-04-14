package com.group4.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Getter
@Setter
@Table(name = "Customer_order", schema = "dbo", catalog = "OutdoorParadise")
public class CustomerOrder implements Serializable {
    private int id;
    private Timestamp orderDate;

    private OrderMethod orderMethod;

    private Booking booking;

    private Orderstatus orderStatus;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Orderstatus getOrderStatus(){
        return orderStatus;
    }


    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public OrderMethod getOrderMethod(){
        return orderMethod;
    }

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Booking getBooking(){
            return booking;
    }

    @Basic
    @Column(name = "Order_date")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerOrder that = (CustomerOrder) o;

        if (id != that.id) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        return result;
    }
}
