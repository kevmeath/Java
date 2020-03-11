package com.oop.lab3;

public class Control {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Kevin", "Meath", 123456, 30000);
		
		System.out.println(employee1);
		System.out.println(employee1.calculatePay());
		
		HourlyEmployee employee2 = new HourlyEmployee("Kevin", "Meath", 654321, 40, 16);

		System.out.println(employee2);
		System.out.println(employee2.calculatePay());
		

		SalesEmployee employee3 = new SalesEmployee("Kevin", "Meath", 456789, 20000, 100);
		
		System.out.println(employee3);
		System.out.println(employee3.calculatePay());
		
		Employee employees[] = new Employee[] {employee1, employee2, employee3};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(employees[i].calculatePay());
		}
	}
}
