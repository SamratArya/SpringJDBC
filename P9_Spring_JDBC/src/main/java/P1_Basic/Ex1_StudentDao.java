package P1_Basic;

import java.util.List;

public interface Ex1_StudentDao {
	
	public int insert(Ex1_Student student);
	
	public int update(Ex1_Student student);
	
	public int delete(Ex1_Student student);
	
	public Ex1_Student getSelect(int studentID);
	
	public List<Ex1_Student> getAllSelect();
}
