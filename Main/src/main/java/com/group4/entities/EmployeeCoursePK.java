package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class EmployeeCoursePK implements Serializable {
    private int employeeId;
    private int courseId;

    @Column(name = "Employee_ID")
    @Id
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Column(name = "Course_ID")
    @Id
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeCoursePK that = (EmployeeCoursePK) o;

        if (employeeId != that.employeeId) return false;
        if (courseId != that.courseId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + courseId;
        return result;
    }
}
