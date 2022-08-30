package P2_Annotations;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import P1_Basic.Ex1_StudentDaoImpl;

public class Ex1_EmployeeMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Ex1_JDBC_Config.class);
		Ex1_EmployeeDaoImpl daoImpl = (Ex1_EmployeeDaoImpl) context.getBean("Dao");
		
		Ex1_Employee employee = new Ex1_Employee();
		
		//For Insert
//		employee.setEmpID(4);
//		employee.setEmpName("Shaquib Ali");
//		employee.setAddress("Kasaiwada");
//		employee.setDesignation("Area Manager");
//		int res = daoImpl.insert(employee);
//		System.out.println("Value has been inserted "+res);

		
		//For Update
//		employee.setEmpName("Tannu Singh");
//		employee.setEmpID(3);
//		int res = daoImpl.update(employee);
//		System.out.println("Value has been updated "+res);
		
		
		//For delete
//		employee.setEmpID(4);
//		int res = daoImpl.delete(employee);
//		System.out.println("Value has been deleted "+res);
		
		
		//For getting single value
//		employee = daoImpl.getSelect(3);
//		System.out.println(employee);
		
		
		//For getting all the value
		List<Ex1_Employee> list = daoImpl.getAllSelect();
		for(Object ob1:list)
		{
			System.out.println(ob1);
		}
	}

}
