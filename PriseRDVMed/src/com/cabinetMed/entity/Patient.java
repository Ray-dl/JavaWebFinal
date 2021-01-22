package com.cabinetMed.entity;

public class Patient {
 
   private String EmailPatient;
   private String NOMPatient;
   private String PRENOMPatient;
   private String NumTelePatient;
   private String AddressHabitPatient;
   private int ANNEENaissance;
   private String MDPPatient;
   
   
   public Patient(String emailPatient, String nOMPatient, String pRENOMPatient, String numTelePatient,
			String addressHabitPatient, int aNNEENaissance, String mDPPatient) {
		super();
		EmailPatient = emailPatient;
		NOMPatient = nOMPatient;
		PRENOMPatient = pRENOMPatient;
		NumTelePatient = numTelePatient;
		AddressHabitPatient = addressHabitPatient;
		ANNEENaissance = aNNEENaissance;
		MDPPatient = mDPPatient;
	}


public String getEmailPatient() {
	return EmailPatient;
}


public void setEmailPatient(String emailPatient) {
	EmailPatient = emailPatient;
}


public String getNOMPatient() {
	return NOMPatient;
}


public void setNOMPatient(String nOMPatient) {
	NOMPatient = nOMPatient;
}


public String getPRENOMPatient() {
	return PRENOMPatient;
}


public void setPRENOMPatient(String pRENOMPatient) {
	PRENOMPatient = pRENOMPatient;
}


public String getNumTelePatient() {
	return NumTelePatient;
}


public void setNumTelePatient(String numTelePatient) {
	NumTelePatient = numTelePatient;
}


public String getAddressHabitPatient() {
	return AddressHabitPatient;
}


public void setAddressHabitPatient(String addressHabitPatient) {
	AddressHabitPatient = addressHabitPatient;
}


public int getANNEENaissance() {
	return ANNEENaissance;
}


public void setANNEENaissance(int aNNEENaissance) {
	ANNEENaissance = aNNEENaissance;
}


public String getMDPPatient() {
	return MDPPatient;
}


public void setMDPPatient(String mDPPatient) {
	MDPPatient = mDPPatient;
}
   
}
