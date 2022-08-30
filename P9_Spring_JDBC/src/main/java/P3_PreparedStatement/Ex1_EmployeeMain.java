package P3_PreparedStatement;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1_EmployeeMain {
	
	public void insertion(Ex1_EmployeeDaoImpl daoImp , Ex1_Employee e1)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the employee id");
		int id = in.nextInt();
		
		System.out.println("Enter the employee name");
		String name = in.next();
		
		System.out.println("Enter the address");
		String address = in.next();
		
		System.out.println("Enter the designation");
		String desig = in.next();
		
		e1.setEmpID(id);
		e1.setEmpName(name);
		e1.setAddress(address);
		e1.setDesignation(desig);
		boolean res = daoImp.insertByPreparedStatement(e1);
		System.out.println("Value has been inserted ");
	}
	
	public void updation(Ex1_EmployeeDaoImpl daoImp , Ex1_Employee e1)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the new employee name");
		String name = in.next();
		
		System.out.println("Enter the employee id");
		int id = in.nextInt();
		
		e1.setEmpName(name);
		e1.setEmpID(id);
	
		boolean res = daoImp.updateByPreparedStatement(e1);
		System.out.println("Value has been updated ");
	}
	
	
	public void selectAll(Ex1_EmployeeDaoImpl daoImpl , Ex1_Employee employee)
	{
		List<Ex1_Employee> list = daoImpl.getAllEmployee();
		for(Ex1_Employee employee1 : list)
		{
			System.out.println(employee1);
		}
	}
	
	public void deletion(Ex1_EmployeeDaoImpl daoImp , Ex1_Employee e1)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the employee id");
		int id = in.nextInt();
		
		e1.setEmpID(id);
	
		boolean res = daoImp.deletebyPreparedStatement(e1);
		System.out.println("Value has been deleted ");
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P3_PreparedStatement/appsComfigs.xml");
		Ex1_EmployeeDaoImpl daoImp = (Ex1_EmployeeDaoImpl) context.getBean("Dao");
		
		Ex1_Employee e1 = new Ex1_Employee();
		Ex1_EmployeeMain eMain = new Ex1_EmployeeMain();
		
		System.out.println("Enter the value ");
		String value = in.next();
		
		if(value.equalsIgnoreCase("insert"))
		{
			eMain.insertion(daoImp, e1);
		}
		else if(value.equalsIgnoreCase("update"))
		{
			eMain.updation(daoImp, e1);
		}
		else if(value.equalsIgnoreCase("select"))
		{
			eMain.selectAll(daoImp, e1);
		}
		else if(value.equalsIgnoreCase("delete"))
		{
			eMain.deletion(daoImp, e1);
		}
		
		
		
	}

}
