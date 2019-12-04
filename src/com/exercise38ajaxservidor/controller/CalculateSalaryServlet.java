package com.exercise38ajaxservidor.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exercise38ajaxservidor.model.Employee;
import com.exercise38ajaxservidor.model.PayRoll;

@WebServlet("/CalculateSalaryServlet")
public class CalculateSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output = response.getWriter();
		
		Employee miEmpleado = new Employee();
		double calculatedSalary = 0.0;
		
		miEmpleado.setNameEmployee(request.getParameter("txtName"));
		miEmpleado.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalary")));
		
		calculatedSalary = PayRoll.CalculateSalary(miEmpleado);
		
		output.append("Calculated Salary with taxes is:"+calculatedSalary);
		
		output.close();
	}

}
