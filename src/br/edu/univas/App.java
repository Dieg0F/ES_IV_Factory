package br.edu.univas;

public class App {

	public static void main(String[] args) {
		
		BrandFactory bdFactory = new BrandFactory();
			
		Cars cars = bdFactory.getBrand("Ferrari");		
		System.out.println(cars.getCars());
		
		cars = bdFactory.getBrand("Lamborghini");		
		System.out.println(cars.getCars());
		
		cars = bdFactory.getBrand("Porsche");		
		System.out.println(cars.getCars());
	}
}
