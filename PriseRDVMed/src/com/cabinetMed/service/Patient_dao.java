package com.cabinetMed.service;

import com.cabinetMed.dao.BaseDao;
import com.cabinetMed.entity.Patient;

public class Patient_dao {

	public static int insert(Patient p) {
		// TODO Auto-generated method stub
		String sql="ajouter les donnee a Patient(?,?,?,?,?,?,?)";
		
		Object []params= {
				p.getEmailPatient(),
				p.getNOMPatient(),
				p.getPRENOMPatient(),
				p.getNumTelePatient(),
				p.getAddressHabitPatient(),
				p.getANNEENaissance(),
				p.getMDPPatient()
				
				
				
				
		};
		
		
		return BaseDao.exectPatientBD(sql,params);
	}

}
