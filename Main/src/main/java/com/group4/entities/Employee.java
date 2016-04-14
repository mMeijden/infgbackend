package com.group4.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
public class Employee {
    private int id;
    private String fname;
    private String lname;
    private BigDecimal salary;
    private Integer job;
    private String email;
    private Timestamp dateHired;
    private Integer salesBranch;


    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Fname")
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "Lname")
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Basic
    @Column(name = "Salary")
    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "Job")
    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Date_hired")
    public Timestamp getDateHired() {
        return dateHired;
    }

    public void setDateHired(Timestamp dateHired) {
        this.dateHired = dateHired;
    }

    @Basic
    @Column(name = "Sales_branch")
    public Integer getSalesBranch() {
        return salesBranch;
    }

    public void setSalesBranch(Integer salesBranch) {
        this.salesBranch = salesBranch;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (fname != null ? !fname.equals(employee.fname) : employee.fname != null) return false;
        if (lname != null ? !lname.equals(employee.lname) : employee.lname != null) return false;
        if (salary != null ? !salary.equals(employee.salary) : employee.salary != null) return false;
        if (job != null ? !job.equals(employee.job) : employee.job != null) return false;
        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
        if (dateHired != null ? !dateHired.equals(employee.dateHired) : employee.dateHired != null) return false;
        if (salesBranch != null ? !salesBranch.equals(employee.salesBranch) : employee.salesBranch != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (lname != null ? lname.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (dateHired != null ? dateHired.hashCode() : 0);
        result = 31 * result + (salesBranch != null ? salesBranch.hashCode() : 0);
        return result;
    }
}
