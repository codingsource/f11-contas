package br.com.caelum.teste.main;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TesteProperties {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		 Properties config = new Properties();
		 
		 config.setProperty("database.login", "scott");
		 config.setProperty("database.password", "tiger");
		 config.setProperty("database.url", "jdbc:mysql:/localhost/teste");
		 
		 String login = config.getProperty("database.login");
		 String password = config.getProperty("database.password");
		 String url = config.getProperty("database.url");
		 DriverManager.getConnection(url, login, password);
	}

}
