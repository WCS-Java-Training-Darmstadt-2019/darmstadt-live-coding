package com.wcs.java.basics.operators;


/**
 * This example shows
 * == vs equals
 * and also the cast operator and instanceof operator
 * @author dbe
 *
 */
public class OperatorsMain {

	public static void main(String[] args) throws Exception{
		
		castObject();
		castPrimitive();
		carCompareWithEqualsImplemented();
		carCompareWithoutEqualsImplemented();

	}
	

	private static void castObject() {
		Object objectCar = new Car("BMW");
        
        if (objectCar instanceof Car) {
        	Car car = (Car) objectCar;
            System.out.println("Is a car " + car.getBrandName());
        } else {
        	System.out.println("Is not a car but " + objectCar.getClass());
        }            
	}

	private static void castPrimitive() {
		int i = (int) 'c';
		System.out.println(i);
        char c = (char) i;
        System.out.println(c);
	}
	
	public static void intCompare() {
		int a = 1;
		int b = 2;
		int c = 1;
		
		if (c == a) {
			System.out.println("1. c und a sind gleich, weil sie den gleichen wert haben");
		}		
	}
	
	public static void carCompareWithEqualsImplemented() {
		
		Object carBMW1 = new Car("BMW");
		Object carMercedes1 = new Car("Mercedes");
		Object carBMW2 = new Car("BMW");
		
		if (carBMW1 == carBMW2) {
			System.out.println("1. Objekte sind gleich weil auf gleicher Speicheradresse");
		}
		
		if(carBMW1.equals(carMercedes1)) {
			System.out.println("Dies ist falsch!!!! BMW ist kein Mercedes, irgendetwas ist falsch implementiert in equals/hashcode");
		}
		
		if (carBMW1.equals(carBMW2)) {
			System.out.println("2. Objekte sind gleich, obwohl es 2 unterschiedliche instanzen sind");
			System.out.println("2. Sie haben auch den gleichen HashCode");
			System.out.println("2. carBMW1.hashcode =" + carBMW1.hashCode());
			System.out.println("2.carBMW2.hashcode =" + carBMW2.hashCode());
		}
		
	}
	
	public static void carCompareWithoutEqualsImplemented() {
		
		Object carBMW1 = new CarNoHashCodeEq("BMW");
		Object carMercedes1 = new CarNoHashCodeEq("Mercedes");
		Object carBMW2 = new CarNoHashCodeEq("BMW");
		Object carBMW1_1 = carBMW1;
		
		if (carBMW1 == carBMW1_1) {
			System.out.println("1. Objekte sind gleich weil auf gleicher Speicheradresse");
		}
		
		if (carBMW1 == carBMW2) {
			System.out.println("1. Objekte sind gleich weil auf gleicher Speicheradresse. Dies dürfte nicht sein");
		}
		
		if(carBMW1.equals(carMercedes1)) {
			System.out.println("Dies ist falsch!!!! BMW ist kein Mercedes, irgendetwas ist falsch implementiert in equals/hashcode");
		}
		
		if (carBMW1.equals(carBMW2)) {
			System.out.println("2. Objekte sind gleich, obwohl es 2 unterschiedliche instanzen sind");
			System.out.println("2. Sie haben auch den gleichen HashCode");
			System.out.println("2. carBMW1.hashcode =" + carBMW1.hashCode());
			System.out.println("2. carBMW2.hashcode =" + carBMW2.hashCode());
		} else {
			System.out.println("2. Objekte sind nicht gleich obwohl sie es sein müssten. Equals ist nicht implementiert");
		}
		
	}
	
	

}
