package edu.daletb.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.daletb.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppCuadranteCompose()
                }
            }
        }
    }
}

@Composable
fun AppCuadranteCompose() {
    Column(Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)){
            TarjetaComposable(
                title = stringResource(R.string.titulo_texto_composable),
                description = stringResource(R.string.descripcion_texto_composable),
                background = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            TarjetaComposable(
                title = stringResource(R.string.titulo_imagen_composable) ,
                description = stringResource(R.string.descripcion_imagen_composable),
                background = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)){
            TarjetaComposable(
                title = stringResource(R.string.titulo_fila_composable),
                description = stringResource(R.string.descripcion_fila_composable) ,
                background = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            TarjetaComposable(
                title = stringResource(R.string.titulo_columna_composable) ,
                description = stringResource(R.string.descripcion_columna_composable),
                background = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun TarjetaComposable(
    title : String,
    description : String,
    background : Color,
    modifier : Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaCuadranteCompose() {
    CuadranteDeComposeTheme {
        AppCuadranteCompose()
    }
}