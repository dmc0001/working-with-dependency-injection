package com.anyandroid.usingdip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val shape = DaggerShapeComponent.create()
        shape.draw()


    }
}