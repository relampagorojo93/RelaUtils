package relampagorojo93.LibsCollection.Utils.Shared.SQL.Objects.ConnectionData;

import relampagorojo93.LibsCollection.Utils.Shared.SQL.Abstracts.ConnectionData;
import relampagorojo93.LibsCollection.Utils.Shared.SQL.Enums.SQLType;

public class MySQLConnectionData extends ConnectionData {
	private String protocol, host, database, username, password;
	private String[] params;
	private int port;
	public MySQLConnectionData(String protocol, String host, int port, String database, String username, String password, String[] params) {
		super(SQLType.MYSQL);
		this.protocol = protocol;
		this.host = host;
		this.port = port;
		this.database = database;
		this.username = username;
		this.password = password;
		this.params = params;
	}
	public String getProtocol() { return protocol; }
	public String getHost() { return host; }
	public int getPort() { return port; }
	public String getDatabase() { return database; }
	public String getUsername() { return username; }
	public String getPassword() { return password; }
	public String[] getParameters() { return params; }
}
