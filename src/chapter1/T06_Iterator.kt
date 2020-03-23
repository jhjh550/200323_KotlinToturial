package chapter1

fun main() {
    /**
     * list iterator
     */
    val list1 = listOf("android", "hello", "world")
    val iterator = list1.iterator()
    while(iterator.hasNext()){
        val res = iterator.next()
        println(res)
    }
    /**
     * map iterator
     */
    val myMap = mapOf<String, String>(
        "one" to "hello",
        "two" to "world")
    val iteratorMap = myMap.iterator()
    while (iteratorMap.hasNext()){
        val res = iteratorMap.next()
        println("${res.key} / ${res.value}")
    }
}