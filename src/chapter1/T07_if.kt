package chapter1

fun main() {
    val a = 5
    val myVal = if ( a==3 ){
        println("world")
        100
    } else{
        println("hello")
        200
    }
    println(myVal)
    //int myVal = a == 3 ? 100 : 200;
}