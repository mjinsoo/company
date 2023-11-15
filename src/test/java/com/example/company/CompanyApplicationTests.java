package com.example.company;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.company.model.Countries;
import com.example.company.model.Employees;
import com.example.company.repository.EmployeesRepository;

@SpringBootTest
class CompanyApplicationTests {
	@Autowired
	EmployeesRepository employeesRepository;

	@Autowired
	DepartmentsRepository departmentsRepository;

	@Test
	void 
	Departments departments

	@Test
	void 문제1번() {
		Optional<Employees> opt = 
				employeesRepository.findById(140);
		Employees employees = opt.get();

		int 사원번호 = employees.getEmployeeId();
		String 성 = employees.getLastName();
		String 이름 = employees.getFirstName();
		Countries c = 
				employees.getDepartments().getLocations().getCountries();
		String 나라명 = c.getCountryName();
		System.out.println(사원번호);
		System.out.println(성);
		System.out.println(이름);
		System.out.println(나라명);
	}

}
