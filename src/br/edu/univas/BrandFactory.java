package br.edu.univas;

public class BrandFactory {

	public Cars getBrand(String bd) {

		if (bd == null) {
			return null;
		}

		if (bd.equalsIgnoreCase("Ferrari")) {
			return new Ferrari();
		} else if (bd.equalsIgnoreCase("Lamborghini")) {
			return new Lamborghini();
		} else if (bd.equalsIgnoreCase("Porsche")) {
			return new Porsche();
		}

		return null;

	}
}
