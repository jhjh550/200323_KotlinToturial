package chapter1

fun main() {
    val str1:Char = 'c'
    val str2:String = "c"
    val str3 = """A modern programming language
that makes developers happier.
Open source forever""".trimMargin()
    val str4 = "A modern programming language\n" +
            "that makes developers happier.\n" +
            "Open source forever"

    val myVal = 10
    println("hello "+(myVal+20))
    println("hello ${sum(myVal, 20)}")

    getLength("hello world")
    getLength(100)
}

/**
 * string 입력시 문자열 길이 리턴, 그외에는 0 리턴
 */
fun getLength(myVal: Any):Int{
    if(myVal is String){ // instanceof
        return myVal.length
    }
    return 0
}




