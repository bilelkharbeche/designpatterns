package fr.diginamic.factory;

public class Tablette extends ObjectConnecte {

	/**
	 * Constructor
	 * 
	 * @param limiteVolts
	 */
	public Tablette(int limiteVolts) {
		super(limiteVolts);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.diginamic.factory.ObjectConnecte#recharger(int)
	 */
	public void recharger(int volts) {

		if (volts > getLimiteVolts()) {
			System.out.println("Tablette grillée");
		} else if (volts == getLimiteVolts()) {
			System.out.println("Tablette en charge");
		} else {
			System.out.println("tension insuffisante pour la charge");
		}

	}

}
