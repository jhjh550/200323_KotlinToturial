package chapter3

import java.lang.Exception

fun main() {

}

fun myFun(myVal:String):Int{
    val result:Int = try{
        println(myVal)
        myVal.toInt()
    }catch (e:Exception){
        println("${e.toString()}")
        0
    }finally {
        println("hello filnally")
    }


    return result
}