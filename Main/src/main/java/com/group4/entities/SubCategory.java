package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Sub_category", schema = "dbo", catalog = "OutdoorParadise")
public class SubCategory {
    private int id;
    private String subCategoryEn;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Sub_category_en")
    public String getSubCategoryEn() {
        return subCategoryEn;
    }

    public void setSubCategoryEn(String subCategoryEn) {
        this.subCategoryEn = subCategoryEn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubCategory that = (SubCategory) o;

        if (id != that.id) return false;
        if (subCategoryEn != null ? !subCategoryEn.equals(that.subCategoryEn) : that.subCategoryEn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (subCategoryEn != null ? subCategoryEn.hashCode() : 0);
        return result;
    }
}
