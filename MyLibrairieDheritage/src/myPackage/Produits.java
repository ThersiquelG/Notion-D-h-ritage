package myPackage;

public class Produits {
	public String Titre;
	public String Auteur;
	public String Editeur;
	public boolean disponibilite;
	public double prix;
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public String getEditeur() {
		return Editeur;
	}
	public void setEditeur(String editeur) {
		Editeur = editeur;
	}
	public boolean isDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
