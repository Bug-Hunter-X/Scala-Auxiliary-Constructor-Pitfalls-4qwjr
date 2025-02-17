```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val obj = new MyClass()
println(obj.x) // Output: 0

class MyOtherClass(val x: Int) {
  def this(y:String) = this(y.length) //Error prone Auxiliary constructor 
}

val obj2 = new MyOtherClass("hello")
println(obj2.x) //Output:5

val obj3 = new MyOtherClass(5) //compiler error
println(obj3.x)
```