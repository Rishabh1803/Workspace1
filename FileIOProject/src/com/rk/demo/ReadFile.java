package com.rk.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("ObjectIODemoFile");
			ois=new ObjectInputStream(fis);
			
			Employee e = (Employee)ois.readObject();
			System.out.println(e+" "+e.getDepartment() + " " + e.getDepartment().getLocation());
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				
				System.out.println(e);
			}
			
		}

	}

}
