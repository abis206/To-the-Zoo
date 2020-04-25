//Abas Hersi 
//7/4/2019 
//CSC 142  
//Ravi Gandham

/*
 * This class utilizes inheritance to perform animal behaviors specific to Tigers
 */
public class Tiger extends Animal {
//This constructor inherits all of the local variables from Animal
public Tiger() {
	super();
 }  

//This prints what a Giraffe would say
public void talk() {
	System.out.println("Roar!");
} 

//This overrides TimePasses and adds an additional Print statement
public void timePasses() {
	 super.timePasses(); 
	 if(getHunger() >= 3) {
		 System.out.println("The tiger paces hungrily."); 
	 }
 }

//This returns the class type
public String toString() {
	return "Tiger"; 
  }
}
