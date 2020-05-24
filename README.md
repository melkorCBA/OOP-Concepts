# OOP Concepts

## 1.Abstraction

### definition 
```
Hiding internal details and showing functionality is known as abstraction.
```
```
In Java, we use abstract class and interface to achieve abstraction.
```
### Why use abstract classes
- stop create object from the classes
- have some abtract methodes we can implement later. (if inheritance was used here we have to implement in the super class )
- share code among several closely related classes.

### Why use interfaces over abstract classes
- multiple iheritance
- abstract classes may contain non-final variables, whereas variables in interface are final, public and static. 
- unrelated classes would implement the interface.
- specify the behavior not concerned about who implements its behavior.


## 2.Encapsulation

### definition 
```
Encapsulation simply means binding object state(fields) and behavior(methods) together.
```
```
In Java, we use access modifiers like private protected to achieve encapsulation.
```
### example
```
Make the instance variables private so that they cannot be accessed directly from outside the class.
```
## 3.Polymorphism

### definition 
```
 perform a single action in different ways.
```
```
In Java, we use access modifiers like private protected to achieve encapsulation.
```
### example
```
Animal that has a method animalSound(), here we cannot give implementation to this method as we do not know which Animal class would extend Animal class. So, we make this method abstract like this:

```
```JAVA
public abstract class Animal{
   ...
   public abstract void animalSound();
}
```
```
Now suppose we have two Animal classes Dog and Lion that extends Animal class. We can provide the implementation detail there.
```
```JAVA
public class Lion extends Animal{
...
    @Override
    public void animalSound(){
        System.out.println("Roar");
    }
}

public class Dog extends Animal{
...
    @Override
    public void animalSound(){
        System.out.println("Woof");
    }
}
```
```
As you can see that although we had the common action for all subclasses animalSound() but there were different ways to do the same action. 
```
### Types of Polymorphism
```
1) Static Polymorphism
2) Dynamic Polymorphism
```
### 1.Static Polymorphism
```
Polymorphism that is resolved during compiler time is known as static polymorphism. Method overloading can be considered as static polymorphism
```
<span style="color:blue">Note: </span>
When we say method signature we are not talking about return type of the method, for example if two methods have same name, same parameters and have different return type, then this is not a valid method overloading example. This will throw compilation error.

```JAVA
public static void method1(int a, int b){
    System.out.println(a+b);
}

//this is overloading
//signature (int)
public static void method1(int a){
    System.out.println(a);
}

public static int method1(int a){
    return 0;
}

```

<span style="color:red">Error: </span>
last one is not valid and throw duplicate method error because return type is not considered as part of the signature

### 1.Dynamic Polymorphism (Dynamic Method Dispatch)
```
It is also known as  Dynamic Method Dispatch. Dynamic polymorphism is a process in which a call to an overridden method is resolved at runtime rather, thats why it is called runtime polymorphism.
```
```JAVA
class Animal{
   public void animalSound(){
	System.out.println("Default Sound");
   }
}

public class Dog extends Animal{
    public void animalSound(){
        System.out.println("Woof");
    }
    public static void main(String args[]){
        Animal obj = new Dog();
        obj.animalSound();
    }
}
```
<span style="color:blue">Note</span>
Since both the classes, child class and parent class have the same method animalSound. Which of the method will be called is determined at runtime by JVM.

## 4.Inheritance

### definition 
```
When one object acquires all the properties and behaviors of a parent object, it is known as inheritance.
```
```
Inheritance allows us to reuse of code, it improves reusability in our java application.
```
### example
```JAVA
class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Car myFastCar = new Car();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
```
<span style="color:blue">Note</span>
This is used to achieve runtime polymorphism.