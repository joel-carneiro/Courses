package ifce;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RegisterStudent {
	public static void main(String[] args) throws IOException, SQLException {
		
		// Entrada de dados do usuário
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("NOME COMPLETO: ");
		final String studentName = input.nextLine().toUpperCase();
		
		System.out.print("CODE: ");
		final String studentCode = input.nextLine();
		
		System.out.print("CURSO: ");
		final String studentCourse = input.nextLine().toUpperCase();
		
		input.close();
		
		// Iniciando a conexão com o banco de dados
		
		Connection connection = ConnectionFactory.getConnection();
		
		// Preparando a declaração SQL
		
		final String stringSQL = "INSERT INTO student (name, code, course) VALUES (?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(stringSQL);
		preparedStatement.setString(1, studentName);
		preparedStatement.setString(2, studentCode);
		preparedStatement.setString(3, studentCourse);
		
		preparedStatement.execute();
		
		// Encerrando o programa
		
		System.out.printf("O ESTUDANTE %s FOI ADICIONADO AO BANCO DE DADOS COM SUCESSO.\n", studentName);
		
		// Visualizando o banco de dados
		
		System.out.println("ESTUDANTES PRESENTES NO BANCO DE DADOS:");
		
		final String querySQL = "SELECT * FROM student";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(querySQL);
		
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			String code = resultSet.getString("code");
			String course = resultSet.getString("course");
			
			System.out.println(new Student(name, code, course));
		}
		
		connection.close();
		
	}
}