package com.rk.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("ObjectIODemoFile");
			oos=new ObjectOutputStream(fos);
			Location l = new Location(21,"Mumbai");
			Department d = new Department(10,"IT");
			d.setLocation(l);
			Employee e = new Employee(18,"Rishabh");
			e.setDepartment(d);
			oos.writeObject(e);
			System.out.println("File Created");

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}