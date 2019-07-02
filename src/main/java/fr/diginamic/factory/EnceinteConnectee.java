package fr.diginamic.factory;

public class EnceinteConnectee extends ObjectConnecte {

	/**
	 * Constructor
	 * 
	 * @param limiteVolts
	 */
	public EnceinteConnectee(int limiteVolts) {
		super(limiteVolts);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.diginamic.factory.ObjectConnecte#recharger(int)
	 */
	public void recharger(int volts) {

		if (volts > getLimiteVolts()) {
			System.out.println("Enceinte grillée");
		} else if (volts == getLimiteVolts()) {
			System.out.println("Enceinte en charge");
		} else {
			System.out.println("tension insuffisante pour la charge");
		}

	}

}
