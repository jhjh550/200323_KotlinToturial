package chapter2

fun main() {
    val user = MyUser4()
    user.email = "abc@abc.com"
    println(user.name)
}


class MyUser4{
    val name: String by lazy { "helloworld" }
    lateinit var email:String
}