package br.edu.univas;
import java.util.ArrayList;
import java.util.List;

public class Porsche implements Cars {

	@Override
	public List<String> getCars() {		
		List<String> cars = new ArrayList<String>();
		cars.add("718 Cayman S");
		cars.add("718 GT4");
		cars.add("Panamera Turbo S");
		cars.add("911 Carrera S");
		cars.add("911 Carrera 4S");
		cars.add("911 Turbo S");
		cars.add("911 Targa GTS");
		cars.add("911 GT2 RS");
		cars.add("911 GT3 RS");
		cars.add("918 Spyder");
		cars.add("Carrera GT");
		
		return cars;
	}
}
