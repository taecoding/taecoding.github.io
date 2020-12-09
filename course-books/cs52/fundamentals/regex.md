# java.util.regex

# Pattern
* We create a pattern object by calling Pattern.compile(), there is no constructor. compile() is a static method in Pattern class.
```
Pattern pattern = Pattern.compile("a*c");
pattern.match();
```

* Pattern.matches() is also a static method that is used to check if given text as a whole matches pattern or not.

```
Pattern.matches("a?e", "abe");
```

# Matcher
* Like above, we create a Matcher object using matcher() on objects of Pattern class.
```
Matcher matcher = pattern.matcher("");

```

* find() is used to find multiple occurrences of pattern in text.
* We can split a text based on a delimiter pattern using split()