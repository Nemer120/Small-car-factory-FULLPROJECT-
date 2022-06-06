package model;

import java.time.LocalDateTime;
import java.util.Date;

import utils.Gender;
/**@author adifroimovich 318173879 */
public class DepartmentManager extends Employee{
	
	private Date appointmentDate;
	private double bonus;

	public DepartmentManager(String iD, String firstName, String lastName, String phoneNumber, Gender gender,
			LocalDateTime dateOfStartWork , double salary, Department dep, int yearOfBirth, Date appointmentDate, double bonus,String pass) {
		super(iD, firstName, lastName, phoneNumber, gender, dateOfStartWork, salary, dep, yearOfBirth,getPassword());
		this.appointmentDate = appointmentDate;
		this.bonus = bonus;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+" , bonus=" + bonus;
	}
	
	

}
