package com.example.day_11

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.day_11.ui.theme.Day11Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifecycleCheck","OnCreate")
        enableEdgeToEdge()
        setContent {
            Day11Theme {
                Scaffold (modifier = Modifier.fillMaxSize()){ innerPadding ->
                    Text(
                        text = "Hello, Android!",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("LifecycleCheck","OnStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("LifecycleCheck","OnResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("LifecycleCheck","OnPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("LifecycleCheck","OnStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifecycleCheck","OnDestroy")
    }
}
