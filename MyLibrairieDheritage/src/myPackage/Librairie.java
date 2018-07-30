package myPackage;

public class Librairie {

	public static void main(String[] args) {
		Livre CallOfCthuluh = new Livre();
		Clients Greg = new Clients();
		// TODO Auto-generated method stub
		Greg.setNom("Mr.Thersiquel");
		Greg.setPrénom("Greg");
		
		String libName = "L'Héritage.";
		String addresse = "4 rue du Serpollet, Paris, 75020";
		String horaires = "7j/7, 24h/24h";
		
		System.out.println("Bienvenu dans notre librairie " + libName);
		System.out.println("************");
		System.out.println("Nous somme au " + addresse);
		System.out.println("Nous sommes ouverts " + horaires);
		System.out.println("************");
		
		
		CallOfCthuluh.setAuteur("H.P Lovecraft");
		CallOfCthuluh.setTitre("Call Of Cthuluh");
		CallOfCthuluh.setEditeur("Simon & Schuster. New York");
		CallOfCthuluh.setType("Fantaisie");
		CallOfCthuluh.setPrix(19.99);
		CallOfCthuluh.setDisponibilite(false);
		
		if(CallOfCthuluh.disponibilite == false) {
			System.out.println("Le livre : " + CallOfCthuluh.getTitre());
			System.out.println("Ecrit par: " + CallOfCthuluh.getAuteur());
			System.out.println("Dans la catégorie : " + CallOfCthuluh.getType());
			System.out.println();
			System.out.println();
			System.out.println("Edité par le groupe : " + CallOfCthuluh.getEditeur());
			System.out.println("Au prix de : " + CallOfCthuluh.getPrix() );
			System.out.println();
			System.out.println();
			System.out.println("A été reservé par : " + Greg.getNom() + Greg.getPrénom());
		}
		

	}

}
