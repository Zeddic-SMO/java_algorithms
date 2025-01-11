# Step-by-Step Explanation for `isInertial`

## Function Definition

The goal of the function `isInertial` is to determine if an array satisfies the properties of an inertial array. An array is inertial if it meets the following conditions:

1. **Contains at least one odd value**:

   - At least one element of the array must be an odd number.

2. **Maximum value is even**:

   - The largest number in the array must be even.

3. **Odd values are greater than even values (except the maximum)**:
   - Every odd value in the array must be greater than every even value that is not the maximum value.

If all three conditions are met, the function returns `1`. Otherwise, it returns `0`.

---

## Implementation Steps

### Step 1: Check if the Array Contains at Least One Odd Value

1. Iterate through the array.
2. If any element is odd (i.e., `element % 2 != 0`), proceed to the next step. Otherwise, return `0`.

### Step 2: Find the Maximum Value

1. Initialize a variable `maxValue` to store the largest number in the array.
2. Iterate through the array and update `maxValue` whenever a larger number is found.
3. Verify that `maxValue` is even (i.e., `maxValue % 2 == 0`). If not, return `0`.

### Step 3: Verify the Relationship Between Odd and Non-Maximum Even Values

1. Create a list of all odd values in the array.
2. Create a list of all even values in the array, excluding the `maxValue`.
3. Check if every odd value is greater than every even value in the second list.
4. If this condition is violated, return `0`.
5. If all conditions are satisfied, return `1`.

---

## Example Walkthrough

### Test Case 1: `{11, 4, 20, 9, 2, 8}`

#### Step 1: Check for Odd Values

- Odd values: `{11, 9}` (valid).

#### Step 2: Find the Maximum Value

- Maximum value: `20` (even, valid).

#### Step 3: Verify Odd and Non-Maximum Even Values

- Odd values: `{11, 9}`.
- Non-maximum even values: `{4, 2, 8}`.
- Check:
  - `11 > 4, 11 > 2, 11 > 8`
  - `9 > 4, 9 > 2, 9 > 8`
- **Output: `1`** (Valid Inertial Array).

---

### Test Case 2: `{12, 11, 4, 9, 2, 3, 10}`

#### Step 1: Check for Odd Values

- Odd values: `{11, 9, 3}` (valid).

#### Step 2: Find the Maximum Value

- Maximum value: `12` (even, valid).

#### Step 3: Verify Odd and Non-Maximum Even Values

- Odd values: `{11, 9, 3}`.
- Non-maximum even values: `{4, 2, 10}`.
- Check:
  - `11 > 4, 11 > 2, 11 > 10`
  - `9 > 4, 9 > 2, 9 < 10` (fails).
- **Output: `0`** (Not an Inertial Array).

---

### Test Case 3: `{1, 2, 3, 4}`

#### Step 1: Check for Odd Values

- Odd values: `{1, 3}` (valid).

#### Step 2: Find the Maximum Value

- Maximum value: `4` (even, valid).

#### Step 3: Verify Odd and Non-Maximum Even Values

- Odd values: `{1, 3}`.
- Non-maximum even values: `{2}`.
- Check:
  - `1 < 2` (fails).
  - `3 > 2`.
- **Output: `0`** (Not an Inertial Array).

---

### Test Case 4: `{2, 12, 4, 6, 8, 10}`

#### Step 1: Check for Odd Values

- Odd values: `{}` (none).
- **Output: `0`** (Not an Inertial Array).

---

## Summary

1. Verify the presence of at least one odd value.
2. Ensure the maximum value is even.
3. Check that all odd values are greater than all non-maximum even values.
4. If all conditions are satisfied, the array is inertial.
