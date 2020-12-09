# Array List
- Arrays are a fixed size. need more space in the List

```
import java.util.*;

ArrayList<String> list = new ArrayList<String>();

ArrayList<Integer> list = new ArrayList<Integer>();
```

## Add and Remove to an ArrayList
```
list.add(5);
list.add(10);
list.add(0, 100);

list.remove(1);
```

## Get and Set a Value
```
int val = list.get(1);
list.set(2, 99);
```

## Size of ArrayList
```
int length = list.size();
```

## Iterate Over ArrayList
```
for(int i =0; i < list.size(); i++){
    int item = list.get(i)
}

for(int item: list){

}

```

# ArrayList implements List interface
```
List<String> myList = new ArrayList<String>();
```

## Demo: add and get
```
ArrayList<String> myList = new ArrayList<String>();
myList.add("Hello");
myList.add("World");

System.out.println(myList.get(0));
```

## Demo: primitive type
```
ArrayList<Integer> myList = new ArrayList<Integer>();

myList.add(100);
myList.add(200);

System.out.println(myList.get(0));
```


### Ex1: 
Write a program that adds the numbers 1 through 5 into the numbers ArrayList and then prints out the first element in the list.

### Ex2:
```
Create a arraylist that contains your 3 friends.
print your second friend
add one more friend in the first position
to see whether there is a friend named "Amy"
remove 3rd friend
Say hello to all your friends
```
### Hw1:
Please write the Cell Phone and Text Message classes with the following properties.

class CellPhone
- String phoneNumber;
- ArrayList<TextMessage> textMessages
- void addText(TextMessage text)
- void printAllTexts()

class TextMessage
- String sender
- String receiver
- String body
- void printText()

# Hw2:
Please implement the following functions.
1. findMaxScore
2. findFirstPlace 


# List interface
- List is an interface that defines abstract method signatures.

List<E>: represents a List of elements of type E.

List<String>
List<Integer>
List<Shape>

add, remove
get, set
contains
containsAll
equals

ArrayList<E> implements List<E>
- LinkedList<E>
- Stack<E>
- Vector<E>
- more


### Ex
There are a list of books to read over the summer but you only want to read the books by a certain author.

class Book 
- author
- title


public List<Book> filterBooks(List<Book> readingList, String author) {

}
