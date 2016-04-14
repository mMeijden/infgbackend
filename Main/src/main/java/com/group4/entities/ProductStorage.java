package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Product_storage", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(ProductStoragePK.class)
public class ProductStorage {
    private int productId;
    private int storageId;
    private Integer amount;
    private String location;

    @Id
    @Column(name = "Product_ID")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "Storage_ID")
    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    @Basic
    @Column(name = "Amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "Location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductStorage that = (ProductStorage) o;

        if (productId != that.productId) return false;
        if (storageId != that.storageId) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + storageId;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
