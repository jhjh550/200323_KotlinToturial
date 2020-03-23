package chapter2

/**
 * primary constructor
 */
class MyClass2{ }
class MyClass3(){ }
class MyClass4 constructor() { }

class MyClass5(private val name:String){
    fun sayHello(){
        println("hello $name")
    }
}

class MyClass6 constructor(name:String, age:Int = 0){
    private val myName = name
    init {
        println(name)
    }
    fun sayHello(){
        println("hello $myName")
    }
}



fun main() {
    val myVal2 = MyClass2()
    val myVal3 = MyClass3()
    val myVal4 = MyClass4()
}

