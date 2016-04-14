package com.group4.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Retailer_order_line", schema = "dbo", catalog = "OutdoorParadise")
public class RetailerOrderLine {
    private int id;
    private Integer quantity;
    private BigDecimal unitCost;
    private BigDecimal unitPrice;
    private BigDecimal unitSalePrice;
    private Integer oldOrderDetailCode;
    private Integer oldOrderNumber;
    private Integer oldProductNumber;
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
    @Column(name = "Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "Unit_cost")
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    @Basic
    @Column(name = "Unit_price")
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "Unit_sale_price")
    public BigDecimal getUnitSalePrice() {
        return unitSalePrice;
    }

    public void setUnitSalePrice(BigDecimal unitSalePrice) {
        this.unitSalePrice = unitSalePrice;
    }

    @Basic
    @Column(name = "OLD_ORDER_DETAIL_CODE")
    public Integer getOldOrderDetailCode() {
        return oldOrderDetailCode;
    }

    public void setOldOrderDetailCode(Integer oldOrderDetailCode) {
        this.oldOrderDetailCode = oldOrderDetailCode;
    }

    @Basic
    @Column(name = "OLD_ORDER_NUMBER")
    public Integer getOldOrderNumber() {
        return oldOrderNumber;
    }

    public void setOldOrderNumber(Integer oldOrderNumber) {
        this.oldOrderNumber = oldOrderNumber;
    }

    @Basic
    @Column(name = "OLD_PRODUCT_NUMBER")
    public Integer getOldProductNumber() {
        return oldProductNumber;
    }

    public void setOldProductNumber(Integer oldProductNumber) {
        this.oldProductNumber = oldProductNumber;
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

        RetailerOrderLine that = (RetailerOrderLine) o;

        if (id != that.id) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (unitCost != null ? !unitCost.equals(that.unitCost) : that.unitCost != null) return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;
        if (unitSalePrice != null ? !unitSalePrice.equals(that.unitSalePrice) : that.unitSalePrice != null)
            return false;
        if (oldOrderDetailCode != null ? !oldOrderDetailCode.equals(that.oldOrderDetailCode) : that.oldOrderDetailCode != null)
            return false;
        if (oldOrderNumber != null ? !oldOrderNumber.equals(that.oldOrderNumber) : that.oldOrderNumber != null)
            return false;
        if (oldProductNumber != null ? !oldProductNumber.equals(that.oldProductNumber) : that.oldProductNumber != null)
            return false;
        if (shippingdate != null ? !shippingdate.equals(that.shippingdate) : that.shippingdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (unitCost != null ? unitCost.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (unitSalePrice != null ? unitSalePrice.hashCode() : 0);
        result = 31 * result + (oldOrderDetailCode != null ? oldOrderDetailCode.hashCode() : 0);
        result = 31 * result + (oldOrderNumber != null ? oldOrderNumber.hashCode() : 0);
        result = 31 * result + (oldProductNumber != null ? oldProductNumber.hashCode() : 0);
        result = 31 * result + (shippingdate != null ? shippingdate.hashCode() : 0);
        return result;
    }
}
