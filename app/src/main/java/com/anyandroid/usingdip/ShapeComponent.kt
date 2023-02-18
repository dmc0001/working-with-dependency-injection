package com.anyandroid.usingdip

import dagger.Component

@Component
interface ShapeComponent {
    fun getShape(): Shape
}