package in.sts.mythirdproject.properties;

public class DatabaseConfiguration {
	private String databasename;
	private int portnumber;
	private String username;
	private String password;
	
	public String getDatabasename() {
		return databasename;
	}
	public void setDatabasename(String databasename) {
		this.databasename = databasename;
	}
	public int getPortnumber() {
		return portnumber;
	}
	public void setPortnumber(int portnumber) {
		this.portnumber = portnumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "DatabaseConfiguration [databasename=" + databasename + ", portnumber=" + portnumber + ", username="
				+ username + ", password=" + password + "]";
	}
	
}
