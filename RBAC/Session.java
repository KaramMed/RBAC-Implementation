package RBAC;

public class Session {

 Utilisateur utilisateur;
 Role role;
 
public Utilisateur getUtilisateur() {
	return utilisateur;
}
public void setUtilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}

// ouvrir session
public void ouvrir() {
  // montrer les roles de chaque utilisateur
  role = utilisateur.role;
  System.out.println(" l'utilisateur "+utilisateur.getNom()+" appartient au role "+role.nom);
  // montrer ses permissions
  System.out.println(" Les permissions :");
  for ( Permission p : role.permissions ) {
	  System.out.println(" "+p.getAction()+" => "+p.objet.nom);
  }
}

 
 
}
