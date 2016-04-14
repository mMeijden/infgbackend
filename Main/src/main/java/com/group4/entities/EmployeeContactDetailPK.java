package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class EmployeeContactDetailPK implements Serializable {
    private int employeeId;
    private int detailId;

    @Column(name = "Employee_ID")
    @Id
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Column(name = "Detail_ID")
    @Id
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

        EmployeeContactDetailPK that = (EmployeeContactDetailPK) o;

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
