package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.Usuario;

public class UsuarioTest {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Usuario");		//First change
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			Usuario usuario = new Usuario(1, "glanati", "Gonzalo Lanati", "1234", "gonzalo.lanati@hotmail.com", "156173330", false, false, "imagen");
			em.persist(usuario);

			em.getTransaction().commit();
			System.out.println("Persistido " + usuario);
			
			em.getTransaction().begin();
			usuario = new Usuario(2, "lbosio", "Luis Bosio", "1234", "luis.bosio@hotmail.com", "155677632", false, false, "imagen");
			em.persist(usuario);

			em.getTransaction().commit();
			System.out.println("Persistido " + usuario);
			
			usuario = em.find(Usuario.class, 1);
			System.out.println("Encontrado " + usuario);
			
			TypedQuery<Usuario> query = em.createQuery(
					"FROM Usuario u", Usuario.class);
			
			List<Usuario> usuarios = query.getResultList();
			for (Usuario e : usuarios) {
				System.out.println("Se encontro al usuario: " + e);
			}
			
			em.getTransaction().begin();
			
			usuario = em.find(Usuario.class, 1);
			if (usuario != null) {
				usuario.setActivo(true);
			}
			
			em.getTransaction().commit();
			System.out.println("Actualizado " + usuario);
			
			em.getTransaction().begin();
			
			usuario = em.find(Usuario.class, 1);
			if (usuario != null) {
				em.remove(usuario);
				System.out.println("usuario " + usuario.getCodigo() + " borrada");
			}
			
			usuario = em.find(Usuario.class, 2);
			if (usuario != null) {
				em.remove(usuario);
				System.out.println("usuario " + usuario.getCodigo() + " borrada");
			}
			
			em.getTransaction().commit();	
			
			em.close();
			emf.close();
	}

}
