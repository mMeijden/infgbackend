package com.group4.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
public class Department {
    private int id;
    private String departmentName;
    private Integer deptartmentHead;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Department_name")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Basic
    @Column(name = "Deptartment_head")
    public Integer getDeptartmentHead() {
        return deptartmentHead;
    }

    public void setDeptartmentHead(Integer deptartmentHead) {
        this.deptartmentHead = deptartmentHead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (id != that.id) return false;
        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;
        if (deptartmentHead != null ? !deptartmentHead.equals(that.deptartmentHead) : that.deptartmentHead != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
        result = 31 * result + (deptartmentHead != null ? deptartmentHead.hashCode() : 0);
        return result;
    }
}
