# OOP Concepts

## 1.Abstraction

### definition 
```
Hiding internal details and showing functionality is known as abstraction.
```
```
In Java, we use abstract class and interface to achieve abstraction.
```


<details>
  <summary markdown="span">Why use abstract classes</summary>

 
  <ul>
    <li>Have some abtract methodes you can implement later. <br> (if inheritance was used here you have to implement in the super class)</li>
    <li>You want to share your code with several relevant  classes</li>
    <li>You expect that classes that extend your abstract class have some communal methods or fields</li>
    <li>stop creating object from the classes</li>
  </ul>
</details>


<details>
  <summary markdown="span">Why use interfaces over abstract classes</summary>

 
   <ul>
    <li>You feel that some non-relevant classes would implement your interfaces.</li>
    <li>Specify the behavior not concerned about who implements its behavior</li>
    <li>You want to define the behavior of a particular data type. But who implements its behavior is not your concern</li>
    <li>abstract classes may contain non-final variables, whereas variables in interface are final, public and static.</li>
    <li>multiple iheritance</li>
   </ul>
</details>



<span style="color:blue">Note: </span>
We can add methods to an abstract class without breaking any clients. If we add a method to an interface, we break all implementations


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


<details>
    <summary markdown="span">examples</summary>

```
Animal that has a method animalSound(), here we cannot give implementation to  this method as we do not know
which Animal class would extend Animal class. So, we make this method abstractlike this:
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
</details>





### Types of Polymorphism
```
1) Static Polymorphism
2) Dynamic Polymorphism
```
<h4>1.Static Polymorphism</h4>

```
Polymorphism that is resolved during compiler time is known as static polymorphism. Method overloading can be considered as static polymorphism
```
<span style="color:blue">Note: </span>
When we say method signature we are not talking about return type of the method, for example if two methods have same name, same parameters and have different return type, then this is not a valid method overloading example. This will throw compilation error.


<details>
  <summary markdown="span">Static Polymorphism examples</summary>

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

</details>



<span style="color:red">Error: </span>
last one is not valid and throw duplicate method error because return type is not considered as part of the signature

<h4>2.Dynamic Polymorphism (Dynamic Method Dispatch)</h4>

```
It is also known as  Dynamic Method Dispatch. Dynamic polymorphism is a process in which a call to an overridden method is resolved at runtime rather, thats why it is called runtime polymorphism.
```
<details>
  <summary markdown="span"> Dynamic Polymorphism examples</summary>

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
</details>

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
<details>
  <summary markdown="span">examples</summary>

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
</details>



<span style="color:blue">Note</span>
This is used to achieve runtime polymorphism.

# UML Class Diagrams

```
This is the UML class diagram for Nanosoft Project Management System
```
![NanosoftUMLclassDM](/oop-codes/NanosoftUMLclassDM.jpeg)

<ol>
`<li>Person is the supper class of Employee and Customer</li>
    <ul>
    <li>
    shows with open arrays to the side of the supper class</li>
    <li>No need to show multiplicity</li>
    </ul>
<li>Person has a Composition relation with Name and Date </li>
<ul>
    <li>Name and Date can't exists without a Person</li>
    <li>1:1 relationship between Person and Name, Person and Date 
</ul>
<li>Projects has association with Employee and Customer</li>
<ul>
<li>Project can't exists without Customer, Composition</li>
<li>One customer can have many projects</li>
<li>Project can exists without Employee, Aggregation</li>
<li>n:m relationship, one employee can works on many project, one project have many employees</li>
<li>1:m relationship, one customer can have many project, one project can have one customer</li>
</ul>

</ol>

```
here is another example
```
![NanosoftUMLclassDM](/oop-codes/Zoo.png)
<span style="color:blue">Error: </span>
Relationship between Otter and Sea urchin is association

```
Watch this for more details
```

<iframe width="560" height="315" src="https://www.youtube.com/embed/UI6lqHOVHic" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>