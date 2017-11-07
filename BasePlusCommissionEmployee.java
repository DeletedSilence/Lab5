
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double bonus;
	/**
	 * default constructor
	 */
	 public BasePlusCommissionEmployee() {
		 super();
	 }
	 /**
		 * overloaded constructor
		 * @param f firstname
		 * @param l lastname
		 * @param s ssn 
		 * @param sal salary
		 * @param p percentage
		 * @param b bonus
		 */
	 public BasePlusCommissionEmployee(String f, String l,String s, double sal,double p,double b) {
		 super(f,l,s,sal,p);
		 bonus = b;
	 }
	 //setters and getters
	 public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	/**
	 * calculates the earnings of the basepluscommission employee class
	 */
	public double earnings() {
		return super.earnings()+bonus;
	}
	/**
	 * returns the hashcode of each object by calculating the objects attribute values
	 */
	@Override
	public int hashCode() {
		return super.hashCode()+(int)bonus;
	}
	/**
	 * determines whether two objects are equal by checking their attributes
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (!super.equals(obj)||getClass() != obj.getClass())
			return false;
		else{
			BasePlusCommissionEmployee other = (BasePlusCommissionEmployee) obj;
			if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
				return false;
			return true;
		}
	}
	/**
	 * Prints attributes of the BasePlusCommission employee class
	 */

	public String toString(){
			return  "BasePlusCommissionEmployee\n"+super.toString()+"Bonus: "+bonus;
	}


}
