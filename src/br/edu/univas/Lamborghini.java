package br.edu.univas;
import java.util.ArrayList;
import java.util.List;

public class Lamborghini implements Cars {

	@Override
	public List<String> getCars() {		
		List<String> cars = new ArrayList<String>();
		cars.add("Miura");
		cars.add("Countach SV");
		cars.add("Diablo SV");
		cars.add("Murci�lago");
		cars.add("Murci�lago LP640-4");
		cars.add("Murci�lago SV");
		cars.add("Gallardo");
		cars.add("Gallardo Superleggera");
		cars.add("Hurac�n");
		cars.add("Hurac�n Performante");
		cars.add("Aventador");
		cars.add("Aventador SV");
		cars.add("Aventador SVJ");
		
		
		return cars;
	}
}
