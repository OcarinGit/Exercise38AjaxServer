package com.exercise38ajaxservidor.model;
import com.exercise38ajaxservidor.model.Employee;
public class PayRoll {

	public static double CalculateSalary(Employee miEmpleado)
	{
		return miEmpleado.getSalaryEmployee()*1.30;
	}
}
