package chapter2

fun main() {
    val obj = MyOuter.MyNested()
    obj.myFun()

    val obj2 = MyOuter()
    val obj3 = obj2.MyInner()
}

class MyOuter{
    var no = 10
    val temp = MyInner()
    fun hello(){
        temp.myFun()
    }

    inner class MyInner{
        val name = "hello"
        fun myFun(){
            println("inner class $name $no")
        }
    }
    class MyNested{
        val name = "world"
        fun myFun(){
            println("nested class $name ")//$no")
        }
    }
}