class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    public void display(){
        System.out.println("My name is "+ name);
    }
}

class Inherit{
    public static void main (String[] args){
        Dog labarador = new Dog();

        labarador.name= "Abhishek kumar";
        labarador.display();
        labarador.eat();
    }
}