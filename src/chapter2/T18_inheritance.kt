package chapter2

fun main() {
    val rect = MyRect()
    rect.myPaint()

    val shape: MyShape = rect
    val rect2: MyRect = shape as MyRect
}

open class MyShape{
    var x:Int = 10
    open var y:Int = 20
    open fun myPaint(){
        println("location is $x $y")
    }
}

class MyRect: MyShape(){
    override var y = 200
    override fun myPaint(){
        println("rect location is $x $y")
    }
}