```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Inputs cannot be null") // Or return a more suitable default value
  }
  return a + b
}

println calculate(5, 3) // Output: 8
println calculate(null, 3) // Output: Exception
println calculate(5, null) // Output: Exception
println calculate(null, null) // Output: Exception
```