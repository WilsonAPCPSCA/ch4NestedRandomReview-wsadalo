# ch4NestedRandomReview
Chapter 4 - Nested Loop and Random Number Review


Name: ______________________ Date: ___________ AP COMPUTER SCIENCE A
Chapter 4 Review: Part 1 – Nested Loops and Random Numbers
Directions: Write the output from problem 1 on this paper. Upload the java files for problems 2-4 to Github. Turn in this
handout when you’re done.
1. What do the following nested loops print out?
a. 
```java
for(int i = 1; i <= 3; i++) {
  for(int j = 1; j <= 4; j++) {
    System.out.print(“*”);
  }
  System.out.println();
}
```
b. 
```java
for(int i = 1; i <= 4; i++) {
   for(int j = 1; j <= 3; j++) {
    System.out.print(“*”);
  }
  System.out.println();
}
```
c. 
```java
for(int i = 1; i <= 4; i++) {
  for(int j = 1; j <= i; j++) {
    System.out.print(“*”);
  }
  System.out.println();
}
```
2. P4.19 Use a nested loop and write a program that prints a multiplication table, like this:
```java
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
…
10 20 30 40 50 60 70 80 90 100
```
3. Write a program that reads an integer from the user and displays, using asterisks, a filled diamond of the given
side length. For example, if the side length is 4, the program should display
 ```java
    *
   ***
  *****
*******
  *****
   ***
    *
 ```
4. The java library has a random number generator, which produces numbers that appear to be completely
random. Calling math.random() yields a random floating-point number that is greater than or equal to zero and
less than 1.
Write a Java program that simulates flipping coins and counts the coin flips. The program should ask the user
how many times to flip the coin, then simulate flipping the coin that many times (using a random number
generator), prints a symbol (H or T) for each coin flip, and provides a summary giving the total number of heads
and tails.
Sample output:
 This program will simulate flipping a fair coin.
 How many times would you like the coin to be flipped? 50
 Here is the sequence of coin flips:
 THHTHTHHTTTHTHTTTTHHTHTHTHHTHTHHTHTHHTTHTTTHHHTHTT
 There were 24 heads and 26 tails.
5. For this program, you will be simulating the tossing a pair of dice. Keep track of the sum of the dice, and print
the output in a histogram. Use a * for each time a sum occurs, so if there are eight 7's, then after 7 print out
********.
```java
Sample output:
This program will simulate tossing a pair of dice.
How many times would you like the dice to be tossed? 20
Here is the sequence of sums, one for each toss:
8 6 3 9 6 7 2 11 5 8 4 7 9 9 6 10 7 5 11 7
2: *
3: *
4: *
5: **
6: ***
7: ****
8: **
9: **
10: *
11: **
12:
```
