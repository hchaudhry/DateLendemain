package application.esgi.fr;

/**
 * Classe de calcule de la date du lendemain
 */
public class Lendemain {

	/**
	 * Calcule la date du lendemain
	 * @param jour 
	 * @param mois
	 * @param annee
	 * @return date du lendemain
	 */
	public String calculeDateLendemain(int jour, int mois, int annee) {
		 
		if (jour < 1 || jour > 31)
			return "Paramètre incorrecte";
		
		if (mois < 1 || mois > 12)
			return "Paramètre incorrecte";
		
		if (annee < 1582 || annee > 3000)
			return "Paramètre incorrecte";
		
		
		if (mois == 4 || mois == 6 || mois == 9 || mois == 11 ) {
			mois += 1;
			jour = 1;
		} else {
			jour += 1;
			if (jour > 31) {
				mois += 1;
				jour = 1;
			}
		}
		
		if (mois > 12) {
			annee += 1;
			mois = 1;
		}
		
		return jour + "/" + mois + "/" + annee;
	}
}
