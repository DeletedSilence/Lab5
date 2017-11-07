
public class CommissionEmployee extends Employee{
	private double salary;
	private double percentage;
	/**
	 * Default constructor
	 */
	public CommissionEmployee(){
		salary = 0;
		percentage = 0;
	}
	/**
	 * overloaded constructor
	 * @param f firstname
	 * @param l lastname
	 * @param s ssn 
	 * @param sal salary
	 * @param p percentage
	 */
	public CommissionEmployee(String f, String l,String s, double sal,double p){
		super(f,l,s);
		salary  = sal;
		percentage = p;
	}
	
	//getters and setters
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	/**
	 * returns the hashcode of each object by calculating the objects attribute values
	 */
	@Override
	public int hashCode() {
		
		int result = super.hashCode();
		result += (int)salary;
		result += (int)percentage;
		return result;
	}
	/**
	 * determines whether two objects are equal by checking their attributes
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj)||getClass() != obj.getClass())
			return false;
		else{
			CommissionEmployee other = (CommissionEmployee) obj;
			if (Double.doubleToLongBits(percentage) != Double.doubleToLongBits(other.percentage))
				return false;
			if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
				return false;
			return true;
		}
	}
	/**
	 * calculates the earnings of the commission employee class
	 */
	@Override
	double earnings() {
		return salary*percentage;
	}
	/**
	 * Prints attributes of the Commission employee class
	 */
	public String toString(){
		return  "CommissionEmployee\n"+super.toString()+"Salary: "+salary+"\n"+"Percentage: "+percentage+"\n";
	}

}
