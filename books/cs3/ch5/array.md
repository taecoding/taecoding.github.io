# Array
a sequence of variables with the same type

keep track of exam score in math class.
```
int score1;
int score2;
int score3; 
...
```

```
int[] scores = new int[5];
0  1  2  3  4
0  0  0  0  0

int[] scores = {80,92, 91, 68, 88};
0  1  2  3  4
80 92 91 68 88
```

## Making an Array
```
int[] scores = new int[5];

int[] scores = {80, 90, 100, 87, 88};
int value = scores[3];
scores[3] = 72
```

## Array Length and last index
```
int[] scores = {70,80,90, 88, 82};
int length = scores.length;
int lastIndex = length -1;
```

## Ex1: method: createFirstArray
Make an array containing 2,4,6,8,10 and assign it to firstArray in the method.
Then print out the elements at index 1 and index 3.

## Ex2: method: getArrayLength
Write a method that takes an array and returns the length of the array.

## Ex3: method: getLastElement
Write a method that takes an array and returns the last element in the array.


# Iterating Over an Array
```
int[] scores = {80, 92, 91, 68, 88};
for (int i = 0; i < scores.length; i++){
    System.out.println(scores[i]);
}
```

# Summing an Array
```
int[] scores = {80, 92, 91, 68, 88};

int sum = 0;
for(int i =0; i < scores.length; i++){
    sum += scores[i];
}
System.out.println(sum);
```

# Reference variable
```
int[] arr1 = {10, 3, 123, 44};
int[] arr2 = arr1;

arr[1] = 88;
```

# Array methods
```
Arrays.sort
Arrays.fill
```

## Ex4: method: printArray
Please write a method that take an int array and print all the elements in the array.

## Ex5: method: printOddIndices
Please write a method that take an int array and print all the elements stored at the odd indices of the array.
  
## Ex6: method. getIndexOfMin
Please write a method that take an int array and returns the index of the minimum value in the array.

## Ex7: method. findMedian 
Write a method that returns the median value in the array.
note: median is the value in the center of the array if the length of the array is odd.
otherwise, the average of the two numbers in the center.

## Ex8: method: getTopScore
Please write a method that take an int array and returns the maximum score in the array.

# Ex9: method: getAverageScore
Please write a method that take an int array and returns the average score in the array.

