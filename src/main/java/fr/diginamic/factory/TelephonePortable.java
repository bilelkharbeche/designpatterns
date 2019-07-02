package fr.diginamic.factory;

public class TelephonePortable extends ObjectConnecte {

	/**
	 * Constructor
	 * 
	 * @param limiteVolts
	 */
	public TelephonePortable(int limiteVolts) {
		super(limiteVolts);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.diginamic.factory.ObjectConnecte#recharger(int)
	 */
	public void recharger(int volts) {

		if (volts > getLimiteVolts()) {
			System.out.println("Téléphone grillé");
		} else if (volts == getLimiteVolts()) {
			System.out.println("Téléphone en charge");
		} else {
			System.out.println("tension insuffisante pour la charge");
		}

	}

}
