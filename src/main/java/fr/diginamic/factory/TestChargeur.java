package fr.diginamic.factory;

public class TestChargeur {

	public static void main(String[] args) {

		Chargeur ch = new Chargeur();

		ch.brancher(new ObjectConnecteAdapter(TestFactory.getObjet(TypeObjet.ENCEINTE_CONNECTEE)));
		ch.brancher(new ObjectConnecteAdapter(TestFactory.getObjet(TypeObjet.TELEPHONE)));
		ch.brancher(new ObjectConnecteAdapter(TestFactory.getObjet(TypeObjet.TABLETTE)));

		ch.brancher(TestFactory.getObjet(TypeObjet.ENCEINTE_CONNECTEE));
		ch.brancher(TestFactory.getObjet(TypeObjet.TABLETTE));
		ch.brancher(TestFactory.getObjet(TypeObjet.TELEPHONE));
	}

}
