package aggreateOperation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStream {

	public static void main(String[] args) {

		List<EmployeeBean> employees = EmployeeDatabase.getEmployee();
		
		//Group by department and list of all employees
		Map<String,List<EmployeeBean>> groupByDep=employees.stream()
		.collect(Collectors.groupingBy(emp->emp.getEmpDep()));
		
		System.out.println(groupByDep);

		
		//Group by department and list of employee names
		
		Map<String,List<String>> groupByDepOnlyName=employees.stream()
		.collect(
				Collectors.groupingBy(emp->emp.getEmpDep(),
				Collectors.mapping(ep->ep.getEmpName(),
				Collectors.toList()))
				);
		
		System.out.println(groupByDepOnlyName);
		
		//Group by department and salary
		
		Map<String,Integer>groupBySalaryAndDep=employees.stream()
				//.filter(emp->emp.getEmpDep().equals("IT"))
				.collect(
						
						Collectors.groupingBy(EmployeeBean::getEmpDep,
						Collectors.summingInt(EmployeeBean::getEmpSalary))
						);
				
				
		System.out.println(groupBySalaryAndDep);

	}

}
