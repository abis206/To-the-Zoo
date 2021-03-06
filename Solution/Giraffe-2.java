//Abas Hersi 
//7/4/2019 
//CSC 142  
//Ravi Gandham

/*
 * This class utilizes inheritance to perform animal behaviors specific to Giraffes
 */
public class Giraffe extends Animal {
//This constructor inherits all of the local variables from Animal
public Giraffe() {
	super();
} 

//This prints what a Giraffe would say
public void talk() {
	System.out.println("The Giraffe silently chews.");
} 

//This returns the class type
public String toString() {
	return "Giraffe"; 
   }
} 
