package RBAC;

public class Test {
public static void main(String[] args) {
	// karam et barhmoui doivent lire livre , alors que autre nom
	// definition utilisateurs et objets
	Utilisateur u1 = new Utilisateur("karam");
	Utilisateur u2 = new Utilisateur("barhoumi");
	Utilisateur u3 = new Utilisateur("autre");
	Objet o1 = new Objet("Livre");
	
	// definition des roles
	Role r1 = new Role("lecteur");
	Role r2 = new Role("rien");
	
	// ajout des utilisateurs aux roles
	r1.ajouterUtilisateur(u1);
	r1.ajouterUtilisateur(u2);
	r2.ajouterUtilisateur(u3);
	
	// definition des permissions
	Permission p1 = new Permission();
	p1.setAction("lecture");
	p1.setObjet(o1);
	Permission p2 = new Permission();
	p2.setAction("ecriture");
	p2.setObjet(o1);
	
	
	
	// definition des permissions pour chaque role
	r1.ajouterPermission(p1);
	r1.ajouterPermission(p2);
	
	// creation de session
	Session s1 = new Session();
	s1.setUtilisateur(u2);
	s1.ouvrir();
	

}
}
