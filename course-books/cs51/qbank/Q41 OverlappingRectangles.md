When displaying a collection of rectangular windows on a SUN screen, a critical step is determining whether two windows overlap, and, if so, where on the screen the overlapping region lies.

Write a program to perform this function. Your program will accept as input the coordinates of two rectangular windows. If the windows do not overlap, your program should produce a message to that effect. If they do overlap, you should compute the coordinates of the overlapping region (which must itself be a rectangle).

All coordinates are expressed in “pixel numbers”, integer values ranging from 0 to 9999. A rectangle will be described by two pairs of (X, Y ) coordinates. The first pair gives the coordinates of the lower left-hand corner (XLL, YLL). The second pair gives the coordinates of the upper right-hand coordinates (XUR, YUR). You are guaranteed that XLL < XUR and YLL < YUR.

Input
Input will contain several test case. It begins with a single positive integer on a line by itself indicating the number of the cases following, each of them as described below. This line is followed by a blank line, and there is also a blank line between two consecutive inputs.

Each test case consists of two lines. The first contains the integer numbers XLL, YLL, XUR and YUR for the first window. The second contains the same numbers for the second window.

Output
For each test case, the output must follow the description below. The outputs of two consecutive cases will be separated by a blank line. For each set of input if the two windows do not overlap, print the message ‘No Overlap’. If the two windows do overlap, print 4 integer numbers giving the XLL, YLL, XUR and YUR for the region of overlap.

Note that two windows that share a common edge but have no other points in common are considered to have ‘No Overlap’. Note that two windows that share a common edge but have no other points in common are considered to have ‘No Overlap’.

Sample Input
1
0 20 100 120
80 0 500 60

Sample Output
80 20 100 60

Sample Input
1
0 0 100 100
80 110 90 130

Sample Output
No Overlap

Sample Input
2
0 20 100 120
80 0 500 60
0 0 100 100
80 110 90 130

Sample Output
80 20 100 60
No Overlap
