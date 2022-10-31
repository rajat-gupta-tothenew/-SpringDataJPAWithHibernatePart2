package com.SpringDataJPAwithHibernatePart2.HibernatePart2;

import com.SpringDataJPAwithHibernatePart2.HibernatePart2.Entity.Employee;
import com.SpringDataJPAwithHibernatePart2.HibernatePart2.Repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.security.PublicKey;
import java.util.List;

@SpringBootTest
class HibernatePart2ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void TestInsertEmployee() {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		Employee emp5 = new Employee();

		emp1.setFirstName("Rajat");
		emp1.setLastName("gupta");
		emp1.setSalary(5000);
		emp1.setAge(22);

		emp2.setFirstName("Ram");
		emp2.setLastName("Singh");
		emp2.setSalary(45000);
		emp2.setAge(23);

		emp3.setFirstName("Pihu");
		emp3.setLastName("Kumari");
		emp3.setSalary(4000);
		emp3.setAge(24);

		emp4.setFirstName("Sristhi");
		emp4.setLastName("Singh");
		emp4.setSalary(45000);
		emp4.setAge(22);

		emp5.setFirstName("Chotu");
		emp5.setLastName("Kumar");
		emp5.setSalary(15000);
		emp5.setAge(50);

		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
		employeeRepository.save(emp3);
		employeeRepository.save(emp4);
		employeeRepository.save(emp5);
	}

	@Test
	public void FindFirstLastName(){
		int avgsal=employeeRepository.findAverageSalary();
		List<Object[]> res=employeeRepository.FindFirstLastName(avgsal);
		for(Object[] objects: res){
			System.out.print(objects[0] );
			System.out.println(" "+objects[1]);
		}
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testUpdateSalary(){
		int salary=20000;
		int avgsal=employeeRepository.findAverageSalary();
		employeeRepository.updateSalary(salary,avgsal);
	}

	@Test
	@Rollback(value = false)
	@Transactional
	public void testDeletebysalary(){
		employeeRepository.deleteBySalary(21000);
	}

	@Test
	public void testnativefindByLastName(){
		List<Object[]> res=employeeRepository.nativefindByLastName();
		for(Object[] objects: res){
			System.out.print(objects[0]+" ");
			System.out.print(objects[1]+" ");
			System.out.println(objects[2]+" ");
		}
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testnativefindByAge(){
		employeeRepository.nativedeleteByAge(23);
	}
}
