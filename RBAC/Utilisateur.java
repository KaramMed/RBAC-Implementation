package RBAC;

public class Utilisateur {

 String nom;
 Role role;

 public Utilisateur(String a) {
	 nom = a;
 }
 
 public String getNom() {
	 return nom;
 }
 
 public void setRole(Role r) {
	 role = r;
 }
}
