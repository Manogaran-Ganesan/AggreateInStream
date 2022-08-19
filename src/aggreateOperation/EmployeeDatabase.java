package aggreateOperation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {

	public static List<EmployeeBean> getEmployee() {

		List<EmployeeBean> emp = new ArrayList<EmployeeBean>();

		emp.add(new EmployeeBean(1, "Rajini", 1000, "SC", new int[] { 1, 2, 3 }));
		emp.add(new EmployeeBean(2, "Mano", 2000, "IT", new int[] { 1, 2, 3 }));
		emp.add(new EmployeeBean(3, "Murali", 3000, "EN", new int[] { 1, 2, 3 }));
		emp.add(new EmployeeBean(4, "Ramya", 4000, "IT", new int[] { 1, 2, 3 }));
		emp.add(new EmployeeBean(5, "Raghu", 5000, "SC", new int[] { 1, 2, 3 }));
		emp.add(new EmployeeBean(6, "Seenu", 6000, "IT", new int[] { 1, 2, 3 }));

		return emp;
	}

}
