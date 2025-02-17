```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val obj = new MyClass()
println(obj.x) // Output: 0

class MyOtherClass(val x: Int) {
  def this(y: String) = this(y.length) //Correct auxiliary constructor
  def this() = this(0)//default value for x in case of no argument
}

val obj2 = new MyOtherClass("hello")
println(obj2.x) // Output: 5

val obj3 = new MyOtherClass()
println(obj3.x) // Output: 0

val obj4 = new MyOtherClass(5)
println(obj4.x) // Output:5
```