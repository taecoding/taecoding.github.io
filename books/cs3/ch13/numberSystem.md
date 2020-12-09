
# Decimal number system: 
0 1 2 3 4 5 6 7 8 9

# binary number system:
0 1 

325 = 3 * 100 + 2 * 10 + 5

# how to convert decimal to binary

# how to convert decimal to Octal

# how to convert decimal to hex

```
    public static String binaryString(int num){
        StringBuilder binary = new StringBuilder();
        while ( num > 0){
            int remainder = num % 2;
            binary.append(remainder);
            num /= 2;
        }
        return binary.reverse().toString();
    }
```