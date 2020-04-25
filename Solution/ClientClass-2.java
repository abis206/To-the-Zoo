//Abas Hersi 
//7/4/2019 
//CSC 142  
//Ravi Gandham

/*
 * This is a client class that utilizes all of the other classes in order to affect of all of the different objects.
 */
public class ClientClass {
public static void main(String args[]) {
	//Create's all of the objects
	Giraffe giraffe = new Giraffe();
	Zoo zoo = new Zoo();
	Tiger tiger = new Tiger(); 
	Dog dog = new Dog();
	
	//Puts the animals and their cages and describes the zoo's contents 
		zoo.putinCage1(tiger);
		zoo.putinCage2(giraffe);
		zoo.putinCage3(dog);
		zoo.print();
	
	//Giraffe's client code
	giraffe.talk();
	giraffe.feed();
	
	//Tiger's client code
	for(int i = 1;i<=3;i++) {
		tiger.timePasses();
	}
	tiger.talk();  
	tiger.getHunger(); 
	tiger.feed();
	//Dog's Client Code
	dog.talk();
	dog.feed();
  }
}
