package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize().padding(16.dp)) { innerPadding ->
                    HappyBirthday(
                        nombre = "Angela",
                        nombre2 = "Víctor",
                        modifier = Modifier.padding(innerPadding),)
                }

            }
        }
    }
}

@Composable
fun HappyBirthday(nombre: String, nombre2: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(), //Column es para dar espacio entre los dos cuadros
        verticalArrangement = Arrangement.Center, // Centrar
        horizontalAlignment = Alignment.CenterHorizontally // Centrar
    ) {
        // Primer cuadro
        Surface(
            color = Color.Blue,
            modifier = Modifier.padding(8.dp)
        ) {                                  //color texto
            Text(text = "From $nombre", modifier = Modifier.padding(24.dp), color = Color.White)
        }
        // Segundo cuadro
        Surface(color = Color.Cyan, modifier = Modifier.padding(8.dp)) {
            Text(
                text = "HappyBirthday $nombre2",
                modifier = Modifier.padding(24.dp),
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HappyBirthdayPreview() {
    HappyBirthdayTheme {
        HappyBirthday("Angela","Victor")

    }
}