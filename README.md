# Max Lenght Palindrome Test

Hi! I'm **Ricardo Vadalá**, Full Stack Developer, specialized in Java, SQL and Spring/SpringBoot for Backend and Angular and Vue for Frontend. 
I have attached my aproach for the **Max Lenght Palindrome**, I know that googling the answer 

## Time & Space Complexity


O(n^2) - Exponential Complexity


This is because the algorithm iterates over two nested for loops, 
although within the first Foreach there are two other For loops 
(parallelStreams), they are not nested, thats why it is n^2
and not n^3, so in the worst case scenario when the length of 
the input "n" (In this case the quantity of valid Characters 
in the String) tends toward infinity the time complexity will 
be O(n^2)

##Code

