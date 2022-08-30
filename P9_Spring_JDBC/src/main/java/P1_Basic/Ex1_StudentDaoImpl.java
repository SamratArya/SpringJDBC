package P1_Basic;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Ex1_StudentDaoImpl implements Ex1_StudentDao{

	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Ex1_Student student) {
		
		String sqlInsert = "insert into student values(?,?,?,?)";
		int res = this.template.update(sqlInsert , student.getStudentID() , student.getStudentName() , student.getAddress() , student.getDOB());
		return res;
	}

	public int update(Ex1_Student student) {
		
		String sqlUpdate = "update student set studentName = ? where studentID = ?";
		int res = this.template.update(sqlUpdate , student.getStudentName() , student.getStudentID());
		return res;
	}

	public int delete(Ex1_Student student) {
		
		String sqlDelete = "delete from student where studentID = ?";
		int res = this.template.update(sqlDelete , student.getStudentID());
		return res;
	}

	public Ex1_Student getSelect(int studentID) {
		
		RowMapper<Ex1_Student> rowMapper = new Ex1_RowMapperImpl();
		String sqlSelect = "select * from student where studentID = ?";
		Ex1_Student student = this.template.queryForObject(sqlSelect, rowMapper, studentID);
		return student;
	}

	public List<Ex1_Student> getAllSelect() {
		
		RowMapper<Ex1_Student> rowMapper = new Ex1_RowMapperImpl();
		String sqlSelect = "select * from student";
		List<Ex1_Student> students = this.template.query(sqlSelect, rowMapper);
		return students;
	}

	

}
