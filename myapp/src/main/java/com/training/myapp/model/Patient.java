package com.training.myapp.model;

public class Patient implements Comparable<Patient> {

	private String patientName;
	private int patientStatus;

	public Patient() {
		super();
	}

	public Patient(String patientName, int patientStatus) {
		super();
		this.patientName = patientName;
		this.patientStatus = patientStatus;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientStatus() {
		return patientStatus;
	}

	public void setPatientStatus(int patientStatus) {
		this.patientStatus = patientStatus;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientStatus=" + patientStatus + "]";
	}

	public int compareTo(Patient o) {
		return Integer.compare(this.patientStatus, o.patientStatus);
	}

}
