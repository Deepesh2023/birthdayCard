package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BirthdayCard(name = "Deepesh", from = "vaishnu", modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun BirthdayCard(modifier: Modifier = Modifier, name: String, from: String = "Kind Stranger") {
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Text(
            text = "Happy birthday $name",
            fontSize = 80.sp,
            lineHeight = 84.sp,
            textAlign = TextAlign.Center
        )

        Text(text = "from $from", fontSize = 36.sp, modifier = Modifier.padding(16.dp).align(alignment = Alignment.End))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        BirthdayCard(name = "Deepesh", modifier = Modifier.padding(8.dp))
    }
}