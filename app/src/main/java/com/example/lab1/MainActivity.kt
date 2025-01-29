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
        println(sum)

        calcSum()
    }

    fun calcSum(start:Int, end:Int) : Int {
        var sum: Int = 0
        for (i in start..end) {
            sum += i
        }
        return sum;
        }

        println(calcSum(0, 5))

        val e: Employee = Employee()
        e.id = 1234
        e.name = "John Smith"
        println("ID: " + e.id)
        println("Name: " + e.name)


        var e1:Employee = Employee()
        var e2:Employee = Employee()
        var e3:Employee = Employee()

        for(i in listOf<Employee>(e1,e2)) {
            println(i)
        }

        for(i in listOf<Employee>(e3)) {
            println(i)
        }*/


      listOf<Employee>()

        var e1:Employee = Employee()
        var e2:Employee = Employee()
        var e3:Employee = Employee()

       for (i in listOf<Employee>(e1,e2,e3)){
           println(i)
       }
    }
}