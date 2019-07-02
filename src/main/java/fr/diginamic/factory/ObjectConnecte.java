package fr.diginamic.factory;

public abstract class ObjectConnecte {

	/** limiteVolts : int */
	private int limiteVolts;

	/**
	 * Constructor
	 * 
	 * @param limiteVolts
	 */
	public ObjectConnecte(int limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}

	public abstract void recharger(int volts);

	/**
	 * Getter
	 * 
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/**
	 * Setter
	 * 
	 * @param limiteVolts
	 *            the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}
}