
public class Employee {
	String name;
	float salary;
	float WorkHours;
	int HireYear;
	float  increase=0;
	float decrease=0;
	  Employee(String name, float salary,float WorkHours,int HireYear)
	    {
	        this.name = name;
	        this.salary =salary;
	        this.WorkHours=WorkHours;
	        this.HireYear=HireYear;
	    }
	  
	  
	  public float tax() {
		  if(salary >1000) {
			 decrease -= (float) (salary*(0.03));
		  }
		  return decrease; 	
	  }

	  public float bonus() {
		  if(WorkHours>40) {
			 salary+= (int) ((WorkHours-40)*30);
		  }
		  return salary;
		  
	  }
	  public float  RaiseSalary() {
		  if((2021-HireYear)<10) {
			  increase=(float) (salary*(0.05));
		  }
		 
		  else if((2021-HireYear)>9 && (2021-HireYear)<20 ) {
			increase = (float) ((salary*(0.1)));
		  }
		  else if((2021-HireYear)>19) {
			 increase= (float) (salary*(0.15));
		  }
		  return increase;
	  }
	  public String toString(){
		    
		    return  this.name + " "+ this.salary +" "+this.WorkHours+" "+this.HireYear;
		  }
}

class Main {
    public static void main(String[] args) {
    	Employee e= new Employee("John Doe",5000,50,2010);
    
    	System.out.println(e.toString());
    	System.out.println("Total Salary: " + e.bonus());
    	System.out.println("Salary with Bonus and Tax: " +( e.bonus()+e.RaiseSalary()+e.tax()));

    }
}
