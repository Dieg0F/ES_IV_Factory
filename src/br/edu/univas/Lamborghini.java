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
		cars.add("Murciélago");
		cars.add("Murciélago LP640-4");
		cars.add("Murciélago SV");
		cars.add("Gallardo");
		cars.add("Gallardo Superleggera");
		cars.add("Huracán");
		cars.add("Huracán Performante");
		cars.add("Aventador");
		cars.add("Aventador SV");
		cars.add("Aventador SVJ");
		
		
		return cars;
	}
}
