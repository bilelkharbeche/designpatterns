package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {

		Service dsin = new Service();
		Service bigData = new Service();
		Service javaDev = new Service();

		dsin.addElem(new Employe(10000, "RASPEY", "Cécile"));
		dsin.addElem(new Employe(8000, "BECHKHAR", "Bilel"));

		bigData.addElem(new Employe(7500, "RANMEY", "JB"));
		bigData.addElem(new Employe(3500, "PINTUR", "Eloi"));

		javaDev.addElem(new Employe(7500, "GUINEAU", "Kevin"));
		javaDev.addElem(new Employe(3500, "MARTIN", "Paul"));

		dsin.addElem(bigData);
		dsin.addElem(javaDev);

		System.out.println(dsin.calculerSalaire());
		System.out.println(bigData.calculerSalaire());
		System.out.println(javaDev.calculerSalaire());

	}

}
