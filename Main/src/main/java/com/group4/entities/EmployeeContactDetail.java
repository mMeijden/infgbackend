package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Employee_contact_detail", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(EmployeeContactDetailPK.class)
public class EmployeeContactDetail {
    private int employeeId;
    private int detailId;

    @Id
    @Column(name = "Employee_ID")
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Id
    @Column(name = "Detail_ID")
    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeContactDetail that = (EmployeeContactDetail) o;

        if (employeeId != that.employeeId) return false;
        if (detailId != that.detailId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + detailId;
        return result;
    }
}
