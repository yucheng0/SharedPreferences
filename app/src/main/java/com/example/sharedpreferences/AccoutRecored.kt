package com.example.sharedpreferences

import android.content.Context
import android.util.Log
val TAG = "myTag"
class AccountRecord(var remeberme:Boolean, var sgAccount:String, var sgPassword:String) {

fun save(context: Context){
    val sharedPreferences  = context.getSharedPreferences("MyShared", Context.MODE_PRIVATE)
    Log.d(TAG, "sharedPreferencesSave: ${sharedPreferences}")
    val editor = sharedPreferences.edit()
    editor.putBoolean("remeberme",remeberme)
    editor.putString("sgAccount",sgAccount)
    editor.putString("sgPassword",sgPassword)
    editor.apply()
}
    fun read(context: Context) {
        val sharedPreferences  = context.getSharedPreferences("MyShared", Context.MODE_PRIVATE)
        Log.d(TAG, "sharedPreferencesRead: ${sharedPreferences}")
       val x = sharedPreferences.getBoolean("remeberme",true)
        val y = sharedPreferences.getString("sgAccount", "0")
        val z = sharedPreferences.getString("sgPassword","0")

        Log.d(TAG, "x,y,z: ${x},${y},${z}} ")
    }
}