package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {

	/** nom : String */
	private String nom;

	List<IElement> listElem = new ArrayList();

	public Service() {
		// TODO Auto-generated constructor stub
	}

	public double calculerSalaire() {
		double salaire = 0;

		for (IElement liste : listElem) {
			salaire += liste.calculerSalaire();
		}
		return salaire;

	}

	public void addElem(IElement element) {
		listElem.add(element);

	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
