//Abas Hersi 
//7/4/2019 
//CSC 142  
//Ravi Gandham

/*
 * This class serves as a superclass that the other classes use to gain general animal behaviours
*/
public abstract class Animal {
//Establishes all the fields
private int hunger;

//Constructor that initializes all the fields
public Animal() {
	this.hunger = 0;
    }

//Returns hunger
public int getHunger() {
	return this.hunger;
   }

//This ads to hunger when time passes
public void timePasses() {
	 this.hunger += 1;
  }

//This sets hunger to 0 when when feed is utilized
public void feed() {
	 this.hunger = 0;
 }

abstract public void talk();

}
 