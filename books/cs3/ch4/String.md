# String
- a sequence of characters
- String is not primitive types
- a capital S which means it is a class

## Concatenating String
```
String firstName = "Taehee";
String lastName = "Jung";
String fullName = firstName + " " + lastName;
```

## Comparison
```
String name1 = new String("Taehee");
if (name1 == "Taehee") {
    System.out.println("Address is same");
}

if (name1.equals("Taehee")){
    System.out.println("Value is same");    
}
```
## Iterate characters
```
String name = "Taehee";
for(int i =0; i < name.length(); i++){
    System.out.println(name.charAt(i));
}
```


