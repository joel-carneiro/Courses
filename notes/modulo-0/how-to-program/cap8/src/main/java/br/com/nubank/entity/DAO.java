package br.com.nubank.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<E> {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cap8");
	private EntityManager entityManager;

	public DAO() {
		this.entityManager = entityManagerFactory.createEntityManager();
	}

	public DAO<E> openTransaction() {
		this.entityManager.getTransaction().begin();
		return this;
	}

	public DAO<E> closeTransaction() {
		this.entityManager.getTransaction().commit();
		return this;
	}

	public DAO<E> persist(E entity) {
		entityManager.persist(entity);
		return this;
	}

}