package P3_PreparedStatement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

public class Ex1_EmployeeDaoImpl implements Ex1_EmployeeDao{
	
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public boolean insertByPreparedStatement(final Ex1_Employee employee) {
		
		String sqlInsert = "insert into employee values (?,?,?,?)";
		
		return template.execute(sqlInsert , new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setInt(1, employee.getEmpID());
				ps.setString(2, employee.getEmpName());
				ps.setString(3, employee.getAddress());
				ps.setString(4, employee.getDesignation());
				return ps.execute();
			}
			
		});
	}

	public boolean updateByPreparedStatement(final Ex1_Employee employee) {
		
		String sqlUpdate = "update employee set empName = ? where empID = ?";
		return template.execute(sqlUpdate, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setString(1, employee.getEmpName());
				ps.setInt(2, employee.getEmpID());
				return ps.execute();
			}	
			
		});
	}
	
	
//	public int updateByPreparedStatement(final Ex1_Employee employee) {
//		
//		String sqlUpdate = "update employee set empName = ? where empID = ?";
//		return template.update(sqlUpdate, new PreparedStatementCallback<Boolean>() {
//
//			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//				
//				ps.setString(1, employee.getEmpName());
//				ps.setInt(2, employee.getEmpID());
//				return ps.execute();
//			}	
//			
//		});
//	}


	//ResultSetExtractor for fetching the records
	
	public List<Ex1_Employee> getAllEmployee() {
		
		String sqlSelect = "select * from employee ";
		return template.query(sqlSelect, new ResultSetExtractor<List<Ex1_Employee>>()
		{

			public List<Ex1_Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<Ex1_Employee> elist  = new ArrayList<Ex1_Employee>();
				
				while(rs.next())
				{
					Ex1_Employee e1 = new Ex1_Employee();
					e1.setEmpID(rs.getInt(1));
					e1.setEmpName(rs.getString(2));
					e1.setAddress(rs.getString(3));
					e1.setDesignation(rs.getString(4));
					elist.add(e1);
				}
				return elist;
			}
	
		});
	}

	public boolean deletebyPreparedStatement(final Ex1_Employee employee) {

		String sqlDelete = "delete from employee where empID = ?";
		return template.execute(sqlDelete, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setInt(1, employee.getEmpID());
				return ps.execute();
			}
		});
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
