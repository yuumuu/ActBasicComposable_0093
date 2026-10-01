package com.example.pawpertemuan3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TataLetakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen 1")
        Text(text = "Komponen 2")
        Text(text = "Komponen 3")
    }
}

@Composable
fun TataLetakRow(modifier: Modifier) {}

@Composable
fun TataLetakBox(modifier: Modifier) {}

@Composable
fun TataLetakColumnRow(modifier: Modifier) {}

@Composable
fun TataLetakRowColumn(modifier: Modifier) {}

@Composable
fun TataLetakBoxColumnRow(modifier: Modifier) {

}
