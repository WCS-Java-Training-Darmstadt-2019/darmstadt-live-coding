package com.wcs.java.basics.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Can serialize and deserialize a Car bean.
 * @author dbe
 *
 */
public class CarSerializer {
	
	public static void writeCarToFile(Car car, File file) throws IOException {
		writeCarToStream(car, new FileOutputStream(file));
	}
	
	public static Car readCarFromFile(File file) throws IOException, ClassNotFoundException {
		return readCarFromStream(new FileInputStream(file));
	}
	
	public static void writeCarToStream(Car car, OutputStream out) throws IOException {
		ObjectOutputStream objOut = new ObjectOutputStream(out);
		objOut.writeObject(car);
	}
	
	public static Car readCarFromStream(InputStream in) throws IOException, ClassNotFoundException {
		ObjectInputStream objOut = new ObjectInputStream(in);
		return (Car) objOut.readObject();
	}

}
