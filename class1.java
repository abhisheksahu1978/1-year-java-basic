// create a java class
class Dog{
    // declaring and initializing the attributes
    String breed;
    int age;
    String color;

// method to set breed 
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
    } 
    public void setColor(String color){
        this.color = color;
    }

    // method to print all three values
    public void printDetails(){
        System.out.println("Dog Details:");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}

public class class1{
    public static void main(String[] args){
        // create an object of the class dog

        Dog obj = new Dog();

        // setting the arrtibutes
        obj.setBreed("Golden Retriever");
        obj.setAge(2);
        obj.setColor("Golden");

        // printing the values
        obj.printDetails();
        

    }
}