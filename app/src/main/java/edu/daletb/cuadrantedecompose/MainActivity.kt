package edu.daletb.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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
                bakckground = Color(0xFFEADDFF)
            )
            TarjetaComposable(
                title = stringResource(R.string.titulo_imagen_composable) ,
                description = stringResource(R.string.descripcion_imagen_composable),
                bakckground = Color(0xFFD0BCFF)
            )
            TarjetaComposable(
                title = stringResource(R.string.titulo_fila_composable),
                description = stringResource(R.string.descripcion_fila_composable) ,
                bakckground = Color(0xFFB69DF8)
            )
            TarjetaComposable(
                title = stringResource(R.string.titulo_columna_composable) ,
                description = stringResource(R.string.descripcion_columna_composable),
                bakckground = Color(0xFFF6EDFF)
            )

        }
    }
}

@Composable
fun TarjetaComposable(
    title : String,
    description : String,
    bakckground : Color,
    modifier : Modifier = Modifier
){

}
@Preview(showBackground = true)
@Composable
fun VistaPreviaCuadranteCompose() {
    CuadranteDeComposeTheme {
        AppCuadranteCompose()
    }
}