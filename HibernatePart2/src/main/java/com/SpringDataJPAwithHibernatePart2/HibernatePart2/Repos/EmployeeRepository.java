package com.SpringDataJPAwithHibernatePart2.HibernatePart2.Repos;

import com.SpringDataJPAwithHibernatePart2.HibernatePart2.Entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    @Query("select e.firstName,e.lastName from Employee e where e.salary > :avgsalary order by e.age ASC,e.salary DESC")
    List<Object[]> FindFirstLastName(@Param("avgsalary") int avgsalary);

    @Query("select avg(salary) from Employee")
    int findAverageSalary();

    @Modifying
    @Query("UPDATE Employee SET salary= :salary where salary < :avgsalary")
    void updateSalary(@Param("salary") int salary , @Param("avgsalary") int avgsalary);

    @Modifying
    @Query("delete from Employee where salary < :salary")
    void deleteBySalary(@Param("salary") int salary);

    @Query(value = "select empid,empfirstName,empage from employeetable where emplastname='singh'",nativeQuery = true)
    List<Object[]> nativefindByLastName();


    @Modifying
    @Query(value = "delete from employeetable where empage < :age",nativeQuery = true)
    void nativedeleteByAge(@Param("age") int age);

}
