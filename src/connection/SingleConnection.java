package connection;

/*
 *Classe respons�vel pela conex�o com o banco de dados
 * */

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

	
	private static String banco = "jdbc:postgresql://localhost:5432/vitadata?autoReconnect=true"; // nome e endere�o do banco de dados

	private static String user = "postgres"; 	// usu�rio do banco de dados
	
	private static String password = "admin"; // senha do banco de dados
	
	private static Connection connection = null; // usu�rio do banco de dados
	
	static {
		conectar(); // Toda vez que for instanciada a classe ir� chamar a conex�o automaticamente por esse m�todo
	}
	
	public SingleConnection() {
		conectar();
	}
	
	private static void conectar() {
		try {
			
			if (connection == null) {
				Class.forName("org.postgresql.Driver");//traz driver postgress
				connection = DriverManager.getConnection(banco,user,password);
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro na conex�o com o banco");
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
}
