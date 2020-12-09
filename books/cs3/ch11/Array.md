# Array
- keep tract of exam scores for 100 students

```
int score1;
int score2;
int score3;
```

- fixed number of elements of the same type

- create an array

```
80 92 91 68 88

int[] scores = new int[5]
int[] scores = { 80, 92, 91, 68, 88};
```

- indexing: get, set

```
int score = scores[2];

scores[3] = 78
```

- array index: start at index 0
- getting the array length

```
int length = scores.length;
```
- last index: 
int lastIndex = scores.length - 1

## Iterating over an array

```
int[] scores = {80, 92, 91, 68, 88};
for (int i = 0; i < scores.length; i++){
    System.out.println(scores[i]);
}
```

## Summing an Array
```
```

## Array of students
```
private Student[] students;
```

## Exceptions for Arrays
- ArrayIndexOutOfBoundsException

## Assigning Array Reference
```
int[] arr = {10, 3, 123, 44};
int[] arr2 = arr;

arr[1] = 88;
```


### Ex1: 
Create an array containing 2, 4, 6, 8, 10 and assign it to firstArray.
Then, print out the elements at index 1 nd index 3.

### Ex2:
Write a method that retuns the legnth of an array.

### Ex3:
Write a method that returns the last elemtn in the array.

### Ex4:
Write a method that print everthing in the array.

```
public satic void printArray(String[] array){

}
```

### Ex5:
Write a method that print out the elements stored at the odd indices of the array

### Ex6
Write a method that returns the index of the minimum value in the array


### Ex7
Write a method that returns the median value in the array
hint: 
- if the length of the arry is odd, the median is the value in the center of the array
- if the length of the array is even, the median is the average of the two numbers in the center
- use Arrays.sort (java.util.*)

## Ex8
Please create a class to represent classroom that has subject and students.
Also, Please create a class to represet student that has name and exam scores.
```
class ClassRoom
- subject
- students
- addStudent
- printStudent

class Student
- name
- examScores
- addExamScore
- printAllExams
```

## HW
Please come up with a hierarchical structure that resembles classroom and student example.





