package aggreateOperation;

import java.util.Arrays;

public class EmployeeBean {

	private int empId;
	private String empName;
	private int empSalary;
	private String empDep;
	private int[] empPh;

	public EmployeeBean(int empId, String empName, int empSalary, String empDep, int[] empPh) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDep = empDep;
		this.empPh = empPh;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDep() {
		return empDep;
	}

	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}

	public int[] getEmpPh() {
		return empPh;
	}

	public void setEmpPh(int[] empPh) {
		this.empPh = empPh;
	}

	@Override
	public String toString() {
		return "[empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDep="
				+ empDep + ", empPh=" + Arrays.toString(empPh) + "]";
	}



}
