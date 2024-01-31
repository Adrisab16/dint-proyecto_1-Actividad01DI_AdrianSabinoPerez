package com.example.actividad1di.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.actividad1di.cabezera.Cabezera
import com.example.actividad1di.portada.Portada

@Composable
fun PortadaView(){
    Row(verticalAlignment = Alignment.Top){Cabezera(modifier = Modifier.fillMaxWidth())}

    Row(){Portada(modifier = Modifier.fillMaxSize())}
}