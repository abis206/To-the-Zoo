//Abas Hersi 
//7/4/2019 
//CSC 142  
//Ravi Gandham

/*
 * This class utilizes inheritance to perform animal behaviors specific to Tigers
 */
public class Dog extends Animal {

//This constructor inherits all of the local variables from Animal	
public Dog() {
	super();
 } 

//This prints what a Dog would say
public void talk() {
	System.out.print("Ruff Ruff"+"." +" Okurr!!");
 } 

//This returns the class type
public String toString() {
	return "Dog"; 
   }

}
