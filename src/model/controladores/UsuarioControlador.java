package model.controladores;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Employee;
import model.Entidad;
import model.User;

public class UsuarioControlador extends Controlador {
	
	private static UsuarioControlador instance;
		
	private UsuarioControlador() {
		 super(User.class);
	}
	
	public static UsuarioControlador getInstance() {
		if (instance == null) {
			instance = new UsuarioControlador();
		}
		
		return instance;
	}
	
	public boolean checkLogin(String username, String password) {
		
	}
	
	public Entidad findByUsername(String username) {
		EntityManager em = null;
		Entidad entidad = null;
		try {
			em = getEntityManagerFactory().createEntityManager();
			Query q = em.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class);
			q.setParameter("username", username);
			
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			if (em != null) {
				em.close();
			}
		}
		
		return entidad;
	}
	
}
