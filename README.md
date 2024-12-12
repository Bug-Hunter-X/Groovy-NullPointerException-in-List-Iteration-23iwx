# Groovy NullPointerException in List Iteration

This repository demonstrates a common error in Groovy when dealing with lists containing null values.  The `each` method, while convenient, does not inherently handle null elements, leading to `NullPointerExceptions`.  This example showcases the problem and its solution.

## Bug Description
The `bug.groovy` file contains a method `myMethod` that iterates through a list of integers. If the list contains a `null` value, a `NullPointerException` is thrown because the `*` operator cannot be applied to a `null` value. 

## Solution
The `bugSolution.groovy` file provides a corrected version of `myMethod`, which explicitly checks for `null` values before performing the multiplication, thus avoiding the exception.