```groovy
def myMethod(List<Integer> numbers) {
  numbers.each { number ->
    if (number != null) {
      println number * 2
    } else {
      println "Null value encountered"
    }
  }
}

myMethod([1, 2, null, 4])
```