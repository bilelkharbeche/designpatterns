package fr.diginamic.factory;

public enum TypeObjet {

	/** TELEPHONE : TypeObjet */
	TELEPHONE("Téléphone portable"),
	/** TABLETTE : TypeObjet */
	TABLETTE("Tablette"),
	/** ENCEINTE_CONNECTEE : TypeObjet */
	ENCEINTE_CONNECTEE("Enceinte connectée");

	/** objetConnecte : String */
	private String objetConnecte;

	/**
	 * Constructor
	 * 
	 * @param objetConnecte
	 */
	private TypeObjet(String objetConnecte) {
		this.objetConnecte = objetConnecte;
	}

	/**
	 * Getter
	 * 
	 * @return the objetConnecte
	 */
	public String getObjetConnecte() {
		return objetConnecte;
	}

	/**
	 * Setter
	 * 
	 * @param objetConnecte
	 *            the objetConnecte to set
	 */
	public void setObjetConnecte(String objetConnecte) {
		this.objetConnecte = objetConnecte;
	}

}
