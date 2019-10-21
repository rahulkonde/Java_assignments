package com.traning.myapp;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.training.myapp.model.Patient;
import com.training.myapp.model.PatientStatusComparator;

public class PatientPriorityQueueMain {

	public static void main(String[] args) {

		PriorityQueue<Patient> patients = new PriorityQueue<Patient>(new PatientStatusComparator());
		patients.add(new Patient("apple", 2));
		patients.add(new Patient("samsung", 5));
		patients.add(new Patient("honor", 3));
		patients.add(new Patient("redmi", 4));
		patients.add(new Patient("motorola", 1));

		for (Patient Patient : patients)
			System.out.println(Patient);

		Scanner sc = new Scanner(System.in);
		System.out.println("1 New Patient" +"\n" + " 2 next Patient " + "\n "+ " 3 Waiting list " + "\n " + "4  Exit");
		int waitinglist = sc.nextInt();
		System.out.println(waitinglist);
		sc.close();
		// System.out.println(patients.peek());

	}
}
