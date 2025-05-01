class Employee{
	public double basicsal,allowance;

public Employee(double basicsal,double allowance){
	this.basicsal = basicsal;
	this.allowance = allowance;
	
 }
public void findtot(){
	double tot = basicsal + allowance;
	System.out.println("Employees basic salary is " +tot);	
  }
}