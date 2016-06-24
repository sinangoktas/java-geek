package com.trimble.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Identify any errors in program (if any) and print the output
public class Serialization implements Serializable {

	public class Employee {
		private String name = "Emp1";
		private double salary = 1000;
	}

	private static final long serialVersionUID = 1L;

	private static int ObjectId = 1;
	private Integer EmpId;
	private Employee employee = new Employee();
	private transient Integer age;

	public Serialization() {
		System.out.println("Default constructor called");
	}

	public Serialization(int id, int age, int objectId) {
		this.EmpId = id;
		this.age = age;
		ObjectId = objectId;
		System.out.println("Parameterized constructor called");
	}

	@Override
	public String toString() {
		return "Object Id:"+ ObjectId + "\nEmployee [id=" + EmpId 
				+ "\n name=" + employee.name 
				+ "\n Salary=" + employee.salary 
				+ "\n Age=" + age + "]";
	}

	public static void main(String[] args) {
		FileOutputStream f;
		try {
			f = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(f);
			Serialization serialObject = new Serialization(1, 27, 10);
			out.writeObject(serialObject);
			out.flush();

			out.close();
			f.close();
			
			ObjectId = 1;
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
			Serialization obj = (Serialization) in.readObject();
			System.out.println("---- Object ----\n" + obj.toString());
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}