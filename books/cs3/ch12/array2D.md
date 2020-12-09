# array of arrays
- rows and cols
```
int[][] grid = new int[3][4]

char[][] grid = new char[3][3]

String[][] grid = new String[10][3]


int[][] grid = {
    {1,2,3,4},
    {5,6,7,8},
    {9,10,11,12}
};

int[] row = grid[1];

```

## Ex
Write the method that sums row in the 2D array called matrix.

```
public int sumRow(int[][] matrix, int row)
```


## Ex
Ice Cream Combos
Please write a method that takes an array of ice cream flavors and an array of toppings 
as parameters, and returns an ArrayList holding every possible combination of ice cream 
and toppings.

ArrayList<String> getAllChoices(String[] flavors, String[] toppings)


Each combination should be represented in the form

"{{flavor}} with {{topping}} on top"

For example, the method call:

String[] flavors = {"chocolate", "vanilla"};
String[] toppings = {"sprinkles", "fudge"};
getAllChoices(flavors, toppings);
Should return an ArrayList holding the following Strings:

["chocolate with sprinkles on top", "chocolate with fudge on top", "vanilla with sprinkles on top", "vanilla with fudge on top"]


