package P2_Annotations;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import P1_Basic.Ex1_RowMapperImpl;
import P1_Basic.Ex1_Student;

public class Ex1_EmployeeDaoImpl implements Ex1_EmployeeDao{
	
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insert(Ex1_Employee employee) {
		
		String sqlInsert = "insert into employee values(?,?,?,?)";
		int res = this.template.update(sqlInsert , employee.getEmpID() , employee.getEmpName() , employee.getAddress() , employee.getDesignation());
		return res;
	}

	public int update(Ex1_Employee employee) {
		
		String sqlUpdate = "update employee set empName = ? where empID = ?";
		int res = this.template.update(sqlUpdate , employee.getEmpName() , employee.getEmpID());
		return res;
	}

	public int delete(Ex1_Employee employee) {
		
		String sqlDelete = "delete from employee where empID = ?";
		int res = this.template.update(sqlDelete , employee.getEmpID());
		return res;
	}

	public Ex1_Employee getSelect(int empID) {
		
		RowMapper<Ex1_Employee> rowMapper = new P2_Annotations.Ex1_RowMapperImpl();
		String sqlSelect = "select * from employee where empID = ?";
		Ex1_Employee employee = this.template.queryForObject(sqlSelect, rowMapper, empID);
		return employee;
	}

	public List<Ex1_Employee> getAllSelect() {
		
		RowMapper<Ex1_Employee> rowMapper = new P2_Annotations.Ex1_RowMapperImpl();
		String sqlSelect = "select * from employee";
		List<Ex1_Employee> employee = this.template.query(sqlSelect, rowMapper);
		return employee;
	}
	

}
