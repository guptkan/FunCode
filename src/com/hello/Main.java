package com.hello;

public class Main extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello");
		(new Thread(new Main())).start();
	}
	
	public void run() {
        System.out.println("Hello from a thread!");
		EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
		EmployeeDetails employee = new EmployeeDetails();
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		System.out.print(appraisal);
    }

}
