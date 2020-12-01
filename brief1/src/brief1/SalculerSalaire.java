package brief1;

import java.util.Scanner;



/*
 * algorithme Fonction2
 * variable
 * 	nom, prenom: chaine de caractere
 * 	nbr_heure: entier
 * 	tarif_par_heure,prix_total : réel
 * debut
 * 		ecrire("Bonjour dans c'est programme")
 * 		ecrire("Quel est votre nom ?")
 * 		lire nom
 * 		ecrire("Quel est votre prenom ?")
 * 		lire prenom
 * 		ecrire("Bonjour, " + nom)
 * 		ecrire("Entrez le nombre d’heures travaillées")
 * 		lire nbr_heure
 * 		si nbr_heurenbr_heure <= 60 alors
 * 			ecrire("Entrez le tarif par heure")
 * 			lire tarif_par_heure
 * 			si nbr_heurenbr_heure <= 60 alors
 *				prix_total <-- nbr_heure * tarif_par_heure
 * 			sinon
 * 				prix_total <-- (nbr_heure * tarif_par_heure)+(((nbr_heure - 40) * tarif_par_heure)/2)
 * 			fin si
 * 			affichage("votre indemnisation est de " + prix_total + " MAD")
 * 		sinon
 * 			ecrire("Le nombre d’heures travaillées est invalide")
 * 		fin si
 * 		ecrire("Fin de programme")
 * fin
 */


public class SalculerSalaire {

	public static void main(String[] args) {
		String nom,prenom;
		int nbr_heure;
		float tarif_par_heure, prix_total;
		Scanner in = new Scanner(System.in);
		System.out.println("Bonjour dans c'est programme");
		System.out.println("Quel est votre nom ?");
		nom = in.nextLine();
		System.out.println("Quel est votre prénom ?");
		prenom = in.nextLine();
		System.out.println("Bonjour, "+nom);
		System.out.println("Entrez le nombre d’heures travaillées");
		nbr_heure = in.nextInt();
		if(nbr_heure <= 60) {
			System.out.println("Entrez le tarif par heure");
			tarif_par_heure = in.nextFloat();
			if(nbr_heure <= 40) {
				prix_total = nbr_heure * tarif_par_heure;
			}
			else {
				prix_total = (nbr_heure * tarif_par_heure)+(((nbr_heure - 40) * tarif_par_heure)/2);
			}
			System.out.println("votre indemnisation est de " + prix_total + " MAD");
		}
		else {
			System.out.println("Le nombre d’heures travaillées est invalide");
		}
		System.out.println("Fin de programme");	
	}

}
