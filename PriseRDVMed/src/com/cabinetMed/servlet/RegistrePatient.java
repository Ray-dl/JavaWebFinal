package com.cabinetMed.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cabinetMed.entity.Patient;
import com.cabinetMed.service.Patient_dao;

/**
 * Servlet implementation class RegistrePatient
 */
@WebServlet("/RegistrePatient")
public class RegistrePatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String patientMail=request.getParameter("emailP");
		String patientNom=request.getParameter("patientnom");
		String patientPrenom=request.getParameter("patientprenom");
		String patientTel=request.getParameter("phoneP");
		String patientAdr=request.getParameter("adresseP");
		int patientYear=Integer.parseInt(request.getParameter("birthdayP"));
		String patientMDP=request.getParameter("patientPrenom");
		
		//creer les objet Patient
		Patient p= new Patient(patientMail,patientNom,patientPrenom,patientTel,patientAdr,patientYear,patientMDP);
	     
		//ajouter les donnees a le base de donnee
		int count = Patient_dao.insert(p);
		System.out.print(p);
		//redirction
		
		if(count>0) {
			PrintWriter out=response.getWriter();
			out.print("<script language='javascript'>alert('Inscription successful');window.location.href='Patient_login.jsp';</script>");
			
			
		}else {
			
			PrintWriter out=response.getWriter();
			out.print("<script language='javascript'>alert('Inscription Failed');window.location.href='Patient_registre.jsp';</script>");
		}
		
		
		
	}

}
