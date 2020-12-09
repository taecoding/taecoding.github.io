# JAVA Methods

- name of funciton 
- parameters: input definition
- return: output definition

## Static method
```
int multiply(int x, int y){
    return x * y;
}

int product = multiply(10, 40);
System.out.println(product);
```

## String Methods
- a sequence of characters
- each character is stored has a position
- javadoc
- Methods
  * char charAt(int index)
  * boolean equals(Object object)
  * boolean equalsIgnoreCase(string other)
  * int indexOf(String str)
  * int length()
  * String substring(int beginIndex)
  * String substring(int beginIndex, int endIndex)
- charAt
  * IndexOutOfBoundsException
- substring
  * beginning index is inclusive
  * ending index is exclusive
- immutable
- loop: str.length()

## char and Character
- characters are numbers
- ASCII: American standard code for intermation interchange
- Escape sequences: \n, \t \" \'
- Methods
  * boolean isDigit(char c)
  * boolean isLetter(char c)
  * boolean isLowerCase(char c)
  * boolean isUpperCase(char c)
  * boolean isWhitespace(char c)
  * char toLowerCase(char c)
  * char toUpperCase(char c)
  
### Ex: printEscape
```
First Line
Second Line

My teacher says "\n is for a newline"
```
### Ex: yell 
Please write a function that takes a string and return the string in uppercase. 

### Ex: getFullName
Please write a function that takes first name and last name. 
The function should return full name.

### Ex: repeat3
Please write a function that takes a string and repeat the string 3 times.
example: repeat3("Good") ==> "GoodGoodGood"

### Ex: countUppercases
Please write a function that takes a string and return how many capital letters in the string.

### Ex: isInteger
Please write a function that takes a string and determine the string is an integer. 
The function should return true if the string is an integer.
hint) It is an integer if all the characters in the string are digits
isInteger("123") ==> true
isInteger("abc") ==> false

### Ex: doubleVowel
Please write a function that takes a string and returns a new string 
that replaces every vowel with two occurrences of that vowels.
doubleVowel("hello") ==> heelloo

### Ex: allSameLetter
Please write a function to determin if all the letters in a string are the same letter.

### Ex: altCase
Please write a method that takes a string and return the string in Alt Case.
This means that the first letter is uppercase and each subsequent character alternates 
between lowercase and uppercase.
altCase("hello") ==> HeLlO

### Ex: isBracketsMatch
Write a method that takes a string of curly brackets and determin the brackets are matched.
The function should return true if the brakcets match up and false if they don't
```
"{}"
"}{"
```

### Ex: replaceLetter
Write a method that replaces all instance of all letter with another.


=== HW

Ex: firstAndLast
Please write a function that takes a string and return the first and last character of the given string.


Ex: repeatN
Please write a function that takes a string and integer. 
The function should repeat the string n times and return the result.

Please write a function that takes a string and integer. 
The function should repeat the string n times and return the result.

function name: repeatN
parameters: String word, integer n


System.out.println(repeatN("go", 2).equals("gogogo"));
System.out.println(repeatN("go", 3).equals("gogogo"));


Ex: validPassword
Write a function to return if the string is a valid password.
It must be at least 8 characters long and may only consist 
of letters and digits.