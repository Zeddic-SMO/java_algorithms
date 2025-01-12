# Explanation of `findPorcupineNumber` and `isPrime` Functions

## Function: `findPorcupineNumber`

The `findPorcupineNumber` function finds the first porcupine number greater than a given integer `n`. A porcupine number is defined as:

1. A prime number.
2. Ends with the digit `9`.
3. The next prime number following it also ends with the digit `9`.

### Steps:

1. **Start Searching:**
   - Begin with the number `n + 1`.
2. **Check if a Number is Prime:**
   - Use the helper function `isPrime` to determine whether a number is prime.
3. **Check Last Digit:**
   - Use modulo base 10 arithmetic (`num % 10 == 9`) to check if the number ends in `9`.
4. **Find the Next Prime:**
   - Once a prime ending in `9` is found, continue searching for the next prime.
   - Verify that the next prime also ends in `9`.
5. **Return the Porcupine Number:**
   - If both conditions are satisfied, return the first porcupine number.

---

## Example Test Cases

### Example 1:

#### Input:

```java
int n = 0;
```

#### Output:

```java
139
```

#### Explanation:

- Start searching from `1`.
- The first prime number ending in `9` is `139`.
- The next prime after `139` is `149`, which also ends in `9`.
- Therefore, `139` is the first porcupine number.

---

### Example 2:

#### Input:

```java
int n = 138;
```

#### Output:

```java
139
```

#### Explanation:

- Start searching from `139`.
- `139` satisfies all conditions, so it is the first porcupine number.

---

### Example 3:

#### Input:

```java
int n = 139;
```

#### Output:

```java
409
```

#### Explanation:

- Start searching from `140`.
- The first prime ending in `9` after `139` is `409`.
- The next prime after `409` is `419`, which also ends in `9`.
- Therefore, `409` is the next porcupine number.

---

## Helper Function: `isPrime`

The `isPrime` function determines whether a number is a prime number.

### Steps:

1. **Input Validation:**
   - Numbers less than 2 are not prime.
2. **Iterative Check:**
   - Iterate from `2` to the square root of the number.
   - If the number is divisible by any value in this range, it is not prime.
3. **Return Value:**
   - Return `true` if the number is prime, otherwise return `false`.

---

### Example for `isPrime` Function:

#### Input:

```java
isPrime(7);
```

#### Output:

```java
true
```

#### Input:

```java
isPrime(8);
```

#### Output:

```java
false
```

---

This markdown file explains the concept of porcupine numbers and provides test cases along with the helper function `isPrime` to support the main logic.
