/**
 * 
 */
/**
 * 
 */
module aula11 {
	// Necessário para usar a API de JDBC (DriverManager, Connection, etc.)
	requires java.sql;
	// (Opcional) Caso outros módulos precisem acessar as classes deste pacote
    exports br.com.aula11;
	requires java.desktop;
}