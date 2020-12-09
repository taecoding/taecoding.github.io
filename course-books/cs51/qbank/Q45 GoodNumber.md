Let's call a number k-good if it contains all digits not exceeding k (0, ..., k). You've got a number k and an array a containing n numbers. Find out how many k-good numbers are in a (count each number every time it occurs in array a).

Input
The first line contains integers n and k (1 ≤ n ≤ 100, 0 ≤ k ≤ 9). The i-th of the following n lines contains integer ai without leading zeroes (1 ≤ ai ≤ 109).

Output
Print a single integer — the number of k-good numbers in a.

Examples
input
10 6
123450
123455560
1243560
1234560
1234560
1234560
1234560
1234560
1234560
1234560

output
10

input
2 1
1
10
output
1