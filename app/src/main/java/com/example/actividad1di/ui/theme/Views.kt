package com.example.actividad1di.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.actividad1di.cabezera.Cabezera
import com.example.actividad1di.portada.Portada
import com.example.actividad1di.tituloseleccionderol.TituloSeleccionDeRol

var nav = 0
@Composable
fun Nav(){
    when(nav){
        1->{PortadaView()}
        2->{SeleccionRolView()}
    }
}


@Composable
fun PortadaView(){
    Row { Cabezera(modifier = Modifier.fillMaxWidth()) }
}

@Composable
fun SeleccionRolView(){
    Row {Cabezera(modifier = Modifier.fillMaxWidth())}
    Row {TituloSeleccionDeRol(modifier = Modifier.fillMaxSize())}
}