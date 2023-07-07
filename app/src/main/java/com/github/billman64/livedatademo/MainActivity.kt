package com.github.billman64.livedatademo


// based on tutorial at: https://needone.app/an-easy-example-on-how-to-use-viewmodel-and-livedata/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private var myViewModel: ViewModel?=null
    private var TAG:String="Running Order"
    private var btn1: Button?=null
    private var btn2: Button?=null
    private var textView: TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"onCreate()")

        myViewModel = ViewModelProvider(this)[myViewModel!!::class.java]

        btn1 = findViewById(R.id.plus_button)
        btn1 = findViewById(R.id.minus_button)
        textView = findViewById(R.id.output)

        myViewModel.getNum().o








    }
}
