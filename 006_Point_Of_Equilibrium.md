# Point of Equilibrium (POE)

## Definition

The **Point of Equilibrium (POE)** in an array is an index `idx` where the sum of all elements to the **left** of `idx` is equal to the sum of all elements to the **right** of `idx`.

Formally, for an array `a` with `n` elements, an index `idx` is considered a POE if:

a[0] + a[1] + ... + a[idx - 1] == a[idx + 1] + a[idx + 2] + ... + a[n - 1]

### Example 1: Array [1, 2, 3, 4, 6]

For the array `a = [1, 2, 3, 4, 6]`:

- **Index `idx = 3`** is the POE (Point of Equality) because:

  - **Left sum**: `a[0] + a[1] + a[2] = 1 + 2 + 3 = 6`
  - **Right sum**: `a[4] = 6`

Since `6 == 6`, the POE is at `idx = 3`.

# Point of Equilibrium (POE) algorithm examples

## Example 1: Array `a = [1, 2, 3, 4, 6]`

### Initial Setup:

- `leftSumPointer = 0`, `rightSumPointer = 4`
- `leftSum = a[0] = 1`, `rightSum = a[4] = 6`
- `assumedPOEIdx = 1`

### Iteration 1 (`i = 1`):

- **Before Update:**
  - `leftSum = 1`, `rightSum = 6`
- Since `leftSum < rightSum`:
  - Increment `leftSumPointer` → `leftSumPointer = 1`
  - Update `leftSum` → `leftSum = 1 + a[1] = 1 + 2 = 3`
  - Update `assumedPOEIdx = leftSumPointer + 1 = 2`

### Iteration 2 (`i = 2`):

- **Before Update:**
  - `leftSum = 3`, `rightSum = 6`
- Since `leftSum < rightSum`:
  - Increment `leftSumPointer` → `leftSumPointer = 2`
  - Update `leftSum` → `leftSum = 3 + a[2] = 3 + 3 = 6`
  - Update `assumedPOEIdx = leftSumPointer + 1 = 3`

### Final Check:

- `leftSum = rightSum = 6`, so return `assumedPOEIdx = 3`.

**Result:** POE is at **index 3**.

---

## Example 2: Array `a = [10, 5, 5]`

### Initial Setup:

- `leftSumPointer = 0`, `rightSumPointer = 2`
- `leftSum = a[0] = 10`, `rightSum = a[2] = 5`
- `assumedPOEIdx = 1`

### Iteration 1 (`i = 1`):

- **Before Update:**
  - `leftSum = 10`, `rightSum = 5`
- Since `leftSum > rightSum`:
  - Decrement `rightSumPointer` → `rightSumPointer = 1`
  - Update `rightSum` → `rightSum = 5 + a[1] = 5 + 5 = 10`
  - Update `assumedPOEIdx = rightSumPointer - 1 = 0`

### Final Check:

- `leftSum = rightSum = 10`, so return `assumedPOEIdx = 0`.

**Result:** POE is at **index 0**.

---

## Example 3: Array `a = [1, 2, 1, 2, 1]`

### Initial Setup:

- `leftSumPointer = 0`, `rightSumPointer = 4`
- `leftSum = a[0] = 1`, `rightSum = a[4] = 1`
- `assumedPOEIdx = 1`

### Iteration 1 (`i = 1`):

- **Before Update:**
  - `leftSum = 1`, `rightSum = 1`
- Since `leftSum >= rightSum`:
  - Decrement `rightSumPointer` → `rightSumPointer = 3`
  - Update `rightSum` → `rightSum = 1 + a[3] = 1 + 2 = 3`
  - Update `assumedPOEIdx = rightSumPointer - 1 = 2`

### Iteration 2 (`i = 2`):

- **Before Update:**
  - `leftSum = 1`, `rightSum = 3`
- Since `leftSum < rightSum`:
  - Increment `leftSumPointer` → `leftSumPointer = 1`
  - Update `leftSum` → `leftSum = 1 + a[1] = 1 + 2 = 3`
  - Update `assumedPOEIdx = leftSumPointer + 1 = 2`

### Final Check:

- `leftSum = rightSum = 3`, so return `assumedPOEIdx = 2`.

**Result:** POE is at **index 2**.

```

```
