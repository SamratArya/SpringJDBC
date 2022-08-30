package P1_Basic;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Ex1_RowMapperImpl implements RowMapper<Ex1_Student>{

	public Ex1_Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Ex1_Student e1 = new Ex1_Student();
		e1.setStudentID(rs.getInt(1));
		e1.setStudentName(rs.getString(2));
		e1.setAddress(rs.getString(3));
		e1.setDOB(rs.getString(4));
		return e1;
	}

}
