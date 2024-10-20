package com.equal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.equallibrary.EqualLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EqualLibrary.infoTech(this,"hey Ram")
    }
}