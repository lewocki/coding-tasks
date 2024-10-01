# This is a repo with tech tasks from interview for Automation QA Engineer (Java)

## 1. FizzBuzz

Given a number 'n', for each integer 1 to n (inclusive) print one value per line as follows:
  - if 'i' is a multiple of both 3 and 5 => FizzBuzz
  - if 'i' is a multiple of 3 (but not 5) => Fizz
  - if 'i' is a multiple of 5 (but not 3) => Buzz
  - if not multiple 3 or 5 => print i value.

### Constrains: 0 < n < 2*10^5

### SOLUTION:
[FizzBuzz solution](src/main/java/org/example/fizzbuzz/FizzBuzz.java)

## 2. Invert String
Invert the provided string.

input: "Hello world!"
output: "!dlrow olleH"

### SOLUTION:
[String Inverter](src/main/java/org/example/string/StringInverter.java)

## 3. Find all leader in an array
```
Write a program to collect all the leaders in the array. 
An element is a Leader if it is greater than all the elements to its right side.
Note: The rightmost element is always a leader.

Input: inputArr[] = { 16, 17, 4, 3, 5, 2 }
Output: outputArr[] = { 17, 5, 2 }
```
### SOLUTION:
[Leaders solution](src/main/java/org/example/array/Leaders.java)

## 4. Lonely integer

Given an array of integers, where all elements but one occur twice, find the unique element.

### Example:
a = [1,2,3,4,3,2,1]
The unique element is 4.

### Function Description
Complete the `lonelyinteger` function in the editor below.
`lonelyinteger` has the following parameter(s):
- `int a[n]`: an array of integers

### Returns
- `int`: the element that occurs only once

### Input Format
- The first line contains a single integer, `n`, the number of integers in the array.
- The second line contains `n` space-separated integers that describe the values in `a`.

### Constraints:
- `1 < = n < 100`
- It is guaranteed that  is an odd number and that there is one unique element.
- `0 <= a[i] <= 100`, where `0 <= i < n`.

### SOLUTION:
[LonelyInteger](src/main/java/org/example/array/LonelyInteger.java)