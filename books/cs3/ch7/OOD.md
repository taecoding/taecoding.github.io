# Object Oriented Programming

A rectangle is an object.
It has height and width.

# create class with properties (states)
- A class is a template for creating an object

```
class Somehting {
    // instance variables
}

class Rectangle {
    int length;
    int width;
}

class Triangle {
    int base;
    int height;
}
```

# create an object
- create an object with new keyword

```
Rectangle rectangle1 = new Rectangle();
rectangle1.length = 5;
rectangle1.width = 5;

Rectangle rectangle2 = new Rectangle();
rectangle1.length = 10;
rectangle1.width = 10;
```

# constructor
- initialize instance variable
- same name as the class name
- no return type
```
Rectagle rectangle1 = new Rectangle(5,5);
Rectagle rectnagle2 = new Rectagle(10,10);
```

### create Rectangle class
<img src="/images/rectangle.png" alt="">

### create Triangle class
<img src="/images/triangle.png" alt="">

### create Student class
<img src="/images/student.png" alt="">

### create Point class
```
x
y
```

### create Car class
```
maker
model
color
```

### create Email class

### create Document class

### create Dog class

### create Cat class

### create Pizza class
type
toppings
size

### create Fraction class

# getter/setter methods
- access to private variables
- get width and print
- set width and print


# toString method
- returns a string representation of your object

# definition
- An object: is something that contains both state and behavior. 
it is an instance of a class
- A class: is a template/blueprint for creating an object
- An instance is what you call a specific version of a class.
Instance and object refer to the same thing.

Student is a class
James, Jane are instances of the class.

# client of the class
- classes are often a very nice way to bundle up functionality.
- If someone else writes a class, you can use it. You don't need to know exactly how it all works.


### Pizza 
Create a program that ask the user to order a pizza. 
Those information should be stored in Pizza class and print out at the end.
You should create the instance variables, the constructor and a toString method.

### Student GPA property
This program starts with the Student class from earlier. We want to add a new instance variable (or field) that represents the student’s GPA. Since it can contain a decimal place, you’ll need to figure out the right type.
You should also add the GPA to the toString method and use it to print out the following:

James Kim is in grade: 11 and has GPA: 3.5
Jane Austin is in grade: 12 and has GPA: 3.8
