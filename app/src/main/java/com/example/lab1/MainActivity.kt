package com.example.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1.ui.theme.Lab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*println("Hello World")

        val s : String = "Hello World"
        println(s)


        var sum : Int = 0
        for(i in 1..5) {
            sum += i
        }
        println(sum)*/

        calcSum()
    }

    fun calcSum() : Unit {
        var sum: Int = 0
        for (i in 1..5) {
            sum += i
        }
        println(sum)
    }

    fun createSum(start:Int, end:Int) : Int {
        var sum = 0;

    }
}