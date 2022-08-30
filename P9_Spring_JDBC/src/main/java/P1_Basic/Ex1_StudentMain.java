package P1_Basic;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1_StudentMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/P1_Basic/appConfig.xml");
		Ex1_StudentDaoImpl daoImpl = (Ex1_StudentDaoImpl) context.getBean("Dao");
		
		Ex1_Student e1 = new Ex1_Student();
		
		//For Insert
//		e1.setStudentID(4);
//		e1.setStudentName("Shivam Bhadoria");
//		e1.setAddress("Bhopal");
//		e1.setDOB("09/01/97");
//		int res = daoImpl.insert(e1);
//		System.out.println("Value has been added "+res);
		
		//For Update
//		e1.setStudentName("Rahul Triwedi");
//		e1.setStudentID(3);
//		int res = daoImpl.update(e1);
//		System.out.println("Value has been updated "+res);
		
		//For Delete
//		e1.setStudentID(4);
//		int res = daoImpl.delete(e1);
//		System.out.println("Value has been deleted "+res);
		
		//For getting single value
//		e1 = daoImpl.getSelect(2);
//		System.out.println(e1);
		
		//For all the value
//		List<Ex1_Student> list = daoImpl.getAllSelect();
//		for(Object ob1:list)
//		{
//			System.out.println(ob1);
//		}
	
	}

}
