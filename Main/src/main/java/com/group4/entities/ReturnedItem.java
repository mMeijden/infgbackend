package com.group4.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Returned_item", schema = "dbo", catalog = "OutdoorParadise")
public class ReturnedItem {
    private int id;
    private Timestamp returnDate;
    private Integer returnQuantity;
    private Integer oldReturnId;
    private Integer oldOrderlineCode;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Return_date")
    public Timestamp getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Timestamp returnDate) {
        this.returnDate = returnDate;
    }

    @Basic
    @Column(name = "Return_quantity")
    public Integer getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(Integer returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    @Basic
    @Column(name = "Old_Return_ID")
    public Integer getOldReturnId() {
        return oldReturnId;
    }

    public void setOldReturnId(Integer oldReturnId) {
        this.oldReturnId = oldReturnId;
    }

    @Basic
    @Column(name = "Old_Orderline_code")
    public Integer getOldOrderlineCode() {
        return oldOrderlineCode;
    }

    public void setOldOrderlineCode(Integer oldOrderlineCode) {
        this.oldOrderlineCode = oldOrderlineCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReturnedItem that = (ReturnedItem) o;

        if (id != that.id) return false;
        if (returnDate != null ? !returnDate.equals(that.returnDate) : that.returnDate != null) return false;
        if (returnQuantity != null ? !returnQuantity.equals(that.returnQuantity) : that.returnQuantity != null)
            return false;
        if (oldReturnId != null ? !oldReturnId.equals(that.oldReturnId) : that.oldReturnId != null) return false;
        if (oldOrderlineCode != null ? !oldOrderlineCode.equals(that.oldOrderlineCode) : that.oldOrderlineCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (returnDate != null ? returnDate.hashCode() : 0);
        result = 31 * result + (returnQuantity != null ? returnQuantity.hashCode() : 0);
        result = 31 * result + (oldReturnId != null ? oldReturnId.hashCode() : 0);
        result = 31 * result + (oldOrderlineCode != null ? oldOrderlineCode.hashCode() : 0);
        return result;
    }
}
