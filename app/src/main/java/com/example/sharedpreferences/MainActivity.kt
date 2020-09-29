package com.example.sharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val accountRecored = AccountRecord(false,"w06@gmail.com","w")
        accountRecored.save(this)   //寫到SharedPreferences 內, 檔名是固定MyShared
        accountRecored.read(this)  //得到x,y,z值
        Log.d(TAG, "x,y,z: ${accountRecored.x},${accountRecored.y},${accountRecored.z}} ")

 /*           val sharedPreferences = getSharedPreferences("MyShared",Context.MODE_PRIVATE)          //檔名:MyShared.xml
            val editor = sharedPreferences.edit()
            editor.putBoolean("remeberme",true)
            editor.putString("sgAccount","w06@gmail.com")
            editor.putString("sgPasswordt","w")
            editor.apply()
        val x = sharedPreferences.getString("sgAccount","w1")
        val TAG ="myTag"
        Log.d(TAG, "x: $x") */

        }
    }
