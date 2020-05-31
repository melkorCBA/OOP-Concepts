<h1 style="font-size:3rem;"> OOP in Java</h1>

<h1>OOP Concepts</h1>
<p>There are 4 main concepts in java
  <ol>
    <li><a href="#abstraction">Abstraction</li>
    <li><a href="#encapsulation">Encapsulation</li>
    <li><a href="#polymorphism">Polymorphism</li>
    <li><a href="#inheritance">Inheritance</a> </li>
    
  </ol>
  And for drawing <a href="#classDGM">UML class diagrams</a><br>
  And about <a href="#javaMem">Java Memory Allocation </a> <br>
  For <a href="#resources">Resources</a>
</p>

<div id="abstraction">

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

</div>

<div id="encapsulation"></div>

## 2.Encapsulation

### definition

```
Encapsulation simply means binding object state(fields) and behavior(methods) together.
```

```
In Java, we use access modifiers like private protected to achieve encapsulation.
```

### example

<p style="background-color: #f0f5f1; padding:10px;">
Make the instance variables private so that they cannot be accessed directly from outside the class.
</p>

</div>
<div id="polymorphism">

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

<p style="background-color: #f0f5f1; padding:10px;">
Polymorphism that is resolved during compiler time is known as static polymorphism. Method overloading can be considered as static polymorphism
</p>
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

<p style="background-color: #f0f5f1; padding:10px;">
It is also known as  Dynamic Method Dispatch. Dynamic polymorphism is a process in which a call to an overridden method is resolved at runtime rather, thats why it is called runtime polymorphism.
</p>
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

</div>

<div id="inheritance">

## 4.Inheritance

### definition

<p style="background-color: #f0f5f1; padding:10px;">
When one object acquires all the properties and behaviors of a parent object, it is known as inheritance.
</p>

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

</div>

<div id="classDGM">

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
</div>

<div id="javaMem">
<h1>Java Memory Allocation </h1>

<p>The JVM divided the memory into following sections.
  <ol>
    <li> <b>code</b> section contains the bytecode.</li>
    <li><b>Stack</b> section of memory contains methods, local variables, and reference variables.</li>
    <li><b>Heap</b> section contains Objects (may also contain reference variables).</li>
    <li><b>Static</b> section contains Static data/methods.</li>
  </ol>
 </p>

 <h2>Java static keyword</h2>
 <p>

The static can be:

<ol>
  <li>Static variables</li>
  <li>Static methods</li>
  <li>Static Blocks Of Code. </li>
</ol>

 </p>

 <h3>1.Static variables</h3>
 <p>
 <ul>
  <li>Belongs to the class and not to object(instance )</li>
  <li>Initialized only once at the start of the execution</li>
  <li>Static variables will be initialized first, before the initialization of any instance variables. </li>
  <li>A single copy to be shared by all instances of the class</li>
  <li>A static variable can be accessed directly by the class name and doesn’t need any object</li>
 
 </ul>
 </p>
  <h3>2.Static methods</h3>
  <p>
  <ul>
  <li>Methods which belongs to the class and not to the object</li>
  <li>Can only access static data. It cannot access non-static data (instance variables). </li>
  <li>Can only call other static methods</li>
 
  <li>Can be accessed directly by the class name and doesn’t need any object</li>
  <li>static method cannot refer to "this" or "super" keywords in anyway</li>

   </ul>

   <details>
  <summary markdown="span"> examples</summary>

```JAVA
public class Demo{
  public static void main(String args[]){
    Student s1 = new Student();
    s1.showData();
    Student s2 = new Student();
    s2.showData();
    //------section 1.......
    //Student.b++;
    //s1.showData();
    //......................
  }
}

class Student {
  int a; //initialized to zero
  static int b; //initialized to zero only when class is loaded not for each object created.

  Student(){
    //Constructor incrementing static variable b
    b++;
  }

  public void showData(){
    System.out.println("Value of a = "+a);
    System.out.println("Value of b = "+b);
  }
  //------------section 2-----------
  //public static void increment(){
  //a++;
  //}
  //--------------------------------

}

```

  </p>
  <span>Expected output </span>
  
![staticMethod1](/oop-codes/staticmethode1.png)

  <p>This is how memory allocation happens in JVM</p>

![staticMem](/oop-codes/staticMem.png)

  <p><b>uncomment section 1: </b>check if is it possible to access a static variable from outside the class</p>
   <p><b>output: </b></p>

![staticMem](/oop-codes/staticsection1output.png)

  <p><b>uncomment section 2: </b>it is not possible to access instance variable "a" from java static class method "increment".</p>
   <p><b>output: </b></p>

![staticSection2out](/oop-codes/staticoutputerror.png)

 </details>

  <h3>3.Static Blocks</h3>
  <p>
  <ul>
  <li>A block of statement inside a Java class that will be executed when a class is first loaded into the JVM. </li>
  <li>Static block helps to initialize the static data members, just like constructors help to initialize instance members. </li>
   </ul>

   <details>
  <summary markdown="span"> examples</summary>

```JAVA
public class Demo {
  static int a;
  static int b;
  static {
    a = 10;
    b = 20;
  }
  public static void main(String args[]) {

  System.out.println("Value of a = " + a);
  System.out.println("Value of b = " + b);

  }
}


```

  </p>
  <span>Will get following output</span>

![staticBlock](/oop-codes/staticblockoutput.png)

 </details>

</dv>

<div id="resources">
<h1>Resources </h1>
  <ol>
    <li><a href="https://coderanch.com/wiki/660119/Interface-Abstract-Class">“Interface Vs Abstract Class (Wiki Forum at Coderanch).” Coderanch.
‌</a></li>

  <li><a href="https://www.w3schools.com/java/java_abstract.asp">“Java Abstraction.” W3schools.Com, 2020.
‌</a>
</li>
<li>
  <a href="https://www.geeksforgeeks.org/abstract-classes-in-java/">“Abstract Classes in Java.” GeeksforGeeks, 3 Dec. 2012.
  ‌</a>
</li>
<li>
  <a href="https://stackify.com/oops-concepts-in-java/">“What Are OOP Concepts in Java? 4 Primary Concepts.” Stackify, 30 Apr. 2019.
  ‌</a>
</li>
<li>
  <a href="https://www.geeksforgeeks.org/interfaces-in-java/">Interfaces in Java - GeeksforGeeks.” GeeksforGeeks, 18 May 2016.
  ‌</a>
</li>
<li>
  <a href="https://beginnersbook.com/2013/04/oops-concepts/">OOPs Concepts in Java.” Beginnersbook.Com, 10 Sept. 2017
  ‌</a>
</li>
<li>
  <a href="https://dzone.com/articles/when-to-use-abstract-class-and-intreface">When to Use Abstract Class and Interface - DZone Java.”
  ‌</a>
</li>
<li>
  <a href="https://www.guru99.com/java-static-variable-methods.html">Java Static Method, Variable and Block with Example.
  ‌</a>
</li>

  </ol>

</div>
