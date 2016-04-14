package com.group4.repository;

import com.group4.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findById(final int id);
}
