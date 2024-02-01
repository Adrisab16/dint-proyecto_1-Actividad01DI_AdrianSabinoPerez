package com.example.actividad1di

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.actividad1di.backgroundfichacampeon.BackgroundFichaCampeon
import com.example.actividad1di.button.Button
import com.example.actividad1di.cabezera.Cabezera
import com.example.actividad1di.fichamorde.FichaMorde
import com.example.actividad1di.fotoinicioportada.FotoInicioPortada
import com.example.actividad1di.habilidadesdelcampeon.HabilidadesDelCampeon
import com.example.actividad1di.infolanes.InfoLanes
import com.example.actividad1di.infomorde.InfoMorde
import com.example.actividad1di.portada.Portada
import com.example.actividad1di.tituloseleccionderol.TituloSeleccionDeRol

var count: Int = 0

@Composable
fun Nav(count:Int){
    var nav by remember { mutableIntStateOf(0) }
    nav = count
    when(nav){
        0->{PortadaView()}
        1->{}
        2->{SeleccionRolView()}
        3->{}
        4->{InfoTop()}
        5->{}
        6->{}
        7->{}
        8->{}
        9->{}
        10->{InfoMordekaiser()}
    }
}


@Composable
fun PortadaView(){
    var buttonClick by remember { mutableIntStateOf(0) }
    val background = BackgroundFichaCampeon()
    Column {
        background
        Row { Cabezera(modifier = Modifier.fillMaxWidth()) }
        Row { Portada(modifier = Modifier.fillMaxSize()) }
    }
    when(buttonClick){
        1 -> {}
        2 -> {Nav(2)}
        3 -> {}
    }
}

@Composable
fun SeleccionRolView(){
    var buttonClick by remember { mutableIntStateOf(0) }
    val background = BackgroundFichaCampeon()
    Column {
        background
        Row{Cabezera(modifier = Modifier.fillMaxWidth())}
        Row{TituloSeleccionDeRol(
            Modifier
                .padding(top = 30.dp)
                .padding(start = 53.dp))}
        Row {
            androidx.compose.material3.Button(onClick = {buttonClick = 4},
                modifier = Modifier
                    .padding(top = 65.dp)
                    .padding(start = 100.dp)
                    .width(200.dp)
                    .height(60.dp)
                ) { Text(text = "TOPLANE") }
        }
        Row {
            androidx.compose.material3.Button(onClick = {buttonClick = 5},
                modifier = Modifier
                    .padding(top = 65.dp)
                    .padding(start = 100.dp)
                    .width(200.dp)
                    .height(60.dp)
            ) { Text(text = "JUNGLE") }
        }
        Row {
            androidx.compose.material3.Button(onClick = {buttonClick = 6},
                modifier = Modifier
                    .padding(top = 65.dp)
                    .padding(start = 100.dp)
                    .width(200.dp)
                    .height(60.dp)
            ) { Text(text = "MIDLANE") }
        }
        Row {
            androidx.compose.material3.Button(onClick = {buttonClick = 7},
                modifier = Modifier
                    .padding(top = 65.dp)
                    .padding(start = 100.dp)
                    .width(200.dp)
                    .height(60.dp)
            ) { Text(text = "BOTLANE") }
        }
        Row {
            androidx.compose.material3.Button(onClick = {buttonClick = 8},
                modifier = Modifier
                    .padding(top = 65.dp)
                    .padding(start = 100.dp)
                    .width(200.dp)
                    .height(60.dp)
            ) { Text(text = "SUPPORT") }
        }
    }
    when(buttonClick){
        4 -> { Nav(4)}
        5 -> {}
        6 -> {}
        7 -> {}
        8 -> {}
    }

}

@Composable
fun InfoTop(){
    val background = BackgroundFichaCampeon()
    Column {
        background
        Row { InfoLanes(modifier = Modifier.fillMaxSize()) }
    }
}

@Composable
fun SeleccionCampeon(){
    var buttonClick by remember { mutableIntStateOf(0) }
    val background = BackgroundFichaCampeon()
    Column {
        background
        Row { Cabezera(modifier = Modifier.fillMaxWidth()) }
    }
}

@Composable
fun seleccionCampeonTop(){
    var buttonClick by remember { mutableIntStateOf(0) }
    val background = BackgroundFichaCampeon()
    Column {
        background
        Row { Cabezera(modifier = Modifier.fillMaxWidth()) }
    }
}

@Composable
fun InfoMordekaiser(){
    var buttonClick by remember { mutableIntStateOf(0) }
    val background = BackgroundFichaCampeon()
    Column {
        background
        Row { Cabezera(modifier = Modifier.fillMaxWidth()) }
        Row {
            FichaMorde(modifier = Modifier.fillMaxWidth())
        }
        Row {
            InfoMorde(modifier = Modifier
                .padding(start = 60.dp)
                .padding(top = 20.dp))
        }
        Row {
            HabilidadesDelCampeon(modifier = Modifier
                .padding(start = 50.dp))
        }
    }
}

// Scroll vertical, superposicion de paginas y boton dentro de un layout (como se activa), desposicion en figma, error orden de habiliades