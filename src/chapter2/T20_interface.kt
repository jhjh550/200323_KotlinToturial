package chapter2

//interface MyInterface3{
//    var prop:String
//
//    var prop1:String = "hello"
//
//    val prop2: String
//        get() = "hello"
//
//    val prop3: String
//        get() = field
//
//    val prop4: String
//        get() = "hello"
//        set(value){
//
//        }
//}

interface MyInterface{
    fun myFun1()
    var data1:String
}

interface MyInterface2{
    fun myFun2()
}

class MyImpl : MyShape(), MyInterface, MyInterface2{
    override fun myFun1() {}

    override var data1: String
        get() = "hello"
        set(value) {}

    override fun myFun2() {}

}