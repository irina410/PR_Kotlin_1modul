package com.example.pr_kotlin_1modul

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pr_kotlin_1modul.ui.theme.PR_Kotlin_1modulTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PR_Kotlin_1modulTheme {
                Box(modifier = Modifier.safeDrawingPadding()) {
                    //Hello(name = "Irina")
                    Hello(null)
                }
            }
        }
    }
}

@Composable
fun Hello(name: String?) {
    val message = if (name == null) "Имя не задано" else "Привет, $name!"
    Text(text = message)
}