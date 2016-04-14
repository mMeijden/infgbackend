package com.group4.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Employee_course", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(EmployeeCoursePK.class)
public class EmployeeCourse {
    private int employeeId;
    private int courseId;
    private Date date;

    @Id
    @Column(name = "Employee_ID")
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Id
    @Column(name = "Course_ID")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeCourse that = (EmployeeCourse) o;

        if (employeeId != that.employeeId) return false;
        if (courseId != that.courseId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + courseId;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
