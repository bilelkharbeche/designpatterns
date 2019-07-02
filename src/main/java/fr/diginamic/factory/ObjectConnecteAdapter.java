package fr.diginamic.factory;

public class ObjectConnecteAdapter implements Chargeable {

	private ObjectConnecte objCon;

	public ObjectConnecteAdapter(ObjectConnecte objCon) {
		this.objCon = objCon;
	}

	public void recharger(int volts) {
		if (volts > objCon.getLimiteVolts()) {
			objCon.recharger(objCon.getLimiteVolts());
		} else {
			objCon.recharger(volts);
		}
	}

}
