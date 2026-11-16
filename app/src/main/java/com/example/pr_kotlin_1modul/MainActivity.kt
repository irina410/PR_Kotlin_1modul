package com.example.pr_kotlin_1modul

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun HelloPreviewPortrait() {
    Button(
        onClick = { /* действие */ },
        modifier = Modifier
            .fillMaxWidth()
            .shadow(4.dp, RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Gray),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        )
    ) {
        Text(text = "Нажми меня", color = Color.Black)
    }
}

@Preview(name = "landscape", showSystemUi = true, device = "spec:orientation=landscape,width=411dp,height=891dp")
@Composable
fun HelloPreviewLandscape() {
    Hello("Android")
}

@Preview(
    name = "round",
    showSystemUi = true,
    showBackground = true,
    backgroundColor = 0xFFFFFF00,
    device = "spec:width=200dp,height=200dp,isRound=true"
)
@Composable
fun HelloPreviewRound() {
    Hello("Android")
}

