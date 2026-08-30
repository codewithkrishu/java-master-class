# Level 12 - Generics Practice

This folder contains Java practice programs based on Generics and related concepts.

## Programs

### Problem 01 - Generic Class
Create a generic class that can store and return different types of values.

**Concepts Used:**
- Generic Class
- Type Parameter `<T>`
- Constructor
- Generic return type

---

### Problem 02 - Generic Method
Create a generic method that can print elements of different array types.

**Concepts Used:**
- Generic Method
- Type Parameter `<T>`
- Arrays
- Enhanced for loop

---

### Problem 03 - Generic Pair
Create a generic Pair class that can store two different types of values.

**Concepts Used:**
- Multiple Type Parameters
- `<T, U>`
- Generic Class
- Constructor
- Methods

---

### Problem 04 - Bounded Generic
Create a generic class that accepts only types extending `Number`.

**Concepts Used:**
- Bounded Type Parameter
- `extends Number`
- Generic Class
- Type Restriction

---

### Problem 05 - Wildcard
Create a method that can accept a List of any type using the wildcard `<?>`.

**Concepts Used:**
- Wildcard
- `<?>`
- List
- Generic Method
- Enhanced for loop

---

### Problem 06 - Super Integer
Use `<? super Integer>` to add Integer values into a list.

**Concepts Used:**
- Lower Bounded Wildcard
- `<? super Integer>`
- List
- `add()`

---

### Problem 07 - Super Recall
Practice the `super` wildcard by adding Integer values to a compatible list.

**Concepts Used:**
- Lower Bounded Wildcard
- `<? super Integer>`
- List
- Generic Collections

---

### Problem 08 - Generic Number Calculator
Create a generic method that accepts only Number types.

**Concepts Used:**
- Bounded Generic Method
- `<T extends Number>`
- Integer
- Float
- Double

---

### Problem 09 - Generic Method with Two Types
Create a generic method that accepts two different types.

**Concepts Used:**
- Multiple Type Parameters
- `<T, U>`
- Generic Method
- Type Flexibility

---

### Problem 10 - Find Maximum
Create a generic method to find the greater value between two comparable values.

**Concepts Used:**
- Bounded Generic
- `Comparable<T>`
- `compareTo()`
- Generic Method
- Comparison

---

### Problem 11 - PECS Practice
Copy elements from a producer list to a consumer list using PECS.

**Concepts Used:**
- PECS
- `? extends`
- `? super`
- Source and Destination
- List
- `Arrays.asList()`
- Enhanced for loop

---

### Problem 12 - Generic Inheritance
Create a generic parent class and extend it using a bounded generic child class.

**Concepts Used:**
- Generic Class
- Generic Inheritance
- `extends`
- Bounded Type Parameter
- `super()`

---

### Problem 13 - Raw Types
Practice Raw Types by using a collection without specifying its generic type.

**Concepts Used:**
- Raw Type
- ArrayList
- Multiple Data Types
- Type Safety

> Raw Types are used here for learning purposes. In normal Java programming, parameterized types should be preferred.

---

### Problem 14 - Type Erasure
Understand the basic concept of Type Erasure in Java Generics.

**Concepts Used:**
- Generics
- Compile-time Type Checking
- Type Erasure
- Runtime behavior

---

## Concepts Covered

- Generic Classes
- Generic Methods
- Generic Pair
- Multiple Type Parameters
- Bounded Generics
- Wildcards
- Upper Bounded Wildcard
- Lower Bounded Wildcard
- `extends`
- `super`
- PECS
- Comparable
- `compareTo()`
- Generic Inheritance
- Raw Types
- Type Erasure
- Type Safety
