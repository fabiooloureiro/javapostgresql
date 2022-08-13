// terceira

package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//atributos
	//informações padrão
	private static final String url = "jdbc:postgresql://localhost:5432/bd_aula03"; 
	private static final String user = "postgres";
	private static final String password = "coti";
	private static final String driver = "org.postgresql.Driver";
	
	//metodo para abrir e retornar uma conexão com o PostGreSQL
	//o nome do metodo (createConnection()) é eu que escolho 
	//informações padrão so muda os parametros (url, user, password)
	public static Connection createConnection() throws Exception {
		Class.forName(driver);		
		return DriverManager.getConnection(url, user, password);
	}
}
