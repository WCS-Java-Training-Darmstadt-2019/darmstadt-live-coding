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
		System.out.println("********* BEGIN castObject **************************");
		System.out.println("1. erstelle java.lang.Object, fülle es mit einem Car");
		Object objectCar = new Car("BMW");
        
		System.out.println("2. prüfe ob die variable objectCar vom typ Car ist");
        if (objectCar instanceof Car) {
        	Car car = (Car) objectCar;
            System.out.println("3. Ja! Object ist vom typ Car und darum kann ich es auf Car casten. " + car.getBrandName());
        } else {
        	System.out.println("3. Nein? Objekt ist nicht vom type Car sondern " + objectCar.getClass());
        }  
        System.out.println("********* END castObject **************************");
	}

	private static void castPrimitive() {
		System.out.println("********* BEGIN castPrimitive **************************");
		System.out.println("cast char 'c' auf int ...");
		int i = (int) 'c';
		System.out.println("c ist als int=" +i);
		System.out.println("cast int " + i + " wieder zurück auf einen character ...");
        char c = (char) i;
        
        System.out.println("der character ist wieder '" + c + "'");
        System.out.println("********* END castPrimitive **************************");
	}
	
	public static void intCompare() {
		System.out.println("********* BEGIN intCompare **************************");
		int a = 1;
		int b = 2;
		int c = 1;
		
		if (c == a) {
			System.out.println("1. c und a sind gleich, weil sie den gleichen wert haben");
		}
		if (b  != c) {
			System.out.println("2. b != c ist erfüllt. b=" + b + ", c=" + c);
		}
		System.out.println("********* END intCompare **************************");
	}
	
	public static void carCompareWithEqualsImplemented() {
		System.out.println("********* BEGIN carCompareWithEqualsImplemented **************************");
		Object carBMW1 = new Car("BMW");
		Object carMercedes1 = new Car("Mercedes");
		Object carBMW2 = new Car("BMW");
		Object carBMWRef = carBMW1;
		
		if (carBMW1 == carBMWRef) {
			System.out.println("1. Objekte sind gleich weil auf gleicher Referenz");
		}
		
		if(carBMW1.equals(carMercedes1)) {
			System.out.println("Dies ist falsch!!!! BMW ist kein Mercedes, irgendetwas ist falsch implementiert in equals/hashcode");
		}
		
		if (carBMW1.equals(carBMW2)) {
			System.out.println("2. Objekte sind gleich, obwohl es 2 unterschiedliche instanzen sind");
			System.out.println("2. Sie haben auch den gleichen HashCode");
			System.out.println("2. carBMW1.hashcode = " + carBMW1.hashCode());
			System.out.println("2. carBMW2.hashcode = " + carBMW2.hashCode());
		}
		System.out.println("********* END carCompareWithEqualsImplemented **************************");
	}
	
	public static void carCompareWithoutEqualsImplemented() {
		System.out.println("********* BEGIN carCompareWithoutEqualsImplemented **************************");
		Object carBMW1 = new CarNoHashCodeEq("BMW");
		Object carMercedes1 = new CarNoHashCodeEq("Mercedes");
		Object carBMW2 = new CarNoHashCodeEq("BMW");
		Object carBMWRef = carBMW1;
		
		if (carBMW1 == carBMWRef) {
			System.out.println("1. Objekte sind gleich weil auf gleicher Speicheradresse");
		}
		
		if (carBMW1 == carBMW2) {
			System.out.println("1. Dies dürfte nicht ausgegeben werden. Objekte sind gleich weil auf gleicher Speicheradresse. Dies dürfte nicht sein");
		}
		
		if(carBMW1.equals(carMercedes1)) {
			System.out.println("Dies ist falsch!!!! BMW ist kein Mercedes, irgendetwas ist falsch implementiert in equals/hashcode");
		}
		
		if (carBMW1.equals(carBMW2)) {
			System.out.println("2. Objekte sind gleich, obwohl es 2 unterschiedliche instanzen sind");
			System.out.println("2. Sie haben auch den gleichen HashCode");
			System.out.println("2. carBMW1.hashcode = " + carBMW1.hashCode());
			System.out.println("2. carBMW2.hashcode = " + carBMW2.hashCode());
		} else {
			System.out.println("2. Objekte sind nicht gleich obwohl sie beides BMW sind. Equals ist nicht implementiert");
		}
		System.out.println("********* END carCompareWithoutEqualsImplemented **************************");
	}
	
	

}
