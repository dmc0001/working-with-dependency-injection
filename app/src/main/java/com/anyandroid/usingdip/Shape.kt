package com.anyandroid.usingdip

class Shape(private var square: Square, private var circle: Circle, private var rectangle: Rectangle) {


    fun draw() {
        square.draw()
        circle.draw()
        rectangle.draw()
    }
}