//Abas Hersi 
//7/4/2019 
//CSC 142  
//Ravi Gandham

/*
 * This class allows for all of the other animals to be contained in class known as Zoo.
 */
public class Zoo {
//Class fields
 Animal cage1;
 Animal cage2;
 Animal cage3;
 
//This constructor that initializes all the fields
public Zoo() {
	this.cage1 = null;
	this.cage2 = null; 
	this.cage3 = null;
}   
//Sets cage1 to an animal object
public void putinCage1(Animal animal){
	this.cage1 = animal;
}

//Sets cage1 to an animal object
public void putinCage2(Animal animal){
	this.cage2 = animal;
}

//Sets cage1 to an animal object
public void putinCage3(Animal animal){
	this.cage3 = animal;
} 

//This prints out information as to what the zoo contains
public void print() {
	if(this.cage1 != null || this.cage2 != null || this.cage3 != null)
	System.out.println("The zoo contains a ");
	
	if(cage1 != null) {
		System.out.println(" "+this.cage1);
	}
	if(cage2 != null) {
		System.out.println(" "+this.cage2);	
	}
	if(cage3 != null) {
		System.out.println(" "+this.cage3);
	}
  }
}
