class Manager extends Employee{
	public double ot,bonus;
public Manager(double basicsal,double allowance,double ot,double bonus){
	super(basicsal,allowance);
	this.ot = ot;
	this.bonus = bonus;
	
 }
public void findtot(){
	double tot = basicsal+allowance+ot+bonus;
	System.out.println("Manager salary is " +tot);	
 }
}