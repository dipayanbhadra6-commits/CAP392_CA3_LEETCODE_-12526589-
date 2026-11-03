/*class  animal {
    void eat() {
  System.out.println("Animal eats");
  
   }

}

class Dog extends Animal {
  void bark() {
   System.out.println("Dog barks");
  }

}

class Puppy extends Dog {
  void Play() {
   System.out.println("Puppy Plays");
}

public static void main(String[] args) {
  Puppy p = new Puppy();
   
   P.eat();
   P.bark();
   P.play();
  
   }

}*/


class Animal {

    void eat() {
 System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() 
 System.out.println("Dog barks");
    }
}

class Cat extends Animal {

 void meow() {
  System.out.println("Cat meows");
    }
 public static void main(String[] args) {
  Dog d = new Dog();
 Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
