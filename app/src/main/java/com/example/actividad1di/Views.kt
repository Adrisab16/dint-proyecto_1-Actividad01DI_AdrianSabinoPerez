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
import com.example.actividad1di.botonbackylinkaopgg.BotonBackYLinkAOpgg
import com.example.actividad1di.button.Button
import com.example.actividad1di.buttonfooter.ButtonFooter
import com.example.actividad1di.cabezera.Cabezera
import com.example.actividad1di.championcards.ChampionCards
import com.example.actividad1di.countersdelcampeon.CountersDelCampeon
import com.example.actividad1di.fichamorde.FichaMorde
import com.example.actividad1di.footer.Footer
import com.example.actividad1di.fotoinicioportada.FotoInicioPortada
import com.example.actividad1di.habilidadesdelcampeon.HabilidadesDelCampeon
import com.example.actividad1di.infolanes.InfoLanes
import com.example.actividad1di.infomorde.InfoMorde
import com.example.actividad1di.portada.Portada
import com.example.actividad1di.runasdelcampeon.RunasDelCampeon
import com.example.actividad1di.titulochampions.TituloChampions
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
        5->{seleccionCampeonTop()}
        6->{InfoMordekaiser()}
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
    val portada =  Portada(modifier = Modifier
        .fillMaxSize()
        .padding(top = 100.dp)
        .padding(end = 30.dp))
    Column {
        background
        portada
        Row { Cabezera(modifier = Modifier.fillMaxWidth()) }
        Row {
            androidx.compose.material3.Button(onClick = { buttonClick = 1 },
                modifier = Modifier
                    .padding(top = 300.dp)
                    .padding(start = 100.dp)
                    .width(200.dp)
                    .height(50.dp)) { Text(text = "Info Juego") }
        }
        Row {
            androidx.compose.material3.Button(onClick = { buttonClick = 2 },
                modifier = Modifier
                    .padding(top = 65.dp)
                    .padding(start = 100.dp)
                    .width(200.dp)
                    .height(50.dp)) { Text(text = "Campeones") }
        }
        Row {
            androidx.compose.material3.Button(onClick = { buttonClick = 3 },
                modifier = Modifier
                    .padding(top = 65.dp)
                    .padding(start = 100.dp)
                    .width(200.dp)
                    .height(50.dp)) { Text(text = "About me") }
        }

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
            androidx.compose.material3.Button(onClick = {buttonClick = 0},
                modifier = Modifier
                    .padding(top = 65.dp)
                    .padding(start = 100.dp)
                    .width(200.dp)
                    .height(60.dp)
            ) { Text(text = "Volver") }
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
    var buttonClick by remember { mutableIntStateOf(0) }
    Column {
        background
        Row { InfoLanes(modifier = Modifier
            .padding(start = 30.dp)
            .padding(top = 100.dp)
            .size(340.dp)) }
        Row {
            androidx.compose.material3.Button(onClick = { buttonClick = 5 },
                modifier = Modifier
                    .padding(top = 80.dp)
                    .padding(bottom = 100.dp)
                    .padding(start = 110.dp)
                    .width(200.dp)
                    .height(50.dp)) { Text(text = "CAMPEONES TOPLANE") }
        }
        Row {
            androidx.compose.material3.Button(onClick = { buttonClick = 3 },
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(200.dp)
                    .height(50.dp)) { Text(text = "Volver") }
        }
        Row { ButtonFooter(modifier = Modifier.fillMaxWidth())}
    }
    when(buttonClick){
        5->{Nav(5)}
        3->{Nav(3)}
    }
}

@Composable
fun seleccionCampeonTop(){
    var buttonClick by remember { mutableIntStateOf(0) }
    val background = BackgroundFichaCampeon()
    Column {
        background
        Row { Cabezera(modifier = Modifier.fillMaxWidth()) }
        Row { TituloChampions(modifier = Modifier
            .padding(top = 20.dp)
            .padding(start = 100.dp)) }
        Row { ChampionCards(modifier = Modifier
            .padding(top = 85.dp)
            .padding(start = 60.dp)) }
        Row {
            androidx.compose.material3.Button(onClick = { buttonClick = 6 }, modifier = Modifier
                .padding(top = 10.dp)
                .padding(start = 70.dp)) {
                Text(text = "Ver ficha Mordekaiser")
            }
            Row {
                androidx.compose.material3.Button(onClick = { buttonClick = 4 },modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(start = 10.dp)) {
                    Text(text = "Volver")
                }
            }
        }
    }
    when(buttonClick){
        4-> {Nav(4)}
        6-> {Nav(6)}
    }
}

@Composable
fun InfoMordekaiser(){
    var buttonClick by remember { mutableIntStateOf(0) }
    val background = BackgroundFichaCampeon()
    background
    LazyColumn {
        item {
            Cabezera(modifier = Modifier.fillMaxWidth())
        }
        item {
            FichaMorde(modifier = Modifier.fillMaxWidth())
        }
        item {
            InfoMorde(modifier = Modifier
                .padding(start = 60.dp)
                .padding(top = 20.dp))
        }
        item {
            HabilidadesDelCampeon(modifier = Modifier
                .padding(start = 50.dp))
        }
        item{
            RunasDelCampeon(modifier = Modifier
                .padding(start = 30.dp)
                .padding(top = 50.dp))
        }
        item{
            CountersDelCampeon(modifier = Modifier
                .padding(top = 20.dp))
        }
        item{
            Footer(modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth())
            Row {
                androidx.compose.material3.Button(onClick = { buttonClick = 5 },modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(start = 10.dp)) {
                    Text(text = "Volver")
                }
            }
        }
    }
    when(buttonClick){
        5-> {Nav(5)}
    }
}
