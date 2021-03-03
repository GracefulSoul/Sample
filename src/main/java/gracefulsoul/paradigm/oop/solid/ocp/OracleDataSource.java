package gracefulsoul.paradigm.oop.solid.ocp;

public class OracleDataSource extends DataSource {

	private String jdbcUrl;

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

}
