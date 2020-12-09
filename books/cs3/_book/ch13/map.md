# how to store mapping data
- name to phone number
- key and value

- A key is the value used to look something up in the map.
- The value is the result you get when you look up the entry for a key.

```
HashMap<String, String> phonebook = new HashMap<String, String>();

phonebook.put("Taehee Jung", "111-111-1111");

String alansNumber = phonebook.get("Taehee Jung");

for(String key: phonebook.keySet()){
    String number = phonebook.get(key);
    System.out.println(key + ":" + number);
}

EX1: Word Counts
```

- parameterized over two types: key typ and the value types
- the order of key set is not guaranteed.

```
In this program you will ask the user for a String, and then output the count of every word in that String in alphabetical order. You’ll need to use a HashMap to do this.

For example if the user entered:

Hello hello world 
You’d print out 
hello: 2 
world: 1

Since the word hello appeared twice and the word world appeared once.
```