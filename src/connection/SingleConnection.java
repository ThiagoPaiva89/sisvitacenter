package connection;

/*
 *Classe responsável pela conexão com o banco de dados
 * */

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

	
	private static String banco = "jdbc:postgresql://localhost:5432/vitadata?autoReconnect=true"; // nome e endereço do banco de dados

	private static String user = "postgres"; 	// usuário do banco de dados
	
	private static String password = "admin"; // senha do banco de dados
	
	private static Connection connection = null; // usuário do banco de dados
	
	static {
		conectar(); // Toda vez que for instanciada a classe irá chamar a conexão automaticamente por esse método
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
			throw new RuntimeException("Erro na conexão com o banco");
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
}
