package com.wcs.java.basics.vars;

/**
 * 
 * 1) vars are scoped 2) instance member var 3) static member var 4)
 * overshadowing of member vars 5) pass by reference 6) final as parameter 7)
 * final as member variable
 * 
 * 
 * 
 * @author dbe
 *
 */
public class VarsExamples {

	String first;
	String name;
	public String overShadowedMemberVar;
	public static String myStaticVar = "David";

	public VarsExamples(String name) {
		this.name = name;
	}

	//Examines if a value is passed by reference or by value
	public static void passByReferenceOrValue() {

		String first = "david";
		System.out.println("set local variable first to 'david'. Now change variable in method ...");
		changeString(first);
		System.out.println("Is the local variable first changed to another value? " + first);

		int i = 0;
		System.out.println("set local variable i to 0. Now change variable in method and add 2...");
		changeInteger(i);
		System.out.println("Is the local variable i changed to another value? " + i);

		Car car = new Car();
		car.setBrandName("BMW");
		changeCarWithNewObject(car, "Mercedes");
		System.out.println(car.getBrandName());
		changeCarBrandName(car, "Mercedes");
		System.out.println(car.getBrandName());
	}

	private static void changeInteger(int i) {
		i = i + 2;
	}

	private static void changeString(String first) {
		first = "Changed now!";
	}

	private static void changeCarWithNewObject(Car c, String brandName) {
		c = new Car(brandName);
	}

	private static void changeCarBrandName(Car c, String brandName) {
		c.setBrandName(brandName);
	}

	public void setOvershadowedMemberVar(String overShadow) {
		overShadow = overShadow;
		System.out.println(this.overShadowedMemberVar);
	}

	/**
	 * Show how variable is in local scope
	 * 
	 * @param a
	 */
	public void showLocalScope(String name) {
		// uncomment this
		// String name = "david";

		{
			// uncomment this
			// String name = "david";
		}

		System.out.println(name);
	}

	public static void showStaticScopeVsLocalScope() {

		VarsExamples[] examples = { new VarsExamples("alex"), new VarsExamples("christoph"), new VarsExamples("kadir"),
				new VarsExamples("bertold") };

		int i = 0;
		for (VarsExamples e : examples) {
			e.myStaticVar = "Test" + i;
			i++;
		}
		for (VarsExamples e : examples) {
			// see that member variable and static var behave different
			System.out.println("Name:" + e.name + ", " + e.myStaticVar);
			i++;
		}
	}

	/**
	 * Warum kompiliert das nicht? :;
	 * 
	 * @param name
	 */
	public static void changeFinalParameter(final String string) {
		string = "Something else";
	}

}
