package chapter3

fun main() {
    val user:MyUser2? = MyUser2()

    val city1 = if(user != null){
        if(user.address != null){
            user.address.city
        }else{
            null
        }
    }else{
        null
    }

    val city2 = user?.address?.city
    println(city2)

    val temp:Int? = null
    val temp2:Int = temp ?: 0
    println(temp2)

    val str = "kotlin"
    val myInt = str as? Int
    println(myInt)

}
class MyAddress{
    val city:String? = "seoul"
}
class MyUser2{
    val address:MyAddress? = null//MyAddress()
}