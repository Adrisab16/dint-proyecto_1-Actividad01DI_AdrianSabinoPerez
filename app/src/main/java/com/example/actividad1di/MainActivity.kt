package com.example.actividad1di

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actividad1di.ui.theme.Actividad1DITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Actividad1DITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PortadaView()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    Actividad1DITheme {
        SeleccionRolView()
    }
}

/*
Aclaración: Estoy escribiendo esto a las 23:03 del 01/02/2024. El IDE en mi 
ordenador ha dejado de funcionar (se queda haciendo build de forma indefinida, 
ya que llevo 30 minutos esperando que termine de realizar el build), por lo 
que los últimos cambios los estoy haciendo a ciegas. Como el resto de compañeros 
tienen portátil, no les ocurre este error, ya que trabajan con el mismo portatil 
en su casa y en clase, no es mi caso, a mi me ocurren estos inconvenientes que me impiden 
seguir mi trabajo.

Quería hacer esta pequeña aclaración ya que los cambios a ciegas que estoy haciendo, 
los subiré a Github, el zip subido a Moodle solo contiene los cambios realizados hasta 
las 21:33 del 01/02/2024.
*/
