package trypackage;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.entity.Teacher;

public class RegisterTeacher {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("NOME COMPLETO DO PROFESSOR: ");
		final String teacherName = input.nextLine();
		
		System.out.print("EMAIL: ");
		final String teacherEmail = input.nextLine();
		
		Teacher newTeacher = new Teacher(teacherName, teacherEmail);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cap7");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(newTeacher);
				
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		input.close();
	}
}