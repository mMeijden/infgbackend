package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Retailer_site", schema = "dbo", catalog = "OutdoorParadise")
public class RetailerSite {
    private int id;
    private boolean activeIndicator;
    private int retailer;
    private int oldId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Active_indicator")
    public boolean isActiveIndicator() {
        return activeIndicator;
    }

    public void setActiveIndicator(boolean activeIndicator) {
        this.activeIndicator = activeIndicator;
    }

    @Basic
    @Column(name = "Retailer")
    public int getRetailer() {
        return retailer;
    }

    public void setRetailer(int retailer) {
        this.retailer = retailer;
    }

    @Basic
    @Column(name = "OLD_ID")
    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RetailerSite that = (RetailerSite) o;

        if (id != that.id) return false;
        if (activeIndicator != that.activeIndicator) return false;
        if (retailer != that.retailer) return false;
        if (oldId != that.oldId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (activeIndicator ? 1 : 0);
        result = 31 * result + retailer;
        result = 31 * result + oldId;
        return result;
    }
}
