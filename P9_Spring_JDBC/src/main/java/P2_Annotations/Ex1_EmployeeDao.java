package P2_Annotations;

import java.util.List;

public interface Ex1_EmployeeDao {
	
	public int insert(Ex1_Employee employee);
	
	public int update(Ex1_Employee employee);
	
	public int delete(Ex1_Employee employee);
	
	public Ex1_Employee getSelect(int empID);
	
	public List<Ex1_Employee> getAllSelect();

}
