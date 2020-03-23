package chapter1

fun main() {
    // Array
    var array1 = arrayOf(1,2,3, "hello world")
    var array2:Array<Int> = arrayOf<Int>(1,2,3)

    array1[2]
    array1.get(2)

    // List
    var myList:List<String> = listOf("hello", "world")
    var myList2:MutableList<String>
            = mutableListOf("hello1")
    myList2.add("world1")
    myList2.add("world1")

    // Set
    val mySet = mutableSetOf<String>()
    mySet.add("hello")
    mySet.add("hello")
    println(mySet.elementAt(0))

    // Map
    val myMap = mutableMapOf<String, String>()
    myMap.put("one", "hello map")
    myMap["two"] = "hello kotlin"

    println(myMap.get("one"))
    println(myMap["two"])
}