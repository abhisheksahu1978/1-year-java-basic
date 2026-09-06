class Animal{
    void eat(){
        System.out.println("Animals eats food.");
    }
}

class baku extends Animal{
    void walk(){
        System.out.println("baku walks on land.");
    }
}

class Dog extends baku {
    void bark(){
        System.out.println("Dog barks.");
    }
}

class inheritance2{
    public static void main (String[] args){
        Dog mysonashu = new Dog();

        mysonashu.eat();
        mysonashu.walk();
        mysonashu.bark();
    }
}