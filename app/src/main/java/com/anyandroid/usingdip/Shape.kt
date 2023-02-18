package com.anyandroid.usingdip

class Shape {
    var square: Square
    var circle: Circle
    var rectangle: Rectangle
    init {
        square = Square()
        circle = Circle()
        rectangle = Rectangle()
    }
    fun draw() {
        square.draw()
        circle.draw()
        rectangle.draw()
    }
}