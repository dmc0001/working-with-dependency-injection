package com.anyandroid.usingdip

import javax.inject.Inject


class Shape @Inject constructor(
    private var square: Square,
    private var circle: Circle,
    private var rectangle: Rectangle
) {

    @Inject
    fun draw() {
        println("Drawing ...")
    }
}