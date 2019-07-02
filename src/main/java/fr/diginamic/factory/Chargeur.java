package fr.diginamic.factory;

public class Chargeur {

	/** volts : int */
	private int volts = 220;

	/**
	 * Constructor
	 * 
	 * @param volts
	 */
	public Chargeur() {
		super();
	}

	/**
	 * @param chargeable
	 */
	public void brancher(Chargeable chargeable) {
		chargeable.recharger(volts);
	}

	/**
	 * Getter
	 * 
	 * @return the volts
	 */
	public int getVolts() {
		return volts;
	}

	/**
	 * Setter
	 * 
	 * @param volts
	 *            the volts to set
	 */
	public void setVolts(int volts) {
		this.volts = volts;
	}

}
