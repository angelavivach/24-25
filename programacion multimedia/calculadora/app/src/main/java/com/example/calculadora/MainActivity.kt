package com.example.Calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.tooling.preview.Preview
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    TipTimeLayout()
                }
            }
        }
    }
}

@Composable
fun TipTimeLayout() {
    var cantidadInput by remember { mutableStateOf("") }
    var propinaInput by remember { mutableStateOf("") }
    var redondear by remember { mutableStateOf(false) }

    val cantidad = cantidadInput.toDoubleOrNull() ?: 0.0
    val porcentajePropina = propinaInput.toDoubleOrNull() ?: 0.0
    val propina = calcularPropina(cantidad, porcentajePropina, redondear)

    Column(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)

            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.calcular_propina),
            modifier = Modifier
                .padding(bottom = 16.dp, top = 40.dp)
                .align(alignment = Alignment.Start)
        )
        EditNumberField(
            label = R.string.cantidad_factura,
            leadingIcon = R.drawable.dinero,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            value = cantidadInput,
            onValueChanged = { cantidadInput = it },
            modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth(),
        )
        EditNumberField(
            label = R.string.como_fue_el_servicio,
            leadingIcon = R.drawable.porcentaje,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            value = propinaInput,
            onValueChanged = { propinaInput = it },
            modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth(),
        )
        RedondearPropinaFila(
            redondear = redondear,
            onRedondearCambiado = { redondear = it },
            modifier = Modifier.padding(bottom = 32.dp)
        )
        Text(
            text = stringResource(R.string.monto_propina, propina),
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.height(150.dp))
    }
}

@Composable
fun EditNumberField(
    label: Int,
    leadingIcon: Int,
    keyboardOptions: KeyboardOptions,
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = value,
        singleLine = true,
        leadingIcon = { Icon(painter = painterResource(id = leadingIcon), null) },
        modifier = modifier,
        onValueChange = onValueChanged,
        label = { Text(stringResource(label)) },
        keyboardOptions = keyboardOptions
    )
}

@Composable
fun RedondearPropinaFila(
    redondear: Boolean,
    onRedondearCambiado: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = stringResource(R.string.redondear_propina))
        Switch(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End),
            checked = redondear,
            onCheckedChange = onRedondearCambiado
        )
    }
}

private fun calcularPropina(cantidad: Double, porcentajePropina: Double = 15.0, redondear: Boolean): String {
    var propina = porcentajePropina / 100 * cantidad
    if (redondear) {
        propina = ceil(propina)
    }
    return NumberFormat.getCurrencyInstance().format(propina)
}

@Preview(showBackground = true)
@Composable
fun TipTimeLayoutPreview() {
    MaterialTheme {
        TipTimeLayout()
    }
}
