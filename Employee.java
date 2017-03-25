public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		m.managerSalary();
		Trainee t = new Trainee();
		t.traineeSalary();
	}

}

// Hierarchical Inheritance
// parent class calculates salary according to job profile

class SalaryCalculation {
	int ta, da, hra, basic_salary, total_salary;

	// return type and paramaterised method
	int salary(int ta, int da, int hra, int basic_salary) {
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.basic_salary = basic_salary;
		total_salary = basic_salary + ta + da + hra;
		return total_salary;
	}
}

// child class 1 which extends parent class
class Manager extends SalaryCalculation {

	// constructor
	Manager() {
		basic_salary = 34600;
	}

	// salary calculations
	void managerSalary() {
		ta = (basic_salary * 15) / 100;
		da = (basic_salary * 114) / 100;
		hra = (basic_salary * 20) / 100;
		super.salary(ta, da, hra, basic_salary);
		System.out.println("Manager's total Salary is " + total_salary);
	}
}

// child class 2 which extends parent class
class Trainee extends SalaryCalculation {

	// constructor
	Trainee() {
		basic_salary = 15600;
	}

	// salary calculations
	void traineeSalary() {
		ta = (basic_salary * 10) / 100;
		da = (basic_salary * 90) / 100;
		hra = (basic_salary * 10) / 100;
		super.salary(ta, da, hra, basic_salary);
		System.out.println("Trainee's total Salary is " + total_salary);
	}
}