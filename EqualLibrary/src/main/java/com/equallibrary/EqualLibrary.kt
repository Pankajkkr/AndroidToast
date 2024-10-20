package com.equallibrary

import android.content.Context
import android.widget.Toast

object EqualLibrary {
    fun infoTech(context: Context, message: String, duration :Int = Toast.LENGTH_SHORT){
        Toast.makeText(context, message, duration).show()
    }
}