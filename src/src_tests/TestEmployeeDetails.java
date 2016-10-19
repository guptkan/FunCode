package src_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hello.EmpBusinessLogic;
import com.hello.EmployeeDetails;

public class TestEmployeeDetails {

	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();

	// test to check appraisal
	@Test
	public void testCalculateAppriasal() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);

		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}

	// test to check yearly salary
	@Test
	public void testCalculateYearlySalary() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);

		double salary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);

	}

	@Test
	public void testAge() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(10001);

		int age = empBusinessLogic.getEmployeeAge(employee);
		assertEquals(25, age, 0.0);

	}
}
