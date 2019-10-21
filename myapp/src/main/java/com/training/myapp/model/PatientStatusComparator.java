package com.training.myapp.model;

import java.util.Comparator;

public class PatientStatusComparator implements Comparator<Patient> {

	//@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return (o2.getPatientStatus() - o1.getPatientStatus());
		}
	

}
