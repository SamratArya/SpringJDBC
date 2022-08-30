package P2_Annotations;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Ex1_RowMapperImpl implements RowMapper<Ex1_Employee>{

	public Ex1_Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Ex1_Employee e1 = new Ex1_Employee();
		e1.setEmpID(rs.getInt(1));
		e1.setEmpName(rs.getString(2));
		e1.setAddress(rs.getString(3));
		e1.setDesignation(rs.getString(4));
		return e1;
	}

}
