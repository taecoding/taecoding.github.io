# Getter and Setter
- An objet is something that has both state and behavior.
- instance variable should be private
- How to get access it?

## Getter
- let you get access to instance variables
- accessor method

```
private int width;
private int height;

public int getWidth()
{
    return this.width;
}
```

## Setter
- let you set the values of instance variables
- modifier methods

```
private int width;
private int height;

public void setWidth(int newWidth){
    this.width = newWidth;
}
```

## Example1: Rectangle
Please create a class called Rectangle with private width and height. 
The class should provide constructor, toString, and get/set method.


## Example2: Student
Please create a class called Student with private name and gpa. 
The class should provide constructor, toString, and get/set method.

## Example3: Email
Please create a class called Email with private sender, receiver, and message. 
The class should provide constructor, toString, and get/set method.






# HW: Fraction
Please create a class called Fraction with private numerator and denominator. 
The class should provide constructor, toString, and get/set method.
1. void add(Fraction)
2. void subtract(Fraction)
3. void multiply(Fraction)
4. void divide(Fraction)