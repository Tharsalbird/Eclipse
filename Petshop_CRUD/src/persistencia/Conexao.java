package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Conexao con;

	private Connection connection;

	private Conexao() {
		initDriver();
		initConnection();
	}

	private void initDriver() {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("JDBC driver carregado.");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}

	private void initConnection() {
		try {
			this.connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5433/JavaWeb", "postgres", "");
		} catch (SQLException e) {
			System.out.println("\n\nErro ao realizar a conexão!\n :(");
			e.printStackTrace();
		}
	}

	public static Conexao getConexao() {
		if (con == null) {
			con = new Conexao();
		}
		return con;
	}

	public Connection getConnection() {
		return connection;
	}

}
