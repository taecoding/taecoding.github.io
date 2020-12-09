# Array: a sequence of variables
## initialization
```
int[] mathScores = new int[10];
int[] englishScores = {100, 90, 95}; 
```
## assignment
```
mathScores[0] = 80;
```

## array and loop
```
for(int i=0; i < mathScores.length; i++){
  System.out.println(mathScores[i]);
}
```

## Ex1: class ArrayPractice 
Set up an array to hold the following values, and in this order: 23, 6, 47, 35, 2, 14. Write a program to get the average of all 6 numbers. (You can use integers for this exercise, which will round down your answer.)

## Ex2: 
Using the above values, have your program print out the highest number in the array.

## Ex3:
Using the same array above, have your program print out only the odd numbers.

1. Names in Array: getIndexOf
Please write a program that stores five names in the array and ask the user a name. The function shoudl return the index of the name.