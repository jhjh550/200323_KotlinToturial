package chapter3

import java.lang.Exception

fun main() {
    myFun("hello")
    //"hello".toInt()
}

fun myFun(myVal:String):Int{
    val result:Int = try{
        println(myVal)
        myVal.toInt()
    }catch (e:Exception){
        println(e.toString())
        e.printStackTrace()
        0
    }finally {
        println("hello filnally")
    }


    return result
}