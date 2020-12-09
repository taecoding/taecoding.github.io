# Instance method
- An object is something that has both state and behavior.
  * state: instance variable
  * behavior: instance method

- What is the area of a rectangle?

```
private int length;
private int width;

public int calcArea(){
    return length * width;
}
```

- visibility returnType name (parameter)


- Using an instance method
```
Rectangle rectangle1 = new Rectangle(20,8);
int area = rectangle1.calcArea();
```
- receiver: the name of the object
- methodName: the name of the instance method
- parameter: the inputs to the method


# Perimeter
Wrtie your own public method for the Rectangle class to calculate Perimeter.
- methodName: calcPerimeter

# Honor
Write a class called Student. A Student should have name and gpa fields. Also, Write a new method that tells if the given student is an honors student. The method will return true if the student has a GPA greater than or equals to 3.5.
```
public boolean isHonorStudent()
```

# Triangle
Write a class called Triangle. A Triangle should have base and height fields. Also, Write a new method that tells area of the triangle. 
Note: The base and height are int and getArea should return a double.

# BaseballPlayer
The BaseballPlayer class stores the number of hits and the number of at-bats a player has.
You will extend this class by writing a method to calculate the player’s batting average. 
```
public double getBattingAverage()
```
Which is calculated by the number of hits divided by the number of at bats.

# Distance Between Points
Write a class called Point. A Point should have x and y fields. 
1. calcDistance: write a new method that tells distance between two points.
2. calcSlope: ratio between the points. (ydiff / xdiff)
3. moveX: move point parallel to x axis by the given number.
4. moveY: move point parallel to y axis by the given number.

# Rectangle2D
Write a class called Rectangle. A Rectangle should have two points that represents top-letf and bottom-right conners.
1. Point getBottomLeftPoint():
   Computes the bottom left conner point.
2. Point getTopRightPoint():
   Computes the top right conner point.
3. boolean contains(Point) 
   Checks whether or not this Rectangle contains the specified Point.
4. boolean contains(Rectangle) 
   Checks whether or not this Rectangle entirely contains the specified Rectangle.




5. void add(Point) 
   add the given point to this Rectangle.
6. void add(Rectangle)
   add the given Rectangle to this rectangle.
7. boolean intersects(Rectangle)
   Computes the intersection of this Rectangle with the specified Rectangle.
8. Rectangle intersection(Rectangle)
   Computes the intersection of this Rectangle with the specified Rectangle.



