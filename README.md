# Parallel Sorting
## Overview:
For this project, you will be writing a program that sorts an array of random values. You can
write this program in Java or C++. If you use code from some other source, you need to cite the
source.
## The Program:
You need to write a program that does the following:
- Prompt the user to enter an integer N. You can assume that N is greater than 0.
- Generate a list (array, vector, ArrayList; any one-dimensional data structure is fine) of
random integers containing N elements; each random value should be between 1 and N *
10. For example, if the user enters 1000, it should create an array containing 1000 elements,
each with a random value between 1 and 10,000.
- Split the list into four equal size pieces (as equal as you can).
- Start four threads, and have each thread sort one of the quarter-size lists.
- Merge the four quarter-size sorted lists into one full length sorted list.
- Print the final sorted list.

  
## Specifications:
The following specifications are required for this project. Each specification is graded on the 0-
1 scale, and your project total score will be equal to the total number of points from the
specifications.
1. Your program represents a sincere attempt to solve the problem.
2. Your program compiles and runs, assuming specification 1 is met.
3. Your program welcomes the user and prompts them to enter a number N.
4. Your program correctly creates a random array/list of N items.
5. Your program correctly splits the array into four sub-lists.
6. Your program correctly starts four threads and sorts each sub-list.
7. Your program correctly merges the sorted sub-lists into one sorted list.
8. Your program correctly prints the final sorted list.
9. Your program is well-written and styled (formatting, consistent indentation, comments, etc.). 
