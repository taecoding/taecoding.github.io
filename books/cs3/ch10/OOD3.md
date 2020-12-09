# Instance Method vs class(static) Method
- instance method need to be called with _________
  * rectangle.getArea()

- static method need to be called with __________
  * Math.pow(2,3)

## Java Doc
- Math

## Example1 totalStudent
```
public class Student 
{
    private static int totalStudents = 0;

    public Student() {
        totalStudent++;
    }

    public static int getTotalStudents(){
        return totalStudent;
    }
}
```

## Example2: Circle
Please write a class called Circle with private radius field. 
The circle class should have getArea method.
hint: Please use Math.PI


## Rock, Paper, Scissors
Please write a simple rock,paper, scissors game. 
First, you will ask the suer to pick rock, paper, or scissors.
Then you will have the computer randomly choose one of the options.
After that, print out the winner. 
You should keep playing the game until the user hits enter.

```
class RpsGame {
    private static final String Rock = "rock";

    private String getWinner(String user, String computer)
    public void run() {

    }
}

```

```
Enter your choice(rock, paper, or scissors): rock
User: rock
Computer: paper
Computer wins!
```


# Method Overloading

```
class Calculator {
  int sum (int a, int b)
  double sumDouble (double a, double b)
  double sumIntAndDouble(double a, int b)
}
```

- same name with different parameters
- java figure out which method is being called based on the parameters
- the method signatures need to be different
  * function name
  * function parameter

## Product
Please overload the produt method to allow for multiplying following types
```
class Calculator {
    public int product(int one, int two)
}
```
- two doubles
- an int and a double
- a double and an int
- three ints
- three doubles

# Scope
- scope refers to where a variable exists
- local variable exists inside a method

```
public class Calculator {
    public int addOne(int x){
        int result = x + 1;
        return result;
    }

    public int sum(int x, int y){
        int result = x + y;
        return result;
    }
}
```

```
public class Example {
    int var1 = 1;
    public int add(int x){
        int var2 = x;
        for(int i=0; i < x; i++){
            var2 += var1 *i;
        }
        return var2
    }
}
```

# Object Oriented Vocabulary
An object is something that contains both ______ and ________. It is an _______ of a class.

A class is a ________ for creating an object.

An instance is what you call a specific version of a ______.

An _________ method is a method called on an object that helps define the behavior of the class.

An _________ variable is a variable beloging to an object that helps define the state of the class.

An _________ method is a method called on the class. It does not have an object as the receiver. It is accessible to all the instances of the class.

An ________ variable is a variable belong to the class, not any other instance. It is accessible to all instances of the class.

In Java, related classess are grouped into ________

Objects are usually initialized by __________.

__________ is a reference to the current object.

__________ varibles are accessible from outside of the class but it is not a good practice. We should use __________ instead.




```
public class MathOperations
{
    private double PI = 3.14159;
   
    public int sum(int one, int two)
    {
        // Printing Variables Example
        System.out.println("PI: " + PI);
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        
        return one + two;
    }
    
    public int difference(int one, int two)
    {
        // PRINT OUT VARIABLES HERE
        
        return one - two;
    }
    
    public double product(double a, double b)
    {
        double result = a * b;
        
        // PRINT OUT VARIABLES HERE
        
        
        return result;
    }
    
    public double circleCircumference(int radius)
    {
        // PRINT OUT VARIABLES HERE
        
        
        return 2 * radius * PI;
    }
    
    public double circleArea(int radius)
    {
        double area = PI * radius * radius;
        
        // PRINT OUT VARIABLES HERE
        
        return area;
    }
}
```



