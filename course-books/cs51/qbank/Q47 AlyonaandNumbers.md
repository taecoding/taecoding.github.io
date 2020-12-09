After finishing eating her bun, Alyona came up with two integers n and m. She decided to write down two columns of integers — the first column containing integers from 1 to n and the second containing integers from 1 to m. Now the girl wants to count how many pairs of integers she can choose, one from the first column and the other from the second column, such that their sum is divisible by 5.

As usual, Alyona has some troubles and asks you to help.

Input
The only line of the input contains two integers n and m (1 ≤ n, m ≤ 1 000 000).

Output
Print the only integer — the number of pairs of integers (x, y) such that 1 ≤ x ≤ n, 1 ≤ y ≤ m and (x + y) is divisible by 5.

Examples
input
6 12
output
14
input
11 14
output
31
input
1 5
output
1
input
3 8
output
5
input
5 7
output
7
input
21 21
output
88
Note
Following pairs are suitable in the first sample case:

for x = 1 fits y equal to 4 or 9;
for x = 2 fits y equal to 3 or 8;
for x = 3 fits y equal to 2, 7 or 12;
for x = 4 fits y equal to 1, 6 or 11;
for x = 5 fits y equal to 5 or 10;
for x = 6 fits y equal to 4 or 9.
Only the pair (1, 4) is suitable in the third sample case.