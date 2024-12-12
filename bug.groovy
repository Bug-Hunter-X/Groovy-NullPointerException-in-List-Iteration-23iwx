```groovy
def myMethod(List<Integer> numbers) {
  numbers.each { number ->
    if (number == null) {
      throw new NullPointerException("Number cannot be null")
    }
    println number * 2
  }
}

myMethod([1, 2, null, 4])
```