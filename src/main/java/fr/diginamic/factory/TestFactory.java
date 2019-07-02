package fr.diginamic.factory;

public class TestFactory {

	/**
	 * @param type
	 * @return
	 */
	public static ObjectConnecte getObjet(TypeObjet type) {

		if (type.equals(TypeObjet.TELEPHONE)) {
			return new TelephonePortable(5);
		} else if (type.equals(TypeObjet.TABLETTE)) {
			return new Tablette(10);
		} else if (type.equals(TypeObjet.ENCEINTE_CONNECTEE)) {
			return new EnceinteConnectee(50);
		}

		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestFactory.getObjet(TypeObjet.TELEPHONE).recharger(5);
		TestFactory.getObjet(TypeObjet.ENCEINTE_CONNECTEE).recharger(51);
		TestFactory.getObjet(TypeObjet.TABLETTE).recharger(0);

	}

}
