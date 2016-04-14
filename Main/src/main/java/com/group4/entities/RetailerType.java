package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Retailer_type", schema = "dbo", catalog = "OutdoorParadise")
public class RetailerType {
    private int id;
    private String typeNameEn;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Type_name_en")
    public String getTypeNameEn() {
        return typeNameEn;
    }

    public void setTypeNameEn(String typeNameEn) {
        this.typeNameEn = typeNameEn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RetailerType that = (RetailerType) o;

        if (id != that.id) return false;
        if (typeNameEn != null ? !typeNameEn.equals(that.typeNameEn) : that.typeNameEn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (typeNameEn != null ? typeNameEn.hashCode() : 0);
        return result;
    }
}
