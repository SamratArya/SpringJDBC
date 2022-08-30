package P2_Annotations;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Ex1_JDBC_Config {
	
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springJdbc");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
	@Bean("Dao")
	public Ex1_EmployeeDaoImpl getDao()
	{
		Ex1_EmployeeDaoImpl dao = new Ex1_EmployeeDaoImpl();
		dao.setTemplate(getTemplate());
		return dao;
	}
}
