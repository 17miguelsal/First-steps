import java.util.*;
public class empleadotes {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Leonard Hofstadter", 95000, 2009, 13, 7);
		Empleado e2 = new Empleado("Alan Harper", 45000, 2011, 3, 30);
		Empleado e3 = new Empleado("Dwight Schrute", 80000, 2002, 6, 10);
		
		e1.rise(10);
		e2.rise(25);
		e3.rise(20);
		
		toString(e1);
		toString(e2);
		toString(e3);
	}

	private static void toString(Empleado w) {
		System.out.println("El empleado " + w.getName() + ":\nSe contrató el día: " + w.getAltaContrato() +".\nSueldo: " + w.getSalary() + ".");
		
	}
	

}

class Empleado {
	
	private String name;
	private double salary;
	private Date altaContrato;
	
	public Empleado(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar Fecha = new GregorianCalendar(year, month - 1, day);
		altaContrato = Fecha.getTime();
	}
	public void toString(Empleado w) {
		System.out.println("El empleado " + w.name + " :\nSe contrató el día: " + w.altaContrato +".\nSueldo: " + w.salary + ".");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getAltaContrato() {
		return altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}
	
	public void rise(double porcent) {
		double increment = (salary * porcent)/100;
		salary += increment;
	}
	
}