package chapter2

fun main() {
    val obj1 = object {
        var no:Int = 10
        fun myFun(){
            println("hello world")
        }
    }
    obj1.myFun()

    MyClass8.myFun()
}

class MyClass8{
    companion object{
        fun myFun(){
            println("companion object myFun")
        }
    }
}

open class SomeClass{
    fun someClassFun(){
        println("some class function")
    }
}
interface SomeInterface{
    fun someInterfaceFun()
}
val obj3: SomeClass = object : SomeClass(), SomeInterface{
    override fun someInterfaceFun() {
    }
}


