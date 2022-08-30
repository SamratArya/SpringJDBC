package P3_PreparedStatement;

import java.util.List;

public interface Ex1_EmployeeDao {
	
	public boolean insertByPreparedStatement(Ex1_Employee employee);
	
	public boolean updateByPreparedStatement(Ex1_Employee employee);
	
//	public int updateByPreparedStatement(Ex1_Employee employee);
	
	public List<Ex1_Employee> getAllEmployee();
	
	public boolean deletebyPreparedStatement(Ex1_Employee employee);

}
