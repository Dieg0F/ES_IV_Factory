package br.edu.univas;

import java.util.ArrayList;
import java.util.List;

public class Ferrari implements Cars {

	@Override
	public List<String> getCars() {		
		List<String> cars = new ArrayList<String>();
		cars.add("Ferrari 348 TB");
		cars.add("Ferrari Testarossa");
		cars.add("Ferrari F355 Berlinetta");
		cars.add("Ferrari 360 Modena");
		cars.add("Ferrari 360 Challenge Stradale");
		cars.add("Ferrari F430");
		cars.add("Ferrari F430 Scuderia");
		cars.add("Ferrari 458 Italia");
		cars.add("Ferrari 458 Speciale");
		cars.add("Ferrari 456");
		cars.add("Ferrari 488 GTB");
		cars.add("Ferrari 488 Pista");	
		cars.add("Ferrari 550 Maranello");	
		cars.add("Ferrari 575M Maranello");	
		cars.add("Ferrari 599 GTB Fiorano");
		cars.add("Ferrari 599 GTO");
		cars.add("Ferrari 612 Scaglietti");			
		cars.add("Ferrari 599 GTO");
		cars.add("Ferrari California");
		cars.add("Ferrari California T");
		cars.add("Ferrari FF");	
		cars.add("Ferrari F12 Berlinetta");
		cars.add("Ferrari F40");
		cars.add("Ferrari F50");
		cars.add("Ferrari Enzo");
		cars.add("Ferrari LaFerrari");			
	
		return cars;
	}
}
